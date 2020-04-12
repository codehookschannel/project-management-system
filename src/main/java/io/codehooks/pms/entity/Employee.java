package io.codehooks.pms.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;


@Data
@Document(collection = "EMPLOYEE")
public class Employee {

    @MongoId(FieldType.OBJECT_ID)
    private String id;
    @Field(value = "EMP_CODE")
    private String employeeCode;
    @Field(value = "EMP_NAME")
    private String employeeName;
    @Field(value = "USER_ACT_ID")
    private String userAccountId;




}
