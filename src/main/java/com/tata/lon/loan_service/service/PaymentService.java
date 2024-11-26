package com.tata.lon.loan_service.service;

import com.tata.lon.loan_service.service.entity.PaymentEntity;

public interface PaymentService {
    PaymentEntity getPaymentById(Long paymentId);
}
