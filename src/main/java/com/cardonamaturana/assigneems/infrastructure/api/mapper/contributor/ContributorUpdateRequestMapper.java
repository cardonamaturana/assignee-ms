package com.cardonamaturana.assigneems.infrastructure.api.mapper.contributor;

import com.cardonamaturana.assigneems.domain.entity.Contributor;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.contributor.ContributorUpdateRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ContributorUpdateRequestMapper {

  @Mapping(target = "id", source = "contributorId")
  @Mapping(source = "companyId", target = "company.id")
  Contributor toEntity(ContributorUpdateRequest contributorUpdateRequest);

}
