package services;

import java.util.Date;
import users.User;

public class Transaction {
    private int transactionId;
    private double amount;
    private Date date;
    private String type; 
    private User recipient;

    public Transaction(int transactionId, double amount, Date date, String type, User recipient) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.date = date;
        this.type = type;
        this.recipient = recipient;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", amount=" + amount +
                ", date=" + date +
                ", type='" + type + '\'' +
                ", recipient=" + recipient +
                '}';
    }
}
