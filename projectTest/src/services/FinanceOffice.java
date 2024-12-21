package services;

import java.util.List;

public class FinanceOffice {
    private int officeId;
    private List<OfficeManager> managers;
    private List<Transaction> transactions;
    private double budget;

  
    public FinanceOffice(int officeId, List<OfficeManager> managers, List<Transaction> transactions, double budget) {
        this.officeId = officeId;
        this.managers = managers;
        this.transactions = transactions;
        this.budget = budget;
    }


    public int getOfficeId() {
        return officeId;
    }

    public void setOfficeId(int officeId) {
        this.officeId = officeId;
    }

    public List<OfficeManager> getManagers() {
        return managers;
    }

    public void setManagers(List<OfficeManager> managers) {
        this.managers = managers;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public boolean addTransaction(Transaction transaction) {
        if (transaction != null) {
            transactions.add(transaction);
            budget -= transaction.getAmount(); 
            System.out.println("Transaction added: " + transaction);
            return true;
        }
        return false;
    }

    public void generateBudgetReport() {
        System.out.println("Finance Office Report:");
        System.out.println("Office ID: " + officeId);
        System.out.println("Remaining Budget: " + budget);
        System.out.println("Transactions:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    @Override
    public String toString() {
        return "FinanceOffice{" +
                "officeId=" + officeId +
                ", managers=" + managers +
                ", transactions=" + transactions +
                ", budget=" + budget +
                '}';
    }
}
