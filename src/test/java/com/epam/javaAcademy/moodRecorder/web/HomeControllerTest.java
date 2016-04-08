package com.epam.javaAcademy.moodRecorder.web;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HomeControllerTest {
    @Test
    public void testHomePage() throws Exception {
        HomeController controller = new HomeController();
        assertEquals("home", controller.home());
    }
}
