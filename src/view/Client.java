package view;

import controller.EmployeeManager;
import model.Employee;
import model.EmployeeParttime;
import storage.EmployeeFromFileBinary;
import storage.IEmployeeData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
private static List<Employee> employeeListClient= EmployeeFromFileBinary.readFile();

    public static void main(String[] args) {
        addNewEmployee();
//        showAllEmployee();
    }
    public static void showAllEmployee() {
        for (Employee e:employeeListClient
             ) {
            System.out.println(e);
        }
    }
    public static void addNewEmployee(){
        EmployeeManager.employeeList= (ArrayList<Employee>) employeeListClient;
        EmployeeParttime employeeParttime=creatNewEmployeePartTime();
        EmployeeManager.addNewEmployee(employeeParttime);
        try{
            EmployeeFromFileBinary.writeFile((ArrayList<Employee>) employeeListClient);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static EmployeeParttime creatNewEmployeePartTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap id: ");
        String id = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Moi ban nhap ten: ");
        String name = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Moi ban nhap tuoi: ");
        String age = scanner2.nextLine();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Moi ban nhap so dien thoai: ");
        int number = scanner2.nextInt();
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Moi ban nhap email: ");
        String email = scanner4.nextLine();
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Moi ban nhap so gio lam them: ");
        int workHour = scanner5.nextInt();

        EmployeeParttime employeeParttime = new EmployeeParttime(id, name,age,number,email,workHour );
        return employeeParttime;
    }
}
