//package com.tata.lon.loan_service.controller;
//
//import com.tata.lon.loan_service.service.entity.ContractEntity;
//import com.tata.lon.loan_service.service.entity.PaymentEntity;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.test.web.server.LocalServerPort;
//import org.springframework.test.context.jdbc.Sql;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//class PaymentControllerIntegrationTest {
//
//
//    @LocalServerPort
//    private int port;
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    @Test
//    void getPaymentByIdTest() {
//        PaymentEntity forObject = this.restTemplate.getForObject("http://localhost:" + port + "/api/payments/5",
//                PaymentEntity.class);
//        assertNotNull(forObject.getId());
//
//    }
//    @Test
//    @Sql(statements = "INSERT INTO PAYMENT_ENTITY (id,amount ) VALUES (5, 500)",
//            executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
//    @Sql(statements = "DELETE FROM PAYMENT_ENTITY WHERE id='5'", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
//    void getPaymentByIdSuccessfulTest() {
//        PaymentEntity forObject = this.restTemplate.getForObject("http://localhost:" + port + "/api/payments/5",
//                PaymentEntity.class);
//        assertNotNull(forObject.getId());
//        assertEquals("500",forObject.getAmount());
//
//    }
//
//
//}