package oops;

public class Employee {
private int empId;
private String empName;
private double empSalry;

public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getEmpSalry() {
	return empSalry;
}
public void setEmpSalry(double empSalry) {
	this.empSalry = empSalry;
}
protected static void sendNotification(){
	System.out.println("salary is deposited");
}

private static void getAcess(){
	System.out.println("swipe the idcard");
}

}
