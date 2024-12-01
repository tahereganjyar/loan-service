package com.tata.lon.loan_service.repository;

import com.tata.lon.loan_service.service.entity.ContractEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
class ContractRepositoryTest {


    @Autowired
    private ContractRepository contractRepository;

    @Test
    void givenValidContractId_whenFindContractById_thenReturnContractSuccessfully() {

        //Given
        Long contractId = 1L;

        //When
        Optional<ContractEntity> contract = contractRepository.findById(contractId);

        //Then
        Assertions.assertTrue(contract.isPresent());
        ContractEntity contractEntity = contract.get();
        Assertions.assertEquals(contractId, contractEntity.getId());

    }


    @Test
    void givenInvalidContractId_whenFindContractById_thenReturnEmptySuccessfully() {

        //Given
        Long contractId = 10L;

        //When
        Optional<ContractEntity> contract = contractRepository.findById(contractId);

        //Then
        Assertions.assertTrue(contract.isEmpty());

    }
    @Test
    void givenNewValidContractWithoutPayment_whenSaveContract_thenReturnContractSuccessfully() {

        //Given
        ContractEntity contractEntity = new ContractEntity();
        contractEntity.setPaymentEntity(null);
        contractEntity.setContractNumber("010");
        contractEntity.setId(10L);

        //When
        ContractEntity savedContract = contractRepository.save(contractEntity);

        //Then
        Assertions.assertNotNull(savedContract);
        Assertions.assertNotNull(savedContract.getId());
        Assertions.assertEquals(10L,savedContract.getId());
        Optional<ContractEntity> newContract = contractRepository.findById(contractEntity.getId());
        Assertions.assertTrue(newContract.isPresent());
        Assertions.assertEquals(savedContract.getId(),newContract.get().getId());

    }
}