package com.cardonamaturana.assigneems.infrastructure.repository.branch;

import com.cardonamaturana.assigneems.domain.entity.Branch;
import org.mapstruct.Mapper;

@Mapper
public interface BranchMapper {

  Branch toEntity(BranchDto branchDto);

  BranchDto toDto(Branch branch);

}
