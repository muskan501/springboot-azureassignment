package com.nagarro.azureAssignment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.azureAssignment.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
