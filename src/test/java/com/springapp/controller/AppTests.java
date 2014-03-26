package com.springapp.controller;

import com.springapp.domain.Function;
import com.springapp.domain.User;
import com.springapp.persistence.UserMapper;
import com.springapp.service.FunctionService;
import com.springapp.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class AppTests {
    private MockMvc mockMvc;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    protected WebApplicationContext wac;

    @Autowired
    private FunctionService functionService;

    @Autowired
    private UserMapper userDao;
    @Before
    public void setup() {
        this.mockMvc = webAppContextSetup(this.wac).build();
    }

    @Test
    public void simple() throws Exception {
        mockMvc.perform(get("/login.do").param("name", "lizichen").param("password", "123"))
                .andExpect(status().isOk())
                .andExpect(view().name("function"));
    }

    @Test
    public void testJoin() throws Exception{
        User user = userDao.getUser("lizichen");
        functionService.join(user,3);
    }

    @Test
    public void testGetFunction() throws Exception{
        Function function = functionService.getFunction(2);
        System.out.println("count" + function.getUsers().size());
    }
}
