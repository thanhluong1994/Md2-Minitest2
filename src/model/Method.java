package model;

import model.Employee;

public class Method {
    public static void displayEmployee(Employee[] employees) {
        for (Employee e:employees
             ) {
            System.out.println(e);
        }
    }
    public static Employee[] addNewEmployee(Employee[] employees,Employee newEmployee){
        Employee[] newEmployeeList=new Employee[employees.length+1];
        for (int i = 0; i < employees.length; i++) {
            newEmployeeList[i]=employees[i];
        }
        newEmployeeList[employees.length]=newEmployee;
        return newEmployeeList;
    }
}
