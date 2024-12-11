package users;

import services.Message;
import java.util.ArrayList;
import java.util.List;

public class Dean extends Employee {
    private List<Message> requests;

    public Dean(int id, String email, String password, String fullName, int employeeId) {
        super(id, email, password, fullName, employeeId);
        this.requests = new ArrayList<>();
    }

    public void receiveComplaint(Message complaint) {
        requests.add(complaint);
        System.out.println("Dean received a complaint from " + complaint.getSender().getFullName());
    }

    public void viewRequests() {
        System.out.println("Dean is reviewing the following requests:");
        for (Message request : requests) {
            System.out.println("- From: " + request.getSender().getFullName() + ", Content: " + request.getContent());
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