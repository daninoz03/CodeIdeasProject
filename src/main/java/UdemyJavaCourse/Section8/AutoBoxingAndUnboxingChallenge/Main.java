package UdemyJavaCourse.Section8.AutoBoxingAndUnboxingChallenge;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {


        Branch branchSouth = new Branch("South");
        Branch branchNorth = new Branch("North");


        Customer customerDan = new Customer("Dan", 100.50);
        Customer customerSteve = new Customer("Steve", 20.23);
        customerDan.addTransaction(400.0);
        customerDan.addTransaction(32);
        customerDan.addTransaction(678);

        customerSteve.addTransaction(321);

        branchSouth.addNewCustomer(customerDan);
        branchSouth.addNewCustomer(customerSteve);

        Customer customerGlen = new Customer("Glen", 0.0);

        branchNorth.addNewCustomer(customerGlen);

        ArrayList<Branch> branches = new ArrayList<>();
        branches.add(branchNorth);
        branches.add(branchSouth);

        Bank bank = new Bank("BOI",branches);
        bank.showListOfCustomersForAParticularBranch("South", true);

        bank.showListOfCustomersForAParticularBranch("Dublin", true);

    }
}
