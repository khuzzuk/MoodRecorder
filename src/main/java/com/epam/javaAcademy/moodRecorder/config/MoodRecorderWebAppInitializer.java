package com.epam.javaAcademy.moodRecorder.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MoodRecorderWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
