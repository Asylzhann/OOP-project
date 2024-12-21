package services;

import users.FinanceManager;
import enums.TransactionType;
import java.util.ArrayList;
import java.util.List;

public class FinanceOffice {
    private FinanceManager manager;
    private List<Transaction> transactions;
    private double budget;

    public FinanceOffice(FinanceManager manager, double budget) {
        this.manager = manager;
        this.budget = budget;
        this.transactions = new ArrayList<>();
    }

    public FinanceManager getManager() {
        return manager;
    }

    public void setManager(FinanceManager manager) {
        this.manager = manager;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void addTransaction(Transaction transaction) {
        if (transaction.getAmount() <= budget) {
            transactions.add(transaction);
            budget -= transaction.getAmount();
            System.out.println("Transaction added: " + transaction + ". Remaining budget: " + budget);
        } else {
            System.out.println("Transaction declined: insufficient budget.");
        }
    }

    public void approveTransaction(Transaction transaction) {
        if (transaction.getAmount() <= budget) {
            manager.approveTransaction(transaction);
            addTransaction(transaction);
        } else {
            System.out.println("Transaction approval failed: insufficient budget.");
        }
    }

    public void generateReport() {
        System.out.println("Finance Office Report:");
        System.out.println("Manager: " + manager.getFullName());
        System.out.println("Budget: " + budget);
        System.out.println("Transactions:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}

