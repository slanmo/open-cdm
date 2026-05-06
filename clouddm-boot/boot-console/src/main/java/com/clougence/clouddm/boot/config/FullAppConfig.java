package com.clougence.clouddm.boot.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootConfiguration
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@ComponentScan(value = { "com.clougence.clouddm.boot", "com.clougence.clouddm.init",//
                         "com.clougence.clouddm.console.web", "com.clougence.clouddm.console.web.*", //
                         "com.clougence.clouddm.comm.component.impl", "com.clougence.rdp.*" },//
        excludeFilters = { @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com\\.clougence\\.clouddm\\.init\\.boot\\..*") })
public class FullAppConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry registry) {
        registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
