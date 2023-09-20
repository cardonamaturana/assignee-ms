package com.cardonamaturana.assigneems.infrastructure.api.mapper.branch;

import com.cardonamaturana.assigneems.domain.entity.Branch;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.branch.BranchRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-20T00:05:51-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class BranchRequestMapperImpl implements BranchRequestMapper {

    @Override
    public Branch toEntity(BranchRequest branchRequest) {
        if ( branchRequest == null ) {
            return null;
        }

        Branch branch = new Branch();

        branch.setName( branchRequest.getName() );
        branch.setCity( branchRequest.getCity() );
        branch.setAddress( branchRequest.getAddress() );

        return branch;
    }
}
