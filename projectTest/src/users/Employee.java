package users;

import java.util.Objects;

public abstract class Employee extends User {
    private static final long serialVersionUID = 1L;
	protected int employeeId;     
    protected String department;  

    public Employee(int id, String email, String password, String fullName, int employeeId, String department) {
        super(id, email, password, fullName);
        this.employeeId = employeeId;
        this.department = department;
    }

    public abstract void sendMessage(String message);

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false; 
        Employee employee = (Employee) obj;
        return employeeId == employee.employeeId && 
               Objects.equals(department, employee.department) && 
               super.equals(obj); 
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employeeId, department);
    }

    @Override
    public String toString() {
        return super.toString() + 
               ", Employee{employeeId=" + employeeId + 
               ", department='" + department + "'}";
    }
}
