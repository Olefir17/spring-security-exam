package com.secure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * Created by Anastasia on 02.04.2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com")
public class WebAppConfig extends WebMvcConfigurerAdapter {

    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("pages/**").addResourceLocations("/pages");


    }

    @Bean
    public UrlBasedViewResolver setupViewResolver() {
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setPrefix("/pages/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);

        return resolver;
    }



}
