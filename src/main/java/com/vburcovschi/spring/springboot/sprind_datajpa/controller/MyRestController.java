package com.vburcovschi.spring.springboot.sprind_datajpa.controller;

import com.vburcovschi.spring.springboot.sprind_datajpa.entity.Employee;
import com.vburcovschi.spring.springboot.sprind_datajpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees(){
        return employeeService.getAllEmployee();
    }
    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id){
        Employee employee = employeeService.getEmployee(id);
/*        if (employee==null){
            throw new NoSuchEmployeeException("There is no employee with ID = "+id+" in database");
        }*/
        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return employee;
    }
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id){
        Employee employee = employeeService.getEmployee(id);
/*        if (employee==null){
            throw new NoSuchEmployeeException("There is no employee with ID = "+id+" in database");
        }*/
        employeeService.removeEmployee(id);
        return "Employee with id= "+id+" was deleted";
    }

    @GetMapping("/employees/name/{name}")
    public List<Employee> showAllEmployeeByName(@PathVariable String name){
            List<Employee> employees = employeeService.findAllByName(name);
            return employees;
        }

    @GetMapping("/employees/salary/{min}/{max}")
    public List<Employee> showAllEmployeeByName(@PathVariable Integer min, @PathVariable Integer max){
        List<Employee> employees = employeeService.findAllBySalaryBetween(min,max);
        return employees;
    }
}
