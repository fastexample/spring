package net.fastexample.spring.contexthierarchy.web;

import net.fastexample.spring.contexthierarchy.web.util.ViewBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("net.fastexample.spring.contexthierarchy.web")
public class WebApplicationConfig implements WebMvcConfigurer {

    @Bean
    ViewBean viewBean() {
        return new ViewBean();
    }
}
