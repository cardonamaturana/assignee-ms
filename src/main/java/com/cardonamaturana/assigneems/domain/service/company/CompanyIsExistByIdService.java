package com.cardonamaturana.assigneems.domain.service.company;

import reactor.core.publisher.Mono;

public interface CompanyIsExistByIdService {

  Mono<Boolean> isExistById(String id);

}
