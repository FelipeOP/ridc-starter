package com.sgd.ridc.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sgd.ridc.service.RidcService;
import com.sgd.ridc.service.RidcServiceImpl;

import lombok.AllArgsConstructor;
import oracle.stellent.ridc.IdcClientException;

@Configuration
@ConditionalOnClass(RidcService.class)
@EnableConfigurationProperties(RidcProperties.class)
@AllArgsConstructor
public class RidcAutoConfiguration {

    private final RidcProperties[] ridcProperties;

    @Bean
    @ConditionalOnMissingBean
    RidcService ridcService() throws IdcClientException {
        return new RidcServiceImpl(ridcProperties[0]);
    }
}
