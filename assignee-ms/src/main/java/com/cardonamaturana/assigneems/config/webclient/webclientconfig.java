package com.cardonamaturana.assigneems.config.webclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class webclientconfig {

  @Bean
  public WebClient.Builder webClientBuilder() {
    return WebClient.builder();
  }


}
