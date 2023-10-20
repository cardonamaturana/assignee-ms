package com.cardonamaturana.assigneems.infrastructure.api.mapper.branch;

import com.cardonamaturana.assigneems.domain.entity.Branch;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.branch.BranchResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BranchResponseMapper {

  BranchResponse toDto(Branch branch);

}
