package com.cardonamaturana.assigneems;

import com.cardonamaturana.assigneems.infrastructure.api.controller.CompanyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AssigneeMsApplication {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(AssigneeMsApplication.class, args);
    new InsertFirstRegisters(context.getBean(CompanyController.class)).initialize();

  }

}
