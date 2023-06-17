package com.employees.employee.system.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;




@Entity
@Table(name = "EmployeeLogin")
public class EmployeeLogin {
    
@Min(3)
private @NotBlank String userName;

@Min(8)
@Max(32)
private @NotBlank String password;

//Default Constructor
public EmployeeLogin(){

}

public EmployeeLogin(@NotBlank String username, @NotBlank String password){

    username = this.userName;
    password = this.password;

}


    
}
