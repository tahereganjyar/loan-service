package com.tata.lon.loan_service.service;

import com.tata.lon.loan_service.service.entity.ContractEntity;
import com.tata.lon.loan_service.service.entity.PaymentEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final ContractService contractService;

    public PaymentServiceImpl(ContractService contractService) {
        this.contractService = contractService;

        System.out.println("*****************************************************************************");
        System.out.println("********************** payment service initialized !!! *********************");
        System.out.println("*****************************************************************************");


    }

    @Override
    public List<PaymentEntity> getAllValidPayments() {


        List<ContractEntity> contracts = contractService.getAllContracts();
        if (contracts.isEmpty())
            throw new RuntimeException("contract list is empty");

        List<PaymentEntity> payments = new ArrayList<>();
        for (ContractEntity contract : contracts) {
            PaymentEntity paymentEntity = contract.getPaymentEntity();

            if (checkPaymentAmount(Integer.parseInt(paymentEntity.getAmount())))
                payments.add(contract.getPaymentEntity());

        }

        return payments;
    }

    @Override
    public PaymentEntity getPaymentByyId(Long paymentId) {
        return null;
    }

    @Override
    public boolean checkPaymentAmount(int amount) {
        return amount > 100;
    }
}
