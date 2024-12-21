package users;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {
    private List<User> managedUsers; 
    private List<String> logs;     

    public Admin(int id, String email, String password, String fullName) {
        super(id, email, password, fullName);
        this.managedUsers = new ArrayList<>();
        this.logs = new ArrayList<>();
    }

    public void addUser(User user) {
        if (user != null && !managedUsers.contains(user)) {
            managedUsers.add(user);
            logs.add("Added user: " + user.getFullName());
            System.out.println("User added successfully: " + user.getFullName());
        } else {
            System.out.println("User already exists or is invalid.");
        }
    }

    public void removeUser(User user) {
        if (user != null && managedUsers.remove(user)) {
            logs.add("Removed user: " + user.getFullName());
            System.out.println("User removed successfully: " + user.getFullName());
        } else {
            System.out.println("User not found.");
        }
    }

    public void updateUser(int userId, String newEmail, String newFullName) {
        for (User user : managedUsers) {
            if (user.getId() == userId) {
                user.setEmail(newEmail);
                user.setFullName(newFullName);
                logs.add("Updated user: " + user.getFullName());
                System.out.println("User updated successfully: " + user.getFullName());
                return;
            }
        }
        System.out.println("User with ID " + userId + " not found.");
    }

    public void seeLogs() {
        System.out.println("Admin Logs:");
        for (String log : logs) {
            System.out.println(log);
        }
    }

    @Override
    public void login() {
        isLoggedIn = true;
        System.out.println(fullName + " (Admin) logged in.");
    }

    @Override
    public void logout() {
        isLoggedIn = false;
        System.out.println(fullName + " (Admin) logged out.");
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", isLoggedIn=" + isLoggedIn +
                ", managedUsers=" + managedUsers.size() +
                ", logs=" + logs.size() +
                '}';
    }
}
