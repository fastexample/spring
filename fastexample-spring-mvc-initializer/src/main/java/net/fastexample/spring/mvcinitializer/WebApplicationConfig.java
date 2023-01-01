package net.fastexample.spring.mvcinitializer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"net.fastexample.spring.mvcinitializer"})
public class WebApplicationConfig implements WebMvcConfigurer {

}
