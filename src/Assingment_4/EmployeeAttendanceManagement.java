package Assingment_4;
import java.time.LocalTime;
public class EmployeeAttendanceManagement {
	public static void main(String[] args) {
		Employee emp = new Employee(101, "Subham");
        Attendance attendance = new Attendance(emp.getempId());
        emp.markCheckIn(attendance);
        emp.markCheckIn(attendance);
        emp.markCheckOut(attendance);
        emp.markCheckOut(attendance);
        System.out.println(attendance.getAttendanceDetails());
	}
}
class Employee{
	private int empid;
	private String empName;
	public Employee(int empId, String empName) {
        this.empid = empId;
        this.empName = empName;
    }
	public int getempId() {
		return empid;
	}
	public String getempName() {
		return empName;
	}
	public void markCheckIn(Attendance attendance) {
        attendance.markCheckIn();
    }
	public void markCheckOut(Attendance attendance) {
		attendance.markCheckOut();
	}
}
class Attendance{
	private int empId;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;
    private boolean isCheckedIn = false;
    private boolean isCheckedOut = false;
    public Attendance(int empId) {
        this.empId = empId;
    }
    public void markCheckIn() {
        if (isCheckedIn) {
            System.out.println("Check-in already recorded for today!");
        } else {
            checkInTime = LocalTime.now();
            isCheckedIn = true;
            System.out.println("Check-in successful at " + checkInTime);
        }
    }
    public void markCheckOut() {
        if (!isCheckedIn) {
            System.out.println("Cannot check-out before check-in!");
        } else if (isCheckedOut) {
            System.out.println("Check-out already recorded for today!");
        } else {
            checkOutTime = LocalTime.now();
            isCheckedOut = true;
            System.out.println("Check-out successful at " + checkOutTime);
        }
    }
    public String getAttendanceDetails() {
        return "\nAttendance Summary" +
                "\nEmployee ID: " + empId +
                "\nCheck-In Time: " + (checkInTime != null ? checkInTime : "Not Checked-In") +
                "\nCheck-Out Time: " + (checkOutTime != null ? checkOutTime : "Not Checked-Out");
    }	
}