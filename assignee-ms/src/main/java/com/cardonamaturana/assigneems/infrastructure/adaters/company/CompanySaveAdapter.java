package com.cardonamaturana.assigneems.infrastructure.adaters.company;

import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.domain.service.company.CompanySaveService;
import com.cardonamaturana.assigneems.infrastructure.repository.company.CompanyMapper;
import com.cardonamaturana.assigneems.infrastructure.repository.company.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class CompanySaveAdapter implements CompanySaveService {

  private final CompanyRepository companyRepository;
  private final CompanyMapper companyMapper;

  @Override
  public Mono<Company> save(Company company) {
    return companyRepository.save(companyMapper.toDto(company))
        .map(companyMapper::toEntity);
  }
}
