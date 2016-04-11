package com.epam.javaAcademy.moodRecorder.web;


import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.testng.annotations.Test;

public class HomeControllerTest {
    @Test
    public void testHomePage() throws Exception {
        HomeController controller = new HomeController();
        MockMvc mvc = MockMvcBuilders.standaloneSetup(controller).build();
        mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/home")).andExpect(MockMvcResultMatchers.view().name("home"));
    }
}
