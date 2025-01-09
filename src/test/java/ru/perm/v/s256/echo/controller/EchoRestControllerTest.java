package ru.perm.v.s256.echo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(EchoRestController.class)
class EchoRestControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void echoTest() throws Exception {
        MvcResult result = mockMvc.perform(get("/echo/"))
                .andExpect(status().isOk())
                .andReturn();

        assertEquals("Echo", result.getResponse().getContentAsString());
    }

    /**
     * Тест WEB GET запроса
     */
    @Test
    void notFoundException() throws Exception {
        mockMvc.perform(get("/echoBAD/"))
                .andExpect(status().is(HttpStatus.NOT_FOUND.value()));
    }
}
