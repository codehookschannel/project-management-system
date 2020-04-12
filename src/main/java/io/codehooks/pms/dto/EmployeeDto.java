package io.codehooks.pms.dto;

import lombok.Data;

@Data
public class EmployeeDto {

    private String id;
    private String employeeCode;
    private String employeeName;
    private UserAccountDto userAccount;
}
