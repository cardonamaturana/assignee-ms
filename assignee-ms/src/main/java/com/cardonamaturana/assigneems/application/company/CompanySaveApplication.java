package com.cardonamaturana.assigneems.application.company;

import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.domain.service.company.CompanySaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CompanySaveApplication {

  private final CompanySaveService companySaveService;

  public Mono<Company> save(Company company) {
    return companySaveService.save(company);
  }

}
