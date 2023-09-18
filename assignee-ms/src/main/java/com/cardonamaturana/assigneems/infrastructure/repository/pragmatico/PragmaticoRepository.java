package com.cardonamaturana.assigneems.infrastructure.repository.pragmatico;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PragmaticoRepository extends ReactiveMongoRepository<PragmaticoDto, String> {

}
