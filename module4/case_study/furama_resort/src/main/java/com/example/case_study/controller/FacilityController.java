package com.example.case_study.controller;

import com.example.case_study.dto.facility.FacilityDto;
import com.example.case_study.dto.facility.FacilityView;
import com.example.case_study.model.facility.Facility;
import com.example.case_study.service.facility.IFacilityService;
import com.example.case_study.service.facility.IFacilityTypeService;
import com.example.case_study.service.facility.IRentTypeService;
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
@RequestMapping("facility")
public class FacilityController {

    final
    IFacilityService facilityService;

    final
    IFacilityTypeService facilityTypeService;

    final
    IRentTypeService rentTypeService;

    public FacilityController(IFacilityService facilityService, IFacilityTypeService facilityTypeService, IRentTypeService rentTypeService) {
        this.facilityService = facilityService;
        this.facilityTypeService = facilityTypeService;
        this.rentTypeService = rentTypeService;
    }

    @GetMapping("")
    public String showList(@RequestParam(defaultValue = "") String facilityName
            , @RequestParam(defaultValue = "") String facilityTypes
            , Model model, @PageableDefault(page = 0, size = 3) Pageable pageable) {
        Page<FacilityView> facilities = facilityService.searchView(facilityName, facilityTypes, pageable);
        model.addAttribute("facilityList", facilities);
        model.addAttribute("facilityTypes", facilityTypeService.findAll());
        model.addAttribute("facilityName", facilityName);
        if (!facilityTypes.isEmpty()){
            model.addAttribute("facilityTypeIdShow",Integer.parseInt(facilityTypes));
        }
        return "facility/list";
    }

    @GetMapping("/show-list-create")
    public String showFormCreate(Model model) {
        model.addAttribute("facility", new Facility());
        model.addAttribute("facilityTypeList", facilityTypeService.findAll());
        model.addAttribute("rentTypeList", rentTypeService.findAll());
        return "facility/create";
    }

    @PostMapping("/save")
    public String saveFacility(@ModelAttribute Facility facility, RedirectAttributes redirectAttributes) {
        facilityService.save(facility);
        redirectAttributes.addFlashAttribute("mess", "Thêm mới thành công");
        return "redirect:/facility";
    }

    @GetMapping("/edit/{id}")
    public String showFormEdit(@PathVariable("id") Long id, Model model) {
        model.addAttribute("facility", facilityService.findById(id).get());
        model.addAttribute("facilityTypeList", facilityTypeService.findAll());
        model.addAttribute("rentTypeList", rentTypeService.findAll());
        return "facility/edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Facility facility, RedirectAttributes redirectAttributes) {
        facilityService.save(facility);
        redirectAttributes.addFlashAttribute("mess", "Sửa Thành Công!");
        return "redirect:/facility";
    }

    @GetMapping("detail/{id}")
    public String viewDetail(@PathVariable("id") Long id, Model model) {
        model.addAttribute("facility", facilityService.findById(id).get());
        model.addAttribute("facilityTypeList", facilityTypeService.findAll());
        model.addAttribute("rentTypeList", rentTypeService.findAll());
        return "facility/detail";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam Long id, RedirectAttributes redirectAttributes) {
        facilityService.removeFlag(id);
        redirectAttributes.addFlashAttribute("mess", "Xoá thành công");
        return "redirect:/facility";
    }
}
