package com.tata.lon.loan_service.repository;

import com.tata.lon.loan_service.service.entity.ContractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContractRepository extends JpaRepository<ContractEntity,Long> {

    @Override
    Optional<ContractEntity> findById(Long contractId);
}
