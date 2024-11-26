package com.tata.lon.loan_service.controller;


import com.tata.lon.loan_service.service.entity.ContractEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contracts")
public class ContractController {


    @GetMapping("/{contractId}")
    public ContractEntity getContractById(@PathVariable Long contractId) {

        ContractEntity contractEntity = new ContractEntity();
        contractEntity.setId(1L);
        contractEntity.setContractNumber("0001");

        return contractEntity;
    }

    public ContractController() {

        System.out.println("*****************************************************************************");
        System.out.println("******************** contract controller initialized !!! ********************");
        System.out.println("*****************************************************************************");
    }
}
