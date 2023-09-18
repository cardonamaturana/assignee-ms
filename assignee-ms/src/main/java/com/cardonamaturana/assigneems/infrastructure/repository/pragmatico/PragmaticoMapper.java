package com.cardonamaturana.assigneems.infrastructure.repository.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PragmaticoMapper {

  Pragmatico toEntity(PragmaticoDto pragmaticoDto);

  PragmaticoDto toDto(Pragmatico pragmatico);

}
