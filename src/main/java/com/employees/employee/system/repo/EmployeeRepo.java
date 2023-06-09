package com.employees.employee.system.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.employees.employee.system.models.Employee;

//Automatically expects model and  type of id as an argument
//between model and controller, sends data to controller
//extend jparepository to use functionality such as http metthods
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    
}
