package org.wz.gulimail.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.cors.reactive.CorsWebFilter;

import java.util.Collections;
import java.util.List;

@Configuration
public class GulimailCorsConfiguration {

    @Bean
    public CorsWebFilter corsWebFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        CorsConfiguration corsConfiguration = new CorsConfiguration();
        List<String> strings = Collections.singletonList("*");
        //允许头
        corsConfiguration.setAllowedHeaders(strings);
        //允许方法
        corsConfiguration.setAllowedMethods(strings);
        //允许源
        corsConfiguration.setAllowedOriginPatterns(strings);
        //允许带cookie
        corsConfiguration.setAllowCredentials(true);
        //匹配路径
        source.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsWebFilter(source);
    }
}
