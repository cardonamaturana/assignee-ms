package com.cardonamaturana.assigneems.infrastructure.api.mapper.contributor;

import com.cardonamaturana.assigneems.domain.entity.Contributor;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.contributor.ContributorRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContributorRequestMapper {

  Contributor toEntity(ContributorRequest contributorRequest);

}
