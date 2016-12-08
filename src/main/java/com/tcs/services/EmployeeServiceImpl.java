package com.tcs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tcs.dao.EmployeeDao;
import com.tcs.domain.Employee;

public class EmployeeServiceImpl implements EmployeeService {
 
 @Autowired
 EmployeeDao employeeDao;

 @Override
 public int insertRow(Employee employee) {
  return employeeDao.insertRow(employee);
 }

 @Override
 public List<Employee> getList() {
  return employeeDao.getList();
 }

 @Override
 public Employee getRowById(int id) {
  return employeeDao.getRowById(id);
 }

 @Override
 public int updateRow(Employee employee) {
  return employeeDao.updateRow(employee);
 }

 @Override
 public int deleteRow(int id) {
  return employeeDao.deleteRow(id);
 }

}

