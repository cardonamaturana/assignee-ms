package com.cardonamaturana.assigneems.infrastructure.adaters.company;

import com.cardonamaturana.assigneems.domain.service.company.CompanyIsExistByIdService;
import com.cardonamaturana.assigneems.infrastructure.repository.company.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class CompanyIsExistByIdAdapter implements CompanyIsExistByIdService {

  private final CompanyRepository companyRepository;

  @Override
  public Mono<Boolean> isExistById(String id) {
    return companyRepository.existsById(id);
  }
}
