package com.nestdigital.employeeApp.Dao;

import com.nestdigital.employeeApp.Model.EmployeeModel;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<EmployeeModel,Integer> {
}
