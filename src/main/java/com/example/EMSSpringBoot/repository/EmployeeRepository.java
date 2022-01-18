package com.example.EMSSpringBoot.repository;

import com.example.EMSSpringBoot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

