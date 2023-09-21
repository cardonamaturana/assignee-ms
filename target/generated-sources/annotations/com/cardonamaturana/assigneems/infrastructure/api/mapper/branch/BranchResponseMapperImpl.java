package com.cardonamaturana.assigneems.infrastructure.api.mapper.branch;

import com.cardonamaturana.assigneems.domain.entity.Branch;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.branch.BranchResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-21T18:17:56-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class BranchResponseMapperImpl implements BranchResponseMapper {

    @Override
    public BranchResponse toDto(Branch branch) {
        if ( branch == null ) {
            return null;
        }

        BranchResponse branchResponse = new BranchResponse();

        branchResponse.setId( branch.getId() );
        branchResponse.setName( branch.getName() );
        branchResponse.setCity( branch.getCity() );
        branchResponse.setAddress( branch.getAddress() );

        return branchResponse;
    }
}
