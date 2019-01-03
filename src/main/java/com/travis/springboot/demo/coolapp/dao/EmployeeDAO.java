package com.travis.springboot.demo.coolapp.dao;

import com.travis.springboot.demo.coolapp.entity.Employee;

import java.util.List;


public interface EmployeeDAO {
    public List<Employee> findAll();

    public Employee findById(int id);

    public void save(Employee employee);

    public void deleteById(int id);
}
