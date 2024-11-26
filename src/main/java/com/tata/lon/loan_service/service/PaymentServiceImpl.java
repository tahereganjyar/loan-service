package com.tata.lon.loan_service.service;

import com.tata.lon.loan_service.service.entity.PaymentEntity;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {


    public PaymentServiceImpl() {

        System.out.println("*****************************************************************************");
        System.out.println("********************** payment service initialized !!! *********************");
        System.out.println("*****************************************************************************");


    }

    @Override
    public PaymentEntity getPaymentById(Long paymentId) {

//        PaymentEntity paymentEntity = new PaymentEntity();
//        paymentEntity.setId(1L);
//        paymentEntity.setAmount("2000");
//        return paymentEntity;
        return null;
    }
}
