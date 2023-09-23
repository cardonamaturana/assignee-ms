package com.cardonamaturana.assigneems.application.company;

import com.cardonamaturana.assigneems.application.company.process.CompanyProcess;
import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.domain.service.company.CompanySaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CompanyUpdateApplication {

  private final CompanySaveService companySaveService;
  private final CompanyProcess companyProcess;

  public Mono<Company> update(Company company) {
    return companyProcess.validateForUpdate(company)
        .then(companySaveService.save(company));
  }

}
