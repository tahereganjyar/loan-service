package com.tata.lon.loan_service.service;

import com.tata.lon.loan_service.service.entity.ContractEntity;
import com.tata.lon.loan_service.service.entity.PaymentEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {


    public ContractServiceImpl() {

        System.out.println("*****************************************************************************");
        System.out.println("********************** contract service initialized !!! *********************");
        System.out.println("*****************************************************************************");


    }

    @Override
    public List<ContractEntity> getAllContracts() {
        //
        ContractEntity contractEntity1 = new ContractEntity();
        contractEntity1.setContractNumber("004");
        contractEntity1.setId(4L);
        PaymentEntity paymentEntity1 = new PaymentEntity();
        paymentEntity1.setAmount("400");
        paymentEntity1.setId(4L);
        contractEntity1.setPaymentEntity(paymentEntity1);
        ContractEntity contractEntity2 = new ContractEntity();
        contractEntity2.setContractNumber("005");
        contractEntity2.setId(5L);
        PaymentEntity paymentEntity2 = new PaymentEntity();
        paymentEntity2.setAmount("500");
        paymentEntity2.setId(5L);
        contractEntity2.setPaymentEntity(paymentEntity2);
        //
        List<ContractEntity> contracts = new ArrayList<>();
        contracts.add(contractEntity1);
        contracts.add(contractEntity2);

        return contracts;
    }
}
