package Java_practice;
import java.io.*;
class Employee implements Serializable {
    public int empId;
    public String empName;
    public Employee(int id, String name) {
        this.empId = id;
        this.empName = name;
    }
}
public class Serialization {
    public static void main(String[] args) {
        Employee object = new Employee(1, "Ram");
        String filename = "file.ser";
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("Object has been serialized");
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            Employee object1 = (Employee) in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized");
            System.out.println("Employee Id = " + object1.empId);
            System.out.println("Employee Name = " + object1.empName);
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}