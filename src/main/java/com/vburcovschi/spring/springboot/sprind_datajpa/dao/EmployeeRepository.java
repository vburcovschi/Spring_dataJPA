package com.vburcovschi.spring.springboot.sprind_datajpa.dao;


import com.vburcovschi.spring.springboot.sprind_datajpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
