package com.niit.bej.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouterConfiguration {
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes().build();
//                .route(p -> p.path("/userauth/**").uri("lb://eurekaAuthClient"))
//                .route(p -> p.path("/usertodo/**").uri("lb://eurekaToDoClient"))
//                .route(p -> p.path("/usernotification/**").uri("lb://notificationserverclient"))


    }
}
