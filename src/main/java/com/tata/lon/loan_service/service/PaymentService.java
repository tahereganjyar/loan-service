package com.tata.lon.loan_service.service;

import com.tata.lon.loan_service.service.entity.PaymentEntity;

import java.math.BigDecimal;
import java.util.List;

public interface PaymentService {
    List<PaymentEntity> getAllValidPayments();
    PaymentEntity getPaymentByyId(Long paymentId);
    boolean checkPaymentAmount(int amount);




}
