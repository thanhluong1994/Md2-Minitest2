import model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFife(String path, List<Employee> employees) {
        try {
            FileOutputStream fos=new FileOutputStream(path);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(employees);
            oos.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Employee>employees=new ArrayList<>();
        employees.add(new Employee("01","dao van hoa",23,"09836262","hoa@gamil.com"));
        employees.add(new Employee("02","dang thai hung",25,"09834354","hung@gmail.com"));
        employees.add(new Employee("03","le van hieu",25,"09834354","hieu@gmail.com"));
        employees.add(new Employee("04","ngo van kieu",25,"09834354","kieu@gmail.com"));
        writeToFife("employee.txt",employees);
        List<Employee> employeeDataFromFile=readDataFromFile("employee.txt");
        for (Employee e:employeeDataFromFile
             ) {
            System.out.println(e);
        }
    }
    public static List<Employee> readDataFromFile(String path){
       List<Employee> employees=new ArrayList<>();
       try {
           FileInputStream fis=new FileInputStream(path);
           ObjectInputStream ois=new ObjectInputStream(fis);
           employees=(List<Employee>) ois.readObject();
           fis.close();
           ois.close();
       }catch (Exception e){
           e.printStackTrace();
       }
       return employees;
    }
}