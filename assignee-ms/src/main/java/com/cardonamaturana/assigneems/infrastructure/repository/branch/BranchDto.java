package com.cardonamaturana.assigneems.infrastructure.repository.branch;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.infrastructure.repository.AssigneeDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@SuperBuilder
@Document
public class BranchDto extends AssigneeDto {

    @Id
    private String id;
    private String name;
    private String city;
    private String address;

}