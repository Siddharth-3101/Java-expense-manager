package src;
public class Employee {
    private int empId;
    private String name;
    private String dept;
    private String email;

    public Employee(int empId, String name, String dept, String email) {
        this.empId = empId;
        this.name = name;
        this.dept = dept;
        this.email = email;
    }

    
    public int getEmpId() {
    	return empId; }
    public String getName() {
    	return name; }
    public String getDept() { 
    	return dept; }
    public String getEmail() { 
    	return email; }

    public void setDept(String dept) { 
    	this.dept = dept; }
    public void setEmail(String email) { 
    	this.email = email; }

    public void displayInfo() {
        System.out.println("Employee: " + name + " (" + dept + ")");
    }
}
