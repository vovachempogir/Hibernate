package com.example.hibernate_entity.dao;

import com.example.hibernate_entity.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    void create(Employee employee);

    Employee findById(Integer id);

    List<Employee> findAll();

    void update(Employee employee);

    void delete(Employee employee);
}
