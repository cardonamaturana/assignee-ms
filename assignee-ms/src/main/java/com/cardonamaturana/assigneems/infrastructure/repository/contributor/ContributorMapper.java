package com.cardonamaturana.assigneems.infrastructure.repository.contributor;

import com.cardonamaturana.assigneems.domain.entity.Contributor;
import org.mapstruct.Mapper;

@Mapper
public interface ContributorMapper {

  Contributor toEntity(ContributorDto contributorDto);

  ContributorDto toDto(Contributor contributor);

}
