package io.codehooks.pms.mapper;


import io.codehooks.pms.dto.EmployeeDto;
import io.codehooks.pms.entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {


    public EmployeeDto fromEmployee(Employee employee);

    public Employee fromEmployeeDto(EmployeeDto dto);
}
