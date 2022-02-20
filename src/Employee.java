import java.util.Scanner;

public abstract class Employee {
    private String employeeId;
    private String fullName;
    private int age;
    private String phoneNumber;
    private String email;
    public Employee(){
    }
    public Employee(String employeeId, String fullName, int age, String phoneNumber, String email) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Number getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String eMail) {
        this.email = email;
    }
    public void inEmployee(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ma nhan vien :");
        employeeId=scanner.nextLine();
        System.out.println("Nhap ho ten nhan vien :");
        fullName=scanner.nextLine();
        System.out.println("Nhap so dien thoai :");
        phoneNumber=scanner.nextLine();
        System.out.println("Nhap mail :");
        email=scanner.nextLine();
        System.out.println("Nhap tuoi :");
        age=scanner.nextInt();
    }

    public abstract double getNetSalary();

    public abstract void inEployee();

    public String toString(){
        return  "Ma nhan vien :" + this.getEmployeeId() + ", Ho ten nhan vien :" + this.getFullName() +
                ", So dien thoai :" + this.getPhoneNumber() + ", mail :" + this.getEmail() +
                ", Tuoi :" + this.getAge();
    }
}
