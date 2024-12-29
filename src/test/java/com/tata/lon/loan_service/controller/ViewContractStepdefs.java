package com.tata.lon.loan_service.controller;

import com.tata.lon.loan_service.service.entity.ContractEntity;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ViewContractStepdefs extends ContractControllerCucumberTest{


    private int contractId;

    @Given("user go to contract list pae")
    public void userGoToContractListPae() {

        System.out.println("user is in contract list page!!!");
    }

    @When("user select a contract with id {int}")
    public void userSelectAContractWithId(int contractId) {

        System.out.println("user selected a row with contract id="+contractId);

    }

    @Then("user see a contract info successfully")
    public void userSeeAContractInfoSuccessfully() {

        ContractEntity forObject = this.restTemplate.getForObject("http://localhost:" + port + "/api/contracts/1",
                ContractEntity.class);
        assertNotNull(forObject);

    }
}
