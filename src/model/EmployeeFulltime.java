//package model;
//
//import java.util.Scanner;
//
//public class  EmployeeFulltime extends Employee {
//    private int bonus;
//    private int fineMoney;
//    private int basicSalary;
//
//    public EmployeeFulltime() {
//    }
////phuong thuc tinh luong thuc linh cho nhan vien fulltime:
//    @Override
//    public double getNetSalary() {
//        double result   = basicSalary+(bonus-fineMoney);
//        return result;
//    }
//
//    @Override
//    public void inEployee() {
//    }
//
//
//    public EmployeeFulltime(String employeeId, String fullName, int age, String phoneNumber, String eMail, int bonus, int fineMoney, int basicSalary) {
//        super(employeeId, fullName, age, phoneNumber, eMail);
//        this.bonus = bonus;
//        this.fineMoney = fineMoney;
//        this.basicSalary = basicSalary;
//    }
//
//    public double getBonus() {
//        return bonus;
//    }
//
//    public void setBonus(int bonus) {
//        this.bonus = bonus;
//    }
//
//    public double getFine() {
//        return fineMoney;
//    }
//
//    public void setFine(int fineMoney) {
//        this.fineMoney = fineMoney;
//    }
//
//    public double getBasicSalary() {
//        return basicSalary;
//    }
//
//    public void setBasicSalary(int basicSalary) {
//        this.basicSalary = basicSalary;
//    }
//
//    @Override
//    public void inEmployee() {
//        super.inEmployee();
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Nhap luong co ban :");
//        basicSalary=scanner.nextInt();
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + ", Luong co ban :" + this.basicSalary;
//}
//}
