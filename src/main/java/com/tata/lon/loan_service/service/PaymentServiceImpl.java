package com.tata.lon.loan_service.service;

import com.tata.lon.loan_service.repository.PaymentRepository;
import com.tata.lon.loan_service.service.entity.ContractEntity;
import com.tata.lon.loan_service.service.entity.PaymentEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final ContractService contractService;
    private final PaymentRepository paymentRepository;

    public PaymentServiceImpl(ContractService contractService,PaymentRepository paymentRepository) {
        this.contractService = contractService;
        this.paymentRepository = paymentRepository;

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
        Optional<PaymentEntity> byId = paymentRepository.findById(paymentId);
        if (byId.isEmpty())
            throw new RuntimeException();
       return byId.get();
    }

    @Override
    public boolean checkPaymentAmount(int amount) {
        return amount > 100;
    }
}
