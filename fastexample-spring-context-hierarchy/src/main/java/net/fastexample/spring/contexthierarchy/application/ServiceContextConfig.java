package net.fastexample.spring.contexthierarchy.application;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"net.fastexample.spring.contexthierarchy.application"})
public class ServiceContextConfig {
}
