package com.example.EMSSpringBoot.repository;

import com.example.EMSSpringBoot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public class EmployeeRepository extends JpaRepository<Employee, Long> {
}
