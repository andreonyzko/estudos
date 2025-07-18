package com.andre.crud.service;

import com.andre.crud.dao.EmployeeDAO;
import com.andre.crud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll(){ return employeeDAO.findAll(); }

    @Override
    public Employee findById(Integer id){ return employeeDAO.findById(id); }

    @Override
    @Transactional
    public Employee save(Employee employee) { return employeeDAO.save(employee); }

    @Override
    @Transactional
    public void deleteById(Integer id) { employeeDAO.deleteById(id); }
}
