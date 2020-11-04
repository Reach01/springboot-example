package com.how2java.springboot.component.aspect;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class AspectConfig {

  @Bean
  public CostTimeAspect getCostTimeAspect(){
    return new CostTimeAspect();
  }

}
