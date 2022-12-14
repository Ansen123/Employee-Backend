package com.nestdigital.employeeApp.Controller;

import com.nestdigital.employeeApp.Dao.EmployeeDao;
import com.nestdigital.employeeApp.Model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

@Autowired
    private EmployeeDao dao;
@CrossOrigin(origins = "*")
    @PostMapping(path="/employeAdd",consumes = "application/json",produces = "application/json")
    public String employee(@RequestBody EmployeeModel employee){
    dao.save(employee);
    return "{status:'Success'}";

}
@CrossOrigin(origins = "*")
    @GetMapping("/viewEmployee")
    public List<EmployeeModel> viewEmployee(){
    return (List<EmployeeModel>) dao.findAll();
}
}

