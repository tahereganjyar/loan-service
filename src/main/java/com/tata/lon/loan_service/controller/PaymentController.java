package com.tata.lon.loan_service.controller;


import com.tata.lon.loan_service.service.PaymentService;
import com.tata.lon.loan_service.service.entity.PaymentEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {


    private final PaymentService paymentService;


    @GetMapping("/{paymentId}")
    public PaymentEntity getPaymentById(@PathVariable Long paymentId) {


         return paymentService.getPaymentByyId(paymentId);


    }

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;

        System.out.println("*****************************************************************************");
        System.out.println("******************** payment controller initialized !!! *********************");
        System.out.println("*****************************************************************************");
    }
}
