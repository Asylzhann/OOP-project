package services;

import enums.TransactionType;
import users.User;
import java.util.Date;

public class Transaction {
    private int transactionId;
    private double amount;
    private User sender;
    private Date date;
    private TransactionType type;
    private User recipient;

    public Transaction(int transactionId, double amount, Date date, TransactionType type, User recipient) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.date = date;
        this.type = type;
        this.recipient = recipient;
    }
    public int gettransactionId() {
        return transactionId;
    }


    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }
    public User getSender() {
        return sender;
    }

    public TransactionType getType() {
        return type;
    }

    public User getRecipient() {
        return recipient;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Transaction that = (Transaction) obj;
        return transactionId == that.transactionId &&
               Double.compare(that.amount, amount) == 0 &&
               date.equals(that.date) &&
               type == that.type &&
               recipient.equals(that.recipient);
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(transactionId);
        long temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + date.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + recipient.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Transaction{" +
               "transactionId=" + transactionId +
               ", amount=" + amount +
               ", date=" + date +
               ", type=" + type +
               ", recipient=" + recipient.getFullName() +
               '}';
    }
}
