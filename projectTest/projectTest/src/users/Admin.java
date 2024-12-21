package users;

import java.util.ArrayList;
import java.util.List;

public class Admin extends Employee {
    private List<User> users;
    public Admin(int id, String email, String password, String fullName, int employeeId) {
        super(id, email, password, fullName, employeeId);
        this.users = new ArrayList<>();
    }

    @Override
    public void login() {
        System.out.println("Admin " + fullName + " has logged in.");
    }
    @Override
    public void logout() {
        System.out.println("Admin " + fullName + " has logged out.");
    }
    public void addUser(User user) {
        users.add(user);
        System.out.println("Admin " + fullName + " added a new user: " + user.getFullName());
    }

    public void removeUser(User user) {
        if (users.remove(user)) {
            System.out.println("Admin " + fullName + " removed user: " + user.getFullName());
        } else {
            System.out.println("User not found: " + user.getFullName());
        }
    }

 
    public void updateUser(User user, String newEmail, String newPassword, String newFullName) {
        user.setEmail(newEmail);
        user.setPassword(newPassword);
        user.setFullName(newFullName);
        System.out.println("Admin " + fullName + " updated user information: " + user.getFullName());
    }

    public void viewUsers() {
        System.out.println("Admin " + fullName + " is viewing all users:");
        for (User user : users) {
            System.out.println("- " + user);
        }
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return super.toString() + ", Admin{usersCount=" + users.size() + "}";
    }
}
