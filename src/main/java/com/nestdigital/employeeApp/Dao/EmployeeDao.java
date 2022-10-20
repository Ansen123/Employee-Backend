package com.nestdigital.employeeApp.Dao;

import com.nestdigital.employeeApp.Model.EmployeeModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<EmployeeModel,Integer> {
    @Modifying
    @Query(value = "DELETE FROM `employee` WHERE `id`= :id",nativeQuery = true)
    void deleteEmployeeById(Integer id);
}
