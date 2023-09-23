package com.cardonamaturana.assigneems.domain.service.company;

import com.cardonamaturana.assigneems.domain.entity.Company;
import reactor.core.publisher.Mono;

public interface CompanySaveService {

  Mono<Company> save(Company company);

}
