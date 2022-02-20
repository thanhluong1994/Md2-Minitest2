import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee[] listEmployee=new Employee[4];
        //Nhan vien fulltime
        listEmployee[0]=new EmployeeFulltime("Ft1","Vu Thanh Long",29,"0987465362","long@gmail.com",2000000,500000,8000000);
        listEmployee[1]=new EmployeeFulltime("Ft2","Tran Minh Chien",26,"0987465546","chien@gmail.com",1000000,200000,8000000);
        //Nhan vien parttime
       listEmployee[2]= new EmployeeParttime("Pt1", "Do Thi Ha", 24, "0987654568", "ha@gmail.com", 8);
       listEmployee[3]= new EmployeeParttime("Pt2", "Le Anh Tuyet", 24, "0987454568", "tuyet@gmail.com", 6);
       //Hien thi danh sach nhan vien
          for(int i=0;i< listEmployee.length;i++){
              System.out.println(listEmployee[i]);
          }
        //Nhap so nhan vien muon them
        int Average=0,Total=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nhan vien muon them :");
        int employeeNumber = scanner.nextInt();
        Employee[] employeesList = new Employee[employeeNumber];
        for (int i = 0; i <employeesList.length; i++) {
            System.out.println("Nhap thong tin nhan vien thu " + (i+1) + " :");
            System.out.println("Chon 1 neu la nhan vien fulltime va 2 neu la nhan vien parttime");
            int choose = scanner.nextInt();
            if (choose == 1) {
                employeesList[i] = new EmployeeFulltime();
            } else if (choose == 2) {
                employeesList[i] = new EmployeeParttime() {
                    @Override
                    public void inEployee() {

                    }
                };
            }
            employeesList[i].inEmployee();
            employeesList[i].getNetSalary();
        }
        System.out.println("Thong tin nhan vien trong cong ty:" );
        for(int i=0;i<employeesList.length;i++){
            System.out.println(employeesList[i].toString());
        }
        //Nhan vien fulltime co muc luong thap hon muc trung binh
        System.out.println("Danh sach nhan vien fulltime co muc luong thap hon muc trung binh :");
        for(int i=0;i<employeeNumber;i++){
            Total+=employeesList[i].getNetSalary();
        }
         Average=Total/employeeNumber;
        for(int i=0;i<employeeNumber;i++){
            if (employeesList[i].getNetSalary()<=Average){
                System.out.println(employeesList[i].toString());
            }
        }
    }
}
