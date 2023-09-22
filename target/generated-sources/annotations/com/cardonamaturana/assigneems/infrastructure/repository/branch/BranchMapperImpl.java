package com.cardonamaturana.assigneems.infrastructure.repository.branch;

import com.cardonamaturana.assigneems.domain.entity.Branch;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-22T09:35:21-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class BranchMapperImpl implements BranchMapper {

    @Override
    public Branch toEntity(BranchDto branchDto) {
        if ( branchDto == null ) {
            return null;
        }

        Branch branch = new Branch();

        branch.setId( branchDto.getId() );
        branch.setName( branchDto.getName() );
        branch.setCity( branchDto.getCity() );
        branch.setAddress( branchDto.getAddress() );

        return branch;
    }

    @Override
    public BranchDto toDto(Branch branch) {
        if ( branch == null ) {
            return null;
        }

        BranchDto branchDto = new BranchDto();

        branchDto.setId( branch.getId() );
        branchDto.setName( branch.getName() );
        branchDto.setCity( branch.getCity() );
        branchDto.setAddress( branch.getAddress() );

        return branchDto;
    }
}
