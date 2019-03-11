package Refactoring.DivergentChange;

public class AccountXMLSerializer {

    protected String toXml(Long accountNumber, int balance) {
        return "<account><id>"+Long.toString(accountNumber)+"</id>"+
                "<balance>"+Integer.toString(balance)+"</balance></account>";
    }
}
