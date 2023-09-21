package com.cardonamaturana.assigneems.domain.service.contributor;

import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import reactor.core.publisher.Mono;

public interface ContributorSaveService {

  Mono<Pragmatico> save(Pragmatico pragmatico);

}
