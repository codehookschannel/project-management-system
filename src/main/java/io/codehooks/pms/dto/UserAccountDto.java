package io.codehooks.pms.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserAccountDto {

    private String id;
    private String userName;
    private String password;
    private String email;
    private boolean isManager;
    private String firstName;
    private String lastName;
    private Date registrationTime;
}
