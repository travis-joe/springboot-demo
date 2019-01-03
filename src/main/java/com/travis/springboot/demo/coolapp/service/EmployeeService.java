package com.travis.springboot.demo.coolapp.service;

import com.travis.springboot.demo.coolapp.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();

    public Employee findById(int id);

    public void save(Employee employee);

    public void deleteById(int id);
}
