package com.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{
//    @Bean
//    public ClassLoaderTemplateResolver classLoaderTemplateResolver()
//    {
//        ClassLoaderTemplateResolver classLoaderTemplateResolver = new ClassLoaderTemplateResolver();
//        classLoaderTemplateResolver.setPrefix("templates/");
//        classLoaderTemplateResolver.setCacheable(false);
//        classLoaderTemplateResolver.setSuffix(".html");
//        classLoaderTemplateResolver.setTemplateMode("HTML5");
//        classLoaderTemplateResolver.setCharacterEncoding("UTF-8");
//
//        return classLoaderTemplateResolver;
//    }
//
//    @Bean
//    public SpringTemplateEngine springTemplateEngine()
//    {
//        SpringTemplateEngine springTemplateEngine = new SpringTemplateEngine();
//        springTemplateEngine.setTemplateResolver(classLoaderTemplateResolver());
//        return springTemplateEngine;
//    }
//
//    @Bean
//    public ViewResolver viewResolver()
//    {
//        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
//        viewResolver.setTemplateEngine(springTemplateEngine());
//        viewResolver.setCharacterEncoding("UTF-8");
//
//        return viewResolver;
//    }


}
