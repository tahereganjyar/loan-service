package com.tata.lon.loan_service.controller;

import com.tata.lon.loan_service.service.entity.ContractEntity;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")
@CucumberContextConfiguration
@SpringBootTest(webEnvironment =  SpringBootTest.WebEnvironment.RANDOM_PORT)
class ContractControllerCucumberTest {


    @LocalServerPort
    protected int port;

    @Autowired
    protected TestRestTemplate restTemplate;
//
//    @Test
//    void getContractByIdTest() {
//        ContractEntity forObject = this.restTemplate.getForObject("http://localhost:" + port + "/api/contracts/1",
//                ContractEntity.class);
//        assertNotNull(forObject);
//
//    }
//
//
//    @Test
//    void getContractById() {
//    }
}