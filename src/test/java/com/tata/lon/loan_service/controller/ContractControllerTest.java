package com.tata.lon.loan_service.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tata.lon.loan_service.service.entity.ContractEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(ContractController.class)
class ContractControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getContractByIdTest() throws Exception {


        System.out.println("*****************************************************************************");
        System.out.println("******************** getContractById test,Done !!! **************************");
        System.out.println("*****************************************************************************");

        //Given
        Long contractId = 3L;

        //When
        MvcResult mvcResult = mockMvc.perform(get("/api/contracts/" + contractId)
                .contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andReturn();
        ObjectMapper objectMapper = new ObjectMapper();
        ContractEntity contractEntity = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), ContractEntity.class);

        //Then
        assertNotNull(contractEntity.getId());
        assertEquals(contractEntity.getId(), 1L);
        assertEquals(contractEntity.getContractNumber(), "0001");

    }
}