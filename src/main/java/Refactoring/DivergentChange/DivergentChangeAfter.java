package Refactoring.DivergentChange;

public class DivergentChangeAfter {

    private long accountNumber;
    private int balance;
    private AccountXMLSerializer accountXMLSerializer = new AccountXMLSerializer();

    public long getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String toXml() {

        return accountXMLSerializer.toXml(accountNumber, balance);

    }
}
