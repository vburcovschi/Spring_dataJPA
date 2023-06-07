package com.vburcovschi.spring.springboot.sprind_datajpa.service;

import com.vburcovschi.spring.springboot.sprind_datajpa.dao.EmployeeRepository;
import com.vburcovschi.spring.springboot.sprind_datajpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        Employee employee = null;
        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isPresent()){
          employee = optional.get();
        }
            return employee;
    }

    @Override
    public void removeEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}
