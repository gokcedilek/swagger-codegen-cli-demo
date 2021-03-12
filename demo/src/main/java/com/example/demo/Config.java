package com.example.demo;

import com.baeldung.petstore.client.api.PetApi;
import com.baeldung.petstore.client.api.StoreApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
    @Bean
    @Scope("singleton")
    public PetApi petApi() { return new PetApi(); }

    @Bean
    @Scope("singleton")
    public StoreApi storeApi() { return new StoreApi(); }
}
