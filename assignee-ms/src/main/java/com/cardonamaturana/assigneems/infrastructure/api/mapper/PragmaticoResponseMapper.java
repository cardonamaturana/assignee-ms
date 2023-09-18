package com.cardonamaturana.assigneems.infrastructure.api.mapper;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.pragmatico.PragmaticoResponse;
import org.mapstruct.Mapper;

@Mapper
public interface PragmaticoResponseMapper {

  PragmaticoResponse toDto(Assignee assignee);

}
