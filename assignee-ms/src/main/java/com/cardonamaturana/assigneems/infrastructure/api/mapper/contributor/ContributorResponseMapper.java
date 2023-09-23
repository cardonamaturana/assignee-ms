package com.cardonamaturana.assigneems.infrastructure.api.mapper.contributor;

import com.cardonamaturana.assigneems.domain.entity.Contributor;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.contributor.ContributorResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContributorResponseMapper {

  ContributorResponse toDto(Contributor contributor);

}
