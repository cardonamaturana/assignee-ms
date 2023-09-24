package com.cardonamaturana.assigneems.infrastructure.adaters.company;

import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.domain.service.company.CompanyGetAllService;
import com.cardonamaturana.assigneems.infrastructure.repository.company.CompanyMapper;
import com.cardonamaturana.assigneems.infrastructure.repository.company.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class CompanyGetAllAdapter implements CompanyGetAllService {

  private final CompanyRepository companyRepository;
  private final CompanyMapper companyMapper;

  @Override
  public Flux<Company> getAll() {
    return companyRepository.findAll().map(companyMapper::toEntity);
  }
}
