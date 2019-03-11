package Refactoring.MessageChains.After;

/**
 * Objects should only interact with their nearest neighbours
 */
public class Invoice {

    private Customer customer;

    public Invoice(Customer customer) {
        this.customer = customer;
    }

    public int getShippingPrice() {

        if (customer.address.isInEurope()){
            return 100;
        }
        return 200;
    }

}
