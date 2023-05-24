package com.evampsaanga.employeemanagement3.repository;

import com.evampsaanga.employeemanagement3.model.EmployeeData2;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<EmployeeData2, Integer> {
}
