package com.vburcovschi.spring.springboot.sprind_datajpa.service;


import com.vburcovschi.spring.springboot.sprind_datajpa.entity.Employee;

import java.util.List;


public interface EmployeeService {
    public List<Employee> getAllEmployee();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void removeEmployee(int id);

    public List<Employee> findAllByName(String name);
    public List<Employee> findAllBySalaryBetween(int min, int max);
}
