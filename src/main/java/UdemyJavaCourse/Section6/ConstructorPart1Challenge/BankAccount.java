package UdemyJavaCourse.Section6.ConstructorPart1Challenge;

public class BankAccount {

    private int accountNumber;
    private float balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int amount){
        this.balance += amount;

    }

    public void withdraw(int amount) {
        if ((this.balance -= amount) < 0){

        }else {
            this.balance -= amount;
        }

    }
}
