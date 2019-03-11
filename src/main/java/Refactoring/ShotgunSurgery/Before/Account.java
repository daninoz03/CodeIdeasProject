package Refactoring.ShotgunSurgery.Before;

/**
 * A single responsibility has been split up between a large number of classes
 *
 * Or
 *
 * Poor separation of concerns
 */
public class Account {

    private String type;
    private String accountNumber;
    private int amount;
    public Account(String type,String accountNumber,int amount)
    {
        this.amount=amount;
        this.type=type;
        this.accountNumber=accountNumber;
    }
    public void debit(int debit) throws Exception
    {
        if(amount <= 500)
        {
            throw new Exception("Minimum balance should be over 500");
        }
        amount = amount-debit;
        System.out.println("Now amount is" + amount);
    }
    public void transfer(Account from,Account to,int cerditAmount) throws Exception
    {
        if(from.amount <= 500)
        {
            throw new Exception("Minimum balance should be over 500");
        }
        to.amount = amount+cerditAmount;
    }
    public void sendWarningMessage()
    {
        if(amount <= 500)
        {
            System.out.println("amount should be over 500");
        }
    }

    public static void main(String[] args) throws Exception {
        Account account = new Account("Current", "123", 1000);
        account.debit(600);
    }
}
