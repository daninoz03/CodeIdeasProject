package UdemyJavaCourse.Section6.ContructorPart2Challenge;

public class VIPCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;


    public VIPCustomer() {
        this("Default Customer", 100, "default@fakebank.com");
    }

    public  VIPCustomer(String name, int creditLimit){
        this(name,creditLimit,"default@fakebank.com");
    }

    public VIPCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
