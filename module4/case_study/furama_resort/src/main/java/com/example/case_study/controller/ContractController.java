package com.example.case_study.controller;

import com.example.case_study.model.contract.Contract;
import com.example.case_study.model.contract.ContractDetail;
import com.example.case_study.service.contract.IAttachFacilityService;
import com.example.case_study.service.contract.IContractDetailService;
import com.example.case_study.service.contract.IContractService;
import com.example.case_study.service.customer.ICustomerService;
import com.example.case_study.service.employee.IEmployeeService;
import com.example.case_study.service.facility.IFacilityService;
import com.example.case_study.service.facility.IFacilityTypeService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("contract")
public class ContractController {

    final
    IContractDetailService contractDetailService;

    final
    ICustomerService customerService;

    final
    IContractService contractService;

    final
    IAttachFacilityService attachFacilityService;

    final
    IFacilityTypeService facilityTypeService;

    final
    IEmployeeService employeeService;

    public ContractController(IEmployeeService employeeService,IContractDetailService contractDetailService, IContractService contractService, IAttachFacilityService attachFacilityService,ICustomerService customerService,IFacilityTypeService facilityTypeService) {
        this.contractDetailService = contractDetailService;
        this.contractService = contractService;
        this.attachFacilityService = attachFacilityService;
        this.customerService=customerService;
        this.facilityTypeService=facilityTypeService;
        this.employeeService =employeeService;
    }

    @GetMapping("")
    public String showList(Model model, @PageableDefault(page = 0, size = 3) Pageable pageable ) {
        model.addAttribute("contractList", contractService.showListContract(pageable));
        model.addAttribute("attachFacilityList",attachFacilityService.findAll());
        model.addAttribute("contractDetail",new ContractDetail());
//        model.addAttribute("getAttachFacilityList",contractService.getAttachFacility());
        return "contract/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("contract", new Contract());
        model.addAttribute("customerList",customerService.findAll());
        model.addAttribute("facilityList",facilityTypeService.findAll());
        model.addAttribute("employeeList",employeeService.findAll());
        return "contract/create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Contract contract, RedirectAttributes redirectAttributes){
        contractService.save(contract);
        redirectAttributes.addFlashAttribute("mess","Thêm mới thành công");
        return "redirect:/contract/create";
    }
}
