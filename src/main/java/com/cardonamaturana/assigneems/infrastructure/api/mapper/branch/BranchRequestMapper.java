package com.cardonamaturana.assigneems.infrastructure.api.mapper.branch;

import com.cardonamaturana.assigneems.domain.entity.Branch;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.branch.BranchRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BranchRequestMapper {

  Branch toEntity(BranchRequest branchRequest);

}
