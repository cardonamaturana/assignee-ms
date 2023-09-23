package com.cardonamaturana.assigneems.infrastructure.api.mapper.branch;

import com.cardonamaturana.assigneems.domain.entity.Branch;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.branch.BranchUpdateRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BranchUpdateRequestMapper {

  @Mapping(target = "id", source = "branchId")
  Branch toEntity(BranchUpdateRequest branchUpdateRequest);

}
