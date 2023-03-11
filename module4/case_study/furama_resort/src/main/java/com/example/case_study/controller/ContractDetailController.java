package com.example.case_study.controller;

import com.example.case_study.model.contract.ContractDetail;
import com.example.case_study.service.contract.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("contract-detail")
public class ContractDetailController {

    @Autowired
    IContractDetailService contractDetailService;


    @PostMapping("/create")
    public String createContractDetail(@ModelAttribute("contractDetail") ContractDetail contractDetail, RedirectAttributes redirectAttributes){
        contractDetailService.save(contractDetail);
        redirectAttributes.addFlashAttribute("mess","Hợp đồng chi tiết được đã được thêm mới");
        return "redirect:/contract";
    }
}
