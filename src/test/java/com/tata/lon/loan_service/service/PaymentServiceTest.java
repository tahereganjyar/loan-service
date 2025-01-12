//package com.tata.lon.loan_service.service;
//
//import com.tata.lon.loan_service.service.entity.ContractEntity;
//import com.tata.lon.loan_service.service.entity.PaymentEntity;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//@ExtendWith(MockitoExtension.class)
//class PaymentServiceTest {
//
//    @InjectMocks
//    private PaymentServiceImpl paymentService;
//    @Mock
//    private ContractService contractService;
//
//
//    @Test
//    void givenValidContracts_whenGetValidPayments_thenReturnValidPaymentsSuccessfully() {
//
//        //Given
//        //
//        ContractEntity contractEntity1 = new ContractEntity();
//        contractEntity1.setContractNumber("001");
//        contractEntity1.setId(1L);
//        PaymentEntity paymentEntity1 = new PaymentEntity();
//        paymentEntity1.setAmount("100");
//        paymentEntity1.setId(1L);
//        contractEntity1.setPaymentEntity(paymentEntity1);
//        ContractEntity contractEntity2 = new ContractEntity();
//        contractEntity2.setContractNumber("002");
//        contractEntity2.setId(2L);
//        PaymentEntity paymentEntity2 = new PaymentEntity();
//        paymentEntity2.setAmount("200");
//        paymentEntity2.setId(2L);
//        contractEntity2.setPaymentEntity(paymentEntity2);
//        //
//        List<ContractEntity> contracts = new ArrayList<>();
//        contracts.add(contractEntity1);
//        contracts.add(contractEntity2);
//        Mockito.when(contractService.getAllContracts()).thenReturn(contracts);
//
//        //When
//        List<PaymentEntity> allValidPayments = paymentService.getAllValidPayments();
//
//        //Then
//
//        assertEquals(1, allValidPayments.size(), "valid payments are ok!");
//
//    }
//
//    @Test
//    void givenEmptyContracts_whenGetValidPayments_thenThrowRuntimeException() {
//
//        //Given
//        Mockito.when(contractService.getAllContracts()).thenReturn(new ArrayList<>());
//
//
//        //When
//        Throwable exception = assertThrows(RuntimeException.class, () -> paymentService.getAllValidPayments());
//
//        //Then
//        assertEquals("contract list is empty", exception.getMessage());
//
//
//    }
//
//    @Test
//    void getPaymentById() {
//
//        //Given
//        //
//        ContractEntity contractEntity1 = new ContractEntity();
//        contractEntity1.setContractNumber("001");
//        contractEntity1.setId(1L);
//        PaymentEntity paymentEntity1 = new PaymentEntity();
//        paymentEntity1.setAmount("100");
//        paymentEntity1.setId(1L);
//        contractEntity1.setPaymentEntity(paymentEntity1);
//        ContractEntity contractEntity2 = new ContractEntity();
//        contractEntity2.setContractNumber("002");
//        contractEntity2.setId(2L);
//        PaymentEntity paymentEntity2 = new PaymentEntity();
//        paymentEntity2.setAmount("200");
//        paymentEntity2.setId(2L);
//        contractEntity2.setPaymentEntity(paymentEntity2);
//        //
//        List<ContractEntity> contracts = new ArrayList<>();
//        contracts.add(contractEntity1);
//        contracts.add(contractEntity2);
//        Mockito.when(contractService.getAllContracts()).thenReturn(contracts);
//
//
//        //When
//
//        //Then
//
//        List<PaymentEntity> allValidPayments = paymentService.getAllValidPayments();
//        assertEquals(1, allValidPayments.size(), "valid payments are ok!");
//
//    }
//}