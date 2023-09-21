package com.cardonamaturana.assigneems.infrastructure.api.mapper.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.pragmatico.PragmaticoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PragmaticoResponseMapper {

  PragmaticoResponse toDto(Pragmatico pragmatico);

}
