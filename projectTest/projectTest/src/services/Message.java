package services;

import users.Employee;
import java.util.Objects;

public class Message {
    private final Employee sender;
    private final Employee receiver;
    private final String content;

    public Message(Employee sender, Employee receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
    }

    public void view() {
        System.out.println("Message from " + sender.getFullName() + ": " + content);
    }

    public Employee getSender() {
        return sender;
    }

    public Employee getReceiver() {
        return receiver;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Message message = (Message) obj;
        return Objects.equals(sender, message.sender) &&
               Objects.equals(receiver, message.receiver) &&
               Objects.equals(content, message.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sender, receiver, content);
    }

    @Override
    public String toString() {
        return "Message{" +
               "sender=" + sender.getFullName() +
               ", receiver=" + receiver.getFullName() +
               ", content='" + content + '\'' +
               '}';
    }
}