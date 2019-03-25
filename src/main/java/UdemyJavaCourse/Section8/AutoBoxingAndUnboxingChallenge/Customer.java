package UdemyJavaCourse.Section8.AutoBoxingAndUnboxingChallenge;

import java.util.ArrayList;

public class Customer {

    private ArrayList<Double> transactions;
    private String name;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialAmount);
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
