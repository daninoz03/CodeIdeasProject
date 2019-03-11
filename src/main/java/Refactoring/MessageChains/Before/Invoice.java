package Refactoring.MessageChains.Before;

/**
 * Objects should only interact with their nearest neighbours
 */
public class Invoice {

    private Customer customer;

    public Invoice(Customer customer) {
        this.customer = customer;
    }

    public int getShippingPrice() {

        if (isInEurope()){
            return 100;
        }
        return 200;
    }

    public boolean isInEurope() {
        if (customer.getAddress().getCountry().isInEurope()){
            return true;
        }
        return false;
    }
}
