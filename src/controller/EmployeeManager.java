package controller;

import model.Employee;
import storage.EmployeeFromFileBinary;
import storage.IEmployeeData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
public static IEmployeeData employeeData=new EmployeeFromFileBinary();
public static ArrayList<Employee> employeeList=employeeData.readFile();

public static void addNewEmployee(Employee newEmployee){
    employeeList.add(newEmployee);
    try {
        employeeData.writeFile(employeeList);
    }catch (IOException e){
        e.printStackTrace();
    }
        {
    }
}
}
