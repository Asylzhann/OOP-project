package users;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import services.Transaction;

public class FinanceManager extends Employee {
    private List<Transaction> transactions;

    public FinanceManager(int id, String email, String password, String fullName, int employeeId) {
        super(id, email, password, fullName, employeeId);
        this.transactions = new ArrayList<>();
    }
    @Override
    public void login() {
        System.out.println("FinanceManager " + fullName + " has logged in.");
    }

    @Override
    public void logout() {
        System.out.println("FinanceManager " + fullName + " has logged out.");
    }

    public void approveTransaction(Transaction transaction) {
        transactions.add(transaction);
        System.out.println("FinanceManager " + fullName + " approved transaction: " + transaction.getAmount());
    }
    public void createReport() {
        System.out.println("FinanceManager " + fullName + " is creating a financial report...");
        for (Transaction transaction : transactions) {
            System.out.println("Transaction ID: " + transaction.gettransactionId() +
                               ", Amount: " + transaction.getAmount() +
                               ", Sender: " + transaction.getSender().getFullName() +
                               ", Recipient: " + transaction.getRecipient().getFullName());
        }
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        FinanceManager that = (FinanceManager) obj;
        return Objects.equals(transactions, that.transactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), transactions);
    }
    @Override
    public String toString() {
        return super.toString() +
               ", FinanceManager{" +
               "transactions=" + transactions.size() +
               "}";
    }
}
