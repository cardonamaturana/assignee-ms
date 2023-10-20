package com.cardonamaturana.assigneems.application.company;

import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.domain.service.company.CompanyGetAllService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class CompanyGetAllApplication {

  private final CompanyGetAllService companyGetAllService;

  public Flux<Company> getAll() {
    return companyGetAllService.getAll();
  }

}
