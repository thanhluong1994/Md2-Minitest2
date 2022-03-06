package storage;

import model.Employee;

import java.io.*;
import java.util.ArrayList;

public class EmployeeFromFileBinary implements IEmployeeData {
    @Override
    public  ArrayList<Employee> readFile() {
        File file = new  File("list1.luong");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object result = ois.readObject();
            ArrayList<Employee> materialList = (ArrayList<Employee>) result;
            ois.close();
            fis.close();
            return materialList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();    }

    @Override
    public  void writeFile(ArrayList<Employee> arrayList) throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos=null;
        try {
            fos = new FileOutputStream("list1.luong");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(arrayList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            oos.close();
            fos.close();
        }
    }
}
