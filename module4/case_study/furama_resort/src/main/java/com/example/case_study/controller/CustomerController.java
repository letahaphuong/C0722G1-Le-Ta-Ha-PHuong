package com.example.case_study.controller;

import com.example.case_study.dto.customer.CustomerDto;
import com.example.case_study.dto.customer.CustomerView;
import com.example.case_study.model.customer.Customer;
import com.example.case_study.service.customer.ICustomerService;
import com.example.case_study.service.customer.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    ICustomerService customerService;

    @Autowired
    ICustomerTypeService customerTypeService;

//    @GetMapping("")
//    public String showList(@RequestParam(defaultValue = "")String search , Model model, @PageableDefault(page = 0,size = 3)Pageable pageable){
//        Page<Customer> customerList = customerService.searchName(search,pageable);
//        model.addAttribute("customerList",customerList);
//        return "customer/list";
//    }

    @GetMapping("/used-by-customers")
    public String showListUsedByCustomers(@RequestParam(defaultValue = "") String searchByName
            , @RequestParam(defaultValue = "") String email
            , @RequestParam(defaultValue = "") String customerType
            , Model model, @PageableDefault(page = 0, size = 3) Pageable pageable){
        model.addAttribute("UsedByCustomerList",customerService.showListUsedByCustomer(searchByName,email,customerType,pageable));

        model.addAttribute("customerTypes", customerTypeService.findAll());
        model.addAttribute("searchByName", searchByName);
        model.addAttribute("email", email);
        if (!customerType.isEmpty()) {
            model.addAttribute("customerTypeId", Integer.parseInt(customerType));
        }
        return "customer/used-by-customer";
    }

    @GetMapping("")
    public String showViewDto(
            @RequestParam(defaultValue = "") String searchByName
            , @RequestParam(defaultValue = "") String email
            , @RequestParam(defaultValue = "") String customerType
            , Model model, @PageableDefault(page = 0, size = 3) Pageable pageable) {
        Page<CustomerView> customerViews = customerService.searchView(searchByName, email, customerType, pageable);
        model.addAttribute("customerTypes", customerTypeService.findAll());
        model.addAttribute("customerList", customerViews);
        model.addAttribute("searchByName", searchByName);
        model.addAttribute("email", email);
        if (!customerType.isEmpty()) {
            model.addAttribute("customerTypeId", Integer.parseInt(customerType));
        }
        return "customer/list";
    }

//    @GetMapping("")
//    public String showViewDto(@RequestParam(defaultValue = "") String search,Model model,@PageableDefault(page = 0,size = 3)Pageable pageable){
//        Page<CustomerView> customerViews = customerService.searchView(search,pageable);
//        model.addAttribute("customerTypes",customerTypeService.findAll());
//        model.addAttribute("customerList",customerViews);
//        return "customer/list";
//    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        model.addAttribute("customerTypes", customerTypeService.findAll());
        return "/customer/edit";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable("id") Long id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        model.addAttribute("customerTypes", customerTypeService.findAll());
        return "/customer/detail";
    }

    @PostMapping("/update")
    public String update(@Validated @ModelAttribute("customer") CustomerDto customerDto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        model.addAttribute("customerTypes", customerTypeService.findAll());
        new CustomerDto().validate(customerDto, bindingResult);
        if (bindingResult.hasErrors()) {
            return "customer/edit";
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto, customer);
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("mess", "Edit SussesFully");
        return "redirect:/customer";
    }

//    @PostMapping("/update")
//    public String update(@Validated @ModelAttribute("customer") Customer customer, RedirectAttributes redirectAttributes){
//        customerService.save(customer);
//        redirectAttributes.addFlashAttribute("mess","Edit SussesFully");
//        return "redirect:/customer";
//    }

    @GetMapping("/show-list-create")
    public String showFormCreate(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("customerTypes", customerTypeService.findAll());
        return "/customer/create";
    }

    @PostMapping("/save")
    public String save(@Validated @ModelAttribute("customer") CustomerDto customerDto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        model.addAttribute("customerTypes", customerTypeService.findAll());
        new CustomerDto().validate(customerDto, bindingResult);
        if (bindingResult.hasErrors()) {
            return "customer/create";
        }
        Customer customer = new Customer();

        BeanUtils.copyProperties(customerDto, customer);
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("mess", "Create new customer SussesFully");
        return "redirect:/customer";
    }

//    @PostMapping("/save")
//    public String save(@ModelAttribute("customer")Customer customer,RedirectAttributes redirectAttributes){
//        customerService.save(customer);
//        redirectAttributes.addFlashAttribute("mess","Create new customer SussesFully");
//        return "redirect:/customer";
//    }

    @PostMapping("/delete")
    public String delete(@RequestParam Long id, RedirectAttributes redirectAttributes) {
        customerService.removeFlag(id);
        redirectAttributes.addFlashAttribute("mess", "Delete is finned");
        return "redirect:/customer";
    }
}
