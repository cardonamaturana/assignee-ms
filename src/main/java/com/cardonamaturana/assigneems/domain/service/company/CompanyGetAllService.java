package com.cardonamaturana.assigneems.domain.service.company;

import com.cardonamaturana.assigneems.domain.entity.Company;
import reactor.core.publisher.Flux;

public interface CompanyGetAllService {

  Flux<Company> getAll();

}
