package users;

public class Dean extends Employee {
    public Dean(int id, String email, String password, String fullName, int employeeId, String department) {
        super(id, email, password, fullName, employeeId, department);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Dean " + getFullName() + " received the message: " + message);
    }

    @Override
    public void login() {
        System.out.println("Dean " + getFullName() + " has logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Dean " + getFullName() + " has logged out.");
    }
}
