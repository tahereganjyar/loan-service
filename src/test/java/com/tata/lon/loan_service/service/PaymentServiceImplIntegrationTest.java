package com.tata.lon.loan_service.service;

import com.tata.lon.loan_service.service.entity.PaymentEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PaymentServiceImplIntegrationTest {

    @Autowired
    private PaymentService paymentService;


    @Test
    void getPaymentByyIdTest() {

        PaymentEntity paymentByyId = paymentService.getPaymentByyId(1L);
        assertNotNull(paymentByyId);
    }
}