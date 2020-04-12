package io.codehooks.pms.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;


@Data
@Document(collection = "USER_ACCOUNT")
public class UserAccount {

    @MongoId(FieldType.OBJECT_ID)
    private String id;
    @Field(value = "USER_NAME")
    private String userName;
    @Field(value = "PASSWORD")
    private String password;
    @Field(value = "EMAIL")
    private String email;
    @Field(value = "IS_MANAGER")
    private boolean isManager;
    @Field(value = "FIRST_NAME")
    private String firstName;
    @Field(value = "LAST_NAME")
    private String lastName;
    @Field(value = "REGISTRATION_TIME")
    private Date registrationTime;
}
