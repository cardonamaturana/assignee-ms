package com.cardonamaturana.assigneems.domain.service.company;

import com.cardonamaturana.assigneems.domain.entity.Company;
import reactor.core.publisher.Mono;

public interface CompanyGetByIdService {

  Mono<Company> get(Mono<String> id);

}
