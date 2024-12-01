package com.tata.lon.loan_service.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tata.lon.loan_service.service.PaymentService;
import com.tata.lon.loan_service.service.entity.PaymentEntity;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PaymentController.class)
class PaymentControllerTest {


    @Autowired
    private MockMvc mockMvc;


    @MockitoBean
    private PaymentService paymentService;

    @Test
    void getPaymentById() throws Exception {

        System.out.println("*****************************************************************************");
        System.out.println("********************* getPaymentById test,Done !!! **************************");
        System.out.println("*****************************************************************************");

        //Given
        Long paymentId = 3L;
        PaymentEntity paymentEntity1 = new PaymentEntity();
        paymentEntity1.setId(1L);
        paymentEntity1.setAmount("2000");
//        PaymentService mockPaymentService = Mockito.mock(PaymentService.class);
        Mockito.when(paymentService.getPaymentByyId(paymentId)).thenReturn(paymentEntity1);


        //When
        MvcResult mvcResult = mockMvc.perform(get("/api/payments/" + paymentId)
                .contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andReturn();
        ObjectMapper objectMapper = new ObjectMapper();
        PaymentEntity paymentEntity = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), PaymentEntity.class);

        //Then
        assertNotNull(paymentEntity.getId());
        assertEquals(paymentEntity.getId(), 1L);
        assertEquals(paymentEntity.getAmount(), "2000");



    }
}