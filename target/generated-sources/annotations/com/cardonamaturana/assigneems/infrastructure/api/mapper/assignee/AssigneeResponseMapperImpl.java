package com.cardonamaturana.assigneems.infrastructure.api.mapper.assignee;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.assignee.AssigneeResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-21T13:02:17-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class AssigneeResponseMapperImpl implements AssigneeResponseMapper {

    @Override
    public AssigneeResponse toDto(Assignee assignee) {
        if ( assignee == null ) {
            return null;
        }

        AssigneeResponse assigneeResponse = new AssigneeResponse();

        return assigneeResponse;
    }
}
