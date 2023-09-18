package com.cardonamaturana.assigneems.infrastructure.api.mapper;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.pragmatico.PragmaticoRequest;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.pragmatico.PragmaticoResponse;
import org.mapstruct.Mapper;

@Mapper
public interface PragmaticoRequestMapper {

  Pragmatico toEntity(PragmaticoRequest pragmaticoRequest);

}
