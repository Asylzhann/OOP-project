package users;

import services.Complaint;
import java.util.ArrayList;
import java.util.List;

public class Dean extends Employee {
    private List<Complaint> complaints;

    public Dean(int id, String email, String password, String fullName, int employeeId) {
        super(id, email, password, fullName, employeeId);
        this.complaints = new ArrayList<>();
    }

    public void receiveComplaint(Complaint complaint) {
        complaints.add(complaint);
        System.out.println("Dean received a complaint from " + complaint.getSender().getFullName());
    }

    public void viewComplaints() {
        System.out.println("Dean is reviewing the following complaints:");
        for (Complaint complaint : complaints) {
            System.out.println("- From: " + complaint.getSender().getFullName() + ", Content: " + complaint.getContent());
        }
    }

    @Override
    public void login() {
        System.out.println("Dean " + fullName + " has logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Dean " + fullName + " has logged out.");
    }
}