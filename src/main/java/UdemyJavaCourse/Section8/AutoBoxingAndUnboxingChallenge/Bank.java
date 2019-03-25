package UdemyJavaCourse.Section8.AutoBoxingAndUnboxingChallenge;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;
    private ArrayList<Customer> customers;


    public Bank(String name, ArrayList<Branch> branches) {
        this.name = name;
        this.branches = branches;
    }

    public void addNewBranch(String branchName) {
        Branch branch = new Branch(branchName);
        //branch.addNewCustomer("Initial Customer", new ArrayList<>());
        branches.add(branch);
    }

    public void addTransaction(Customer customer, Double transaction) {

        int index = customerIndex(customer);
        if (index >=0) {
            customers.get(index).addTransaction(transaction);
        }
    }

    public void showListOfCustomersForAParticularBranch(String branchName, boolean withTransactions) {



        int hitCount = 0;
        for (Branch branch : branches){
            if (branchName.equals(branch.getBranchName())){

                if (withTransactions){
                    branch.printAllCustomersWithTransactions();
                }else {
                    branch.printAllCustomersWithoutTransactions();
                }
                hitCount++;
            }
        }
        if (hitCount == 0){
            System.out.println("Branch name does not exist");
        }





        /*switch (branch.getBranchName()){
            case "North":
                if (withTransactions) {
                    branch.printAllCustomersWithTransactions();
                }else {
                    branch.printAllCustomersWithoutTransactions();
                }

                break;
            case "South":
                if (withTransactions) {
                    branch.printAllCustomersWithTransactions();
                }else {
                    branch.printAllCustomersWithoutTransactions();
                }
                break;
                default:
                    System.out.println("Branch does not exist");
                    break;


        }*/
    }

    private int customerIndex(Customer customer) {
        for ( int i =0; i<customers.size();i++) {
            if (customer.getName().equals(customers.get(i).getName())){
                return i;
            }
        }
        return -1;
    }


}
