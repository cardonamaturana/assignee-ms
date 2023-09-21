package com.cardonamaturana.assigneems.domain.service.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import reactor.core.publisher.Flux;

public interface PragmaticoGetAllService {

  Flux<Pragmatico> getAll();

}
