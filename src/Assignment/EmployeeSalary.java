package Assignment;
	import java.util.Scanner;
	public class EmployeeSalary {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Employee Name:");
	        String name = sc.nextLine();
	        System.out.println("Enter wages per day:");
	        int wages = sc.nextInt();
	        System.out.println("Enter number of days worked:");
	        int days = sc.nextInt();
	        if (days > 0) {
	            int totalSalary = wages * days;
	            System.out.println("Employee Name: " + name);
	            System.out.println("Total Salary: " + totalSalary);
	        } 
	        else {
	            System.out.println("Invalid number of days worked");
	        }
	        sc.close();
	    }
	}

