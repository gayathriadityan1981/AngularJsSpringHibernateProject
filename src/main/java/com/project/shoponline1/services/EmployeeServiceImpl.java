package com.project.shoponline1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.shoponline1.repository.Employee.EmployeeDao;
import com.project.shoponline1.model.Employee;

@Service
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

   @Autowired
   private EmployeeDao employeeDao;

  /* @Transactional
   @Override
   public long save(Employee Employee) {
      return employeeDao.save(Employee);
   }

   @Override
   public Employee get(long id) {
      return employeeDao.get(id);
   }*/

   @Override
   public List<Employee> list() {
      return employeeDao.list();
   }

 /*  @Transactional
   @Override
   public void update(long id, Employee Employee) {
      employeeDao.update(id, Employee);
   }

   @Transactional
   @Override
   public void delete(long id) {
      employeeDao.delete(id);
   }*/

}