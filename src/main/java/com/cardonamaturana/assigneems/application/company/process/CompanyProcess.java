package com.cardonamaturana.assigneems.application.company.process;


import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.domain.service.company.CompanyIsExistByIdService;
import com.cardonamaturana.assigneems.shared.exceptions.base.assignee.CompanyNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class CompanyProcess {

  private final CompanyIsExistByIdService companyIsExistByIdService;

  public Mono<Void> validateForUpdate(Company company) {
    return companyIsExistByIdService.isExistById(company.getId()).flatMap(result -> {
      if (!result) {
        return Mono.error(new CompanyNotFoundException());
      }
      return Mono.empty();
    });
  }

}
