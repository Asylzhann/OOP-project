package users;

import java.util.Objects;

public class Messages implements Comparable<Messages> {
    private User sender;     
    private User receiver;   
    private String content;  

    public Messages(User sender, User receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
    }

    public void send() {
        System.out.println("Сообщение отправлено от " + sender.getFullName() + " к " + receiver.getFullName());
    }

    public void view() {
        System.out.println("Сообщение от " + sender.getFullName() + ": " + content);
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false; 
        Messages messages = (Messages) obj;
        return Objects.equals(sender, messages.sender) &&
               Objects.equals(receiver, messages.receiver) &&
               Objects.equals(content, messages.content); 
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(sender, receiver, content); 
    }

    @Override
    public int compareTo(Messages other) {
        return this.content.compareTo(other.content);
    }
    
    @Override
    public String toString() {
        return "Messages{" +
               "sender=" + sender.getFullName() +
               ", receiver=" + receiver.getFullName() +
               ", content='" + content + '\'' +
               '}';
    }
}
