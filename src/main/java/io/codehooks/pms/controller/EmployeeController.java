package io.codehooks.pms.controller;

import io.codehooks.pms.dto.EmployeeDto;
import io.codehooks.pms.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping(value = "/msg") //employees/msg
    public String getMessage() {
        return "I am from Controller!!!";
    }

    @PostMapping
    public Object saveEmployee(@RequestBody EmployeeDto dto) {
        return service.save(dto);
    }

}
