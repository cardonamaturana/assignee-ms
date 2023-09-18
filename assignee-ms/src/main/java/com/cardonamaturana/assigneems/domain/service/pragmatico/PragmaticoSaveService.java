package com.cardonamaturana.assigneems.domain.service.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import reactor.core.publisher.Mono;

public interface PragmaticoSaveService {

  Mono<Pragmatico> save(Pragmatico pragmatico);

}
