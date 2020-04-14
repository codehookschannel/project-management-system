package io.codehooks.pms.service.impl;

import io.codehooks.pms.dao.EmployeeRepository;
import io.codehooks.pms.dto.EmployeeDto;
import io.codehooks.pms.entity.Employee;
import io.codehooks.pms.mapper.EmployeeMapper;
import io.codehooks.pms.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;
    @Autowired
    private EmployeeMapper mapper;

    @Override
    public EmployeeDto save(EmployeeDto employeeDto) {
        Employee employee = mapper.fromEmployeeDto(employeeDto);
        employee = repository.save(employee);
        return mapper.fromEmployee(employee);
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public EmployeeDto update(EmployeeDto employeeDto) {
        return null;
    }

    @Override
    public List<EmployeeDto> getAll() {
        return null;
    }
}
