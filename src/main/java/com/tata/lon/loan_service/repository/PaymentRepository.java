package com.tata.lon.loan_service.repository;

import com.tata.lon.loan_service.service.entity.ContractEntity;
import com.tata.lon.loan_service.service.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity,Long> {

    @Override
    Optional<PaymentEntity> findById(Long paymentId);
}
