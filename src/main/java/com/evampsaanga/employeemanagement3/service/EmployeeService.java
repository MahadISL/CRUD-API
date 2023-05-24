package com.evampsaanga.employeemanagement3.service;

import com.evampsaanga.employeemanagement3.model.EmployeeData2;
import com.evampsaanga.employeemanagement3.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<EmployeeData2> getAllEmployees() {

        List<EmployeeData2> employeeData2 = new ArrayList<EmployeeData2>();
        employeeRepository.findAll().forEach(employeeData21 -> employeeData2.add(employeeData21));
        return employeeData2;
    }

    public EmployeeData2 getEmployee(int id) {
        return employeeRepository.findById(id).get();
    }

    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    public void saveOrUpdate(EmployeeData2 emp) {
        employeeRepository.save(emp);
    }
}
