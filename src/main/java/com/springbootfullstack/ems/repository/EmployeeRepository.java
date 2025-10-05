package com.springbootfullstack.ems.repository;

import com.springbootfullstack.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}