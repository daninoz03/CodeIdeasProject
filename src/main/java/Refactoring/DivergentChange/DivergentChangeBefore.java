package Refactoring.DivergentChange;

/**
 * When you need to make a single change in a class but have to change multiple methods
 *
 * Or
 *
 * When a class has more than one responsibility
 */
public class DivergentChangeBefore {

    long accountNumber;
    int balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String toXml() {

        return "<account><id>"+Long.toString(accountNumber)+"</id>"+
                "<balance>"+Integer.toString(balance)+"</balance></account>";
    }
}
