package com.cardonamaturana.assigneems.infrastructure.adaters.company;

import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.domain.service.company.CompanyGetByIdService;
import com.cardonamaturana.assigneems.infrastructure.repository.company.CompanyMapper;
import com.cardonamaturana.assigneems.infrastructure.repository.company.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CompanyGetByIdAdapter implements CompanyGetByIdService {

  private final CompanyRepository companyRepository;
  private final CompanyMapper companyMapper;

  @Override
  public Mono<Company> get(Mono<String> id) {
    return companyRepository.findById(id).map(companyMapper::toEntity);
  }
}
