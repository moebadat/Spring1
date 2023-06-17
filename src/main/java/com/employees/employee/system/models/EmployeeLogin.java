package com.employees.employee.system.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;




@Entity
@Table(name = "EmployeeLogin")
public class EmployeeLogin {
    
@Min(3)
private @NotBlank String userName;

//Not sure why it created .java files in the Models Folder Automatically
@Min(8)
@Max(32)
private @NotBlank String password;

//Default Constructor still not sure what it does
public EmployeeLogin(){

}

public EmployeeLogin(@NotBlank String username, @NotBlank String password){

    username = this.userName;
    password = this.password;

}

//Getting UserName
public String getUserName() {
    return userName;
}

public void setUserName(String userName) {
    this.userName = userName;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

}
