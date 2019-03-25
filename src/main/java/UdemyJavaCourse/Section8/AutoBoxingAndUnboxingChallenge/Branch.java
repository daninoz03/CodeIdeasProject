package UdemyJavaCourse.Section8.AutoBoxingAndUnboxingChallenge;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

    public void addNewCustomer(Customer customer) {
        if (!customerExists(customer.getName())){
            //Customer customer = new Customer(name, initialAmount);
            customers.add(customer);
        }

    }

    private boolean customerExists(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    private int getCustomerIndex(String name) {
        for (int i = 0; i <this.customers.size(); i++){
            if (name.equals(customers.get(i).getName())){
                return i;
            }
        }
        return -1;
    }

    public void addCustomerTransaction(String name, double transaction) {
        if (customerExists(name)){
            int index = getCustomerIndex(name);
            Customer customer = customers.get(index);
            customer.addTransaction(transaction);
        }else {
            System.out.println("Customer does not exist!");
        }
    }

    public String getBranchName() {
        return branchName;
    }

    public void printAllCustomersWithoutTransactions() {
        for (Customer customer: customers) {
            System.out.println(customer.getName());
        }
    }

    public void printAllCustomersWithTransactions() {
        for (Customer customer: customers) {
            System.out.println(customer.getName());
            //for (int j = 0;j<customer.getTransactions().size();j++){
                System.out.println("\t"+customer.getTransactions());
            //}
        }
    }

}
