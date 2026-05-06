package com.clougence.rdp.component.jwtsession;

import org.apache.tomcat.util.http.Rfc6265CookieProcessor;
import org.springframework.boot.tomcat.servlet.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CookieConfig {

    @Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> cookieProcessorCustomizer() {
        return (factory) -> {
            factory.addContextCustomizers((context) -> {
                context.setCookieProcessor(new Rfc6265CookieProcessor());
            });
        };
    }
}
