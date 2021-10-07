package com.StitchLine.StitchLineServer.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
@EnableWebMvc
//@CrossOrigin
class WebConfig : WebMvcConfigurer {
    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
                .allowedOrigins("http:/localhost:4200", "http:/localhost:27017", "http:/localhost:8000", "http:/localhost:63342", "http:/localhost:8080" )
    }
}