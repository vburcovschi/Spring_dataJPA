package com.vburcovschi.spring.springboot.sprind_datajpa.dao;


import com.vburcovschi.spring.springboot.sprind_datajpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByName(String name);
    public List<Employee> findAllBySalaryBetween(int min,int max);
}
