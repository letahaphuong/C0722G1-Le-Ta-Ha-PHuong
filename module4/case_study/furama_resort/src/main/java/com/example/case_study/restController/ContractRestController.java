package com.example.case_study.restController;

import com.example.case_study.dto.contract.ContractView;
import com.example.case_study.service.contract.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("contracts")
@CrossOrigin("*")
public class ContractRestController {

    @Autowired
    IContractService contractService;

    @GetMapping()
    public ResponseEntity<List<ContractView>> showListContract() {
        List<ContractView> contractViewList = contractService.showListContracts();
        if (contractViewList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contractViewList, HttpStatus.OK);
    }
}
