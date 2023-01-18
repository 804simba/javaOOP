package TON;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    private Client client;
    private ArrayList<Transaction> transactions;
    public Account(int id, double balance, double annualInterestRate, Client client) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.client = client;

        // created a new ArrayList object named transactions to store the users transaction details
        transactions = new ArrayList<>();
        dateCreated = new Date();
    }

    public boolean withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            this.transactions.add(new Transaction('W', amount, this.balance, "Withdrew " + " " + amount));
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        this.balance += amount;
        this.transactions.add(new Transaction('D', amount, this.balance, "Deposited " + " " + amount));
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String toString() {
        return this.id + " " + this.balance + " " + this.annualInterestRate + " " + this.dateCreated;
    }
}
