package com.neb.springBoot;

import com.neb.springBoot.controller.HellowWorldController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.equalTo;

/**
 * Copyright: Copyright (c) 2019  zteits
 *
 * @ClassName: HelloTests
 * @Description:
 * @version: v1.0.0
 * @author: niueb
 * @date: 2019/12/30 14:36
 * Modification History:
 * Date             Author          Version            Description
 * ---------------------------------------------------------*
 * 2019/12/30       niueb           v1.0.0               创建
 */
@SpringBootTest
public class HelloTests {

    private MockMvc mvc;

    @BeforeEach
    public void setUp(){
        mvc = MockMvcBuilders.standaloneSetup(new HellowWorldController()).build();
    }

    @Test
    public void getHello() throws Exception{
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello World")));
    }

    @Test
    public void test(){

    }
}
