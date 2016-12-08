package com.tcs.dao;

import java.util.List;

import com.tcs.domain.Employee;

public interface EmployeeDao {
 public int insertRow(Employee employee);

 public List<Employee> getList();

 public Employee getRowById(int id);

 public int updateRow(Employee employee);

 public int deleteRow(int id);

}
