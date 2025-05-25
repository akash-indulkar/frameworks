package com.akash.SPRINGDATAJPA_EXAMPLE;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration //@Configuration tells Spring this class contains configuration beans.
public class CorsConfig implements WebMvcConfigurer { //WebMvcConfigurer is an interface you implement to customize Spring MVC's behavior (including CORS).

    @Override
    public void addCorsMappings(CorsRegistry registry) { //You override the addCorsMappings method to register CORS mappings. CorsRegistry is provided by Spring MVC and lets you define which URL paths support CORS and how.
        registry.addMapping("/**")  // .addMapping("/**") means the CORS configuration applies to all URL paths in your application.
                .allowedOrigins("*") // .allowedOrigins("*") means any origin (any domain) is allowed to make cross-origin requests.
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") //.allowedMethods(...) specifies which HTTP methods are allowed for cross-origin requests.
                .allowedHeaders("*"); //.allowedHeaders("*") means all headers sent by the client are allowed. This includes headers like Content-Type, Authorization, and custom headers.
    }
}

//If you enable http.cors() in your Spring Security configuration and provide a proper CorsConfigurationSource bean in the same config class, then you do NOT need a separate @Configuration class implementing WebMvcConfigurer for CORS like this.