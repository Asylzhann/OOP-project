package users;

import java.util.Objects;
import users.User;


public abstract class User {
    protected int id;          
    protected String email;    
    protected String password; 
    protected String fullName; 
    protected boolean isLoggedIn;

    public User(int id, String email, String password, String fullName) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.isLoggedIn = false;
    }

    public abstract void login();
    public abstract void logout();

    public void changePassword(String newPassword) {
        this.password = newPassword;
        System.out.println(fullName + " successfully changed their password.");
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false; 
        User user = (User) obj;
        return id == user.id && Objects.equals(email, user.email); 
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email); 
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", email='" + email + "', fullName='" + fullName + "'}";
    }


}