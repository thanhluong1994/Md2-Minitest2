package model;

import java.util.Scanner;

public class EmployeeParttime extends Employee {
    public static final int SALARYPERHOUR = 100;
    private double workHour;
    public EmployeeParttime(String id, String name, String age, int number, String email, int workHour){
    }
    //phuong thuc tinh luong thuc linh cho nhan vien parttime:
    @Override
    public double getNetSalary(){
        double result =workHour* SALARYPERHOUR;
        return result;
    }

    @Override
    public void inEployee() {

    }

    public EmployeeParttime(double workHour) {
        this.workHour = workHour;
    }

    public EmployeeParttime(String employeeId, String fullName, int age, String phoneNumber, String email, double workHour) {
        super(employeeId, fullName, age, phoneNumber, email);
        this.workHour = workHour;
    }

    public double getWorkHour() {
        return workHour;
    }

    public void setWorkHour(double workHour) {
        this.workHour = workHour;
    }
    @Override
    public void inEmployee(){
        super.inEmployee();
        Scanner scanner=new Scanner(System.in);
        System.out.println("So gio lam them " + workHour);
        workHour= scanner.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + " So gio lam them : " + this.workHour + " So tien luong :" + getNetSalary();
    }
}
