package users;

import java.util.List;
import services.FinanceOffice;
import services.Transaction;

public class FinanceManager {
    private int managerId;
    private String name;
    private FinanceOffice office;
    private List<Transaction> transactions;

    public FinanceManager(int managerId, String name, FinanceOffice office, List<Transaction> transactions) {
        this.managerId = managerId;
        this.name = name;
        this.office = office;
        this.transactions = transactions;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FinanceOffice getOffice() {
        return office;
    }

    public void setOffice(FinanceOffice office) {
        this.office = office;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
