package Refactoring.ShotgunSurgery.After;

public class AccountRefactored {

    private String type;
    private String accountNumber;
    private int amount;
    public AccountRefactored(String type,String accountNumber,int amount)
    {
        this.amount=amount;
        this.type=type;
        this.accountNumber=accountNumber;
    }
    private void isAccountUnderflow() throws Exception {
        if (amount <=500) {
            throw new Exception("Minimum balance should be over 500");
        }
    }

    public void debit(int debit) throws Exception {
        isAccountUnderflow();

        amount = amount-debit;
        System.out.println("Now amount is" + amount);
    }
    public void transfer(AccountRefactored from,AccountRefactored to,int creditAmount) throws Exception {
        isAccountUnderflow();

        to.amount = amount+creditAmount;
    }

}
