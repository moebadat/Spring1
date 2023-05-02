package com.employees.employee.system.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employees.employee.system.models.Employee;
import com.employees.employee.system.repo.EmployeeRepo;

@CrossOrigin(origins = "http://localhost:4200")
//Specify that this is a REST api
@RestController

//pls do requests, specifies end point e.g localhost:8080/employees
@RequestMapping(value="/employees")//this goes  after localhost:8080/employees
public class EmployeeController {

    //link to the repo and create an object
    @Autowired
    private EmployeeRepo employeeRepo;

    //get this method
   

    //List because we are getting all the items, call model, name methods
    //<> this means that its iterable 
    //return then use repo to get data from the model
   @GetMapping
    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }


    //get for one
    @GetMapping(value = "/{id}")
    public Optional<Employee> findOne(Employee employee) {
        return employeeRepo.findById(employee.getEmpId());
    }
     
    //@RequestBody says to post this data
    //specify return type as we are getting something back
    //@Validate makes sure of data being sent
    //@Non null says value cannot be null
    //we pass in employee, the details as a request body and then save that
    @PostMapping
    public Employee save(@Validated @NonNull @RequestBody Employee employee) {
        return employeeRepo.save(employee);
    }

    //postgres link
    //spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
    //spring.datasource.username=postgres
    //spring.datasource.password=password


    //update uses a put
    //update using id
    //only return method changes
    //pass id on put mapping, tells it that its an id and relate it with data you have, if its that data it will update it as specified
  @PutMapping("/{id}")
    public Employee update(@Validated @NonNull @RequestBody Employee employee) {
        return employeeRepo.save(employee);
    }

     @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable int id) {
        employeeRepo.deleteById(id);
    }


    
}
