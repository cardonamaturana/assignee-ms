package com.cardonamaturana.assigneems.infrastructure.repository.branch;

import com.cardonamaturana.assigneems.domain.entity.Branch;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-18T00:49:23-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class BranchMapperImpl implements BranchMapper {

    @Override
    public Branch toEntity(BranchDto branchDto) {
        if ( branchDto == null ) {
            return null;
        }

        Branch.BranchBuilder<?, ?> branch = Branch.builder();

        branch.name( branchDto.getName() );
        branch.city( branchDto.getCity() );
        branch.address( branchDto.getAddress() );

        return branch.build();
    }

    @Override
    public BranchDto toDto(Branch branch) {
        if ( branch == null ) {
            return null;
        }

        BranchDto.BranchDtoBuilder<?, ?> branchDto = BranchDto.builder();

        branchDto.name( branch.getName() );
        branchDto.city( branch.getCity() );
        branchDto.address( branch.getAddress() );

        return branchDto.build();
    }
}
