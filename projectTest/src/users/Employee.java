package users;

import services.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Employee extends User {
    protected int employeeId;
    protected List<Message> receivedMessages;

    public Employee(int id, String email, String password, String fullName, int employeeId) {
        super(id, email, password, fullName);
        this.employeeId = employeeId;
        this.receivedMessages = new ArrayList<>();
    }

    public void sendMessage(Employee receiver, String content) {
        Message message = new Message(this, receiver, content);
        receiver.receiveMessage(message);
        System.out.println(fullName + " sent a message to " + receiver.getFullName() + ": " + content);
    }

    public void receiveMessage(Message message) {
        receivedMessages.add(message);
        System.out.println(fullName + " received a new message from " + message.getSender().getFullName());
    }

    public void viewReceivedMessages() {
        System.out.println("Messages for " + fullName + ":");
        for (Message message : receivedMessages) {
            message.view();
        }
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public List<Message> getReceivedMessages() {
        return receivedMessages;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return employeeId == employee.employeeId && super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employeeId);
    }

    @Override
    public String toString() {
        return super.toString() + ", Employee{employeeId=" + employeeId + "}";
    }
}