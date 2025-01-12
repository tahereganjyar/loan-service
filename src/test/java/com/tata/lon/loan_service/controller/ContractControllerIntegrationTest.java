//package com.tata.lon.loan_service.controller;
//
//import com.tata.lon.loan_service.service.entity.ContractEntity;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.test.web.server.LocalServerPort;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//class ContractControllerIntegrationTest {
//
//
//    @LocalServerPort
//    private int port;
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    @Test
//    void getContractByIdTest() {
//        ContractEntity forObject = this.restTemplate.getForObject("http://localhost:" + port + "/api/contracts/1",
//                ContractEntity.class);
//        assertNotNull(forObject);
//
//    }
//}