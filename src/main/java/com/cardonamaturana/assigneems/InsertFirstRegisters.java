package com.cardonamaturana.assigneems;

import com.cardonamaturana.assigneems.infrastructure.api.controller.CompanyController;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.company.CompanySaveRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InsertFirstRegisters {

  private final CompanyController companyController;

  public void initialize() {

    CompanySaveRequest companySaveRequest = new CompanySaveRequest();

    companySaveRequest.setCompanyName("Help Center");
    companySaveRequest.setNit("8587967554-9");
    companySaveRequest.setLocation("Av siempreviva");

    companyController.saveCompany(companySaveRequest);

    companySaveRequest.setCompanyName("Pragma");
    companySaveRequest.setNit("854781254-9");
    companySaveRequest.setLocation("Medellin");

    companyController.saveCompany(companySaveRequest);


  }
}
