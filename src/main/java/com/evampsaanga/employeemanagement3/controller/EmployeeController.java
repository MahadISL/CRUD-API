package com.evampsaanga.employeemanagement3.controller;

import com.evampsaanga.employeemanagement3.model.EmployeeData2;
import com.evampsaanga.employeemanagement3.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    //autowire the EmployeeService class
    @Autowired
    EmployeeService employeeService;

    //Create a Get mapping that retrieves all the employees details from the database
    @GetMapping("/employee")
    private List<EmployeeData2> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    //Create a Get mapping that retrieves a specific employee details from the database
    @GetMapping("/employee/{id}")
    private EmployeeData2 getEmployee(@PathVariable("id") int id){
        return employeeService.getEmployee(id);
    }

    //Create a Delete mapping that deletes a specific employee from database
    @DeleteMapping("/employeed/{id}")
    private void deleteEmployee(@PathVariable("id") int id){
        employeeService.deleteEmployee(id);
    }

    //Creating post mapping that post the employee detail in the database
    @PostMapping("/employees")
    private int saveBook(@RequestBody EmployeeData2 emp)
    {
        employeeService.saveOrUpdate(emp);
        return emp.getId();
    }

    //Creating put mapping that updates the employee detail
    @PutMapping("/employeesup")
    private EmployeeData2 update(@RequestBody EmployeeData2 emp)
    {
        employeeService.saveOrUpdate(emp);
        return emp;
    }

}
