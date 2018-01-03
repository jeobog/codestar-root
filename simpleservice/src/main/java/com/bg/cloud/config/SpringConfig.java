package com.bg.cloud.config;

import com.bg.cloud.ModelMapperFactory;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by bosun on 1/3/18.
 */
@Configuration
@ComponentScan(value = "com.bg.cloud")
public class SpringConfig {

    @Bean
    public ModelMapper modelMapper(ModelMapperFactory modelMapperFactory) {
        return modelMapperFactory.modelMapperBuilder();
    }
}
