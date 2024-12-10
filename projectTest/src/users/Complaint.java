package users;

import enums.UrgencyLevel;

import java.util.Objects;

public class Complaint {
    private User sender;
    private User receiver;
    private String content;
    private UrgencyLevel urgency;

    public Complaint(User sender, User receiver, String content, UrgencyLevel urgency) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.urgency = urgency;
    }

    public void send() {
        System.out.println("Complaint sent from " + sender.getFullName() + " to " + receiver.getFullName());
    }

    public String view() {
        return "From: " + sender.getFullName() +
               "\nTo: " + receiver.getFullName() +
               "\nContent: " + content +
               "\nUrgency: " + urgency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complaint complaint = (Complaint) o;
        return Objects.equals(sender, complaint.sender) &&
               Objects.equals(receiver, complaint.receiver) &&
               Objects.equals(content, complaint.content) &&
               urgency == complaint.urgency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sender, receiver, content, urgency);
    }

    @Override
    public String toString() {
        return "Complaint{" +
               "sender=" + sender.getFullName() +
               ", receiver=" + receiver.getFullName() +
               ", content='" + content + '\'' +
               ", urgency=" + urgency +
               '}';
    }
}
