package com.tavvi.tavvi.test.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(TestController.class)
@AutoConfigureMockMvc(addFilters = false)   // Spring Security 필터 비활성화
class TestControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void testReturnValue() throws Exception {
        mockMvc.perform(get("/test/1"))
                .andExpect(status().isOk())
                .andExpect(content().string("테스트 성공입니다."));
    }
}
