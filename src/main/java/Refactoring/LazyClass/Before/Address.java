package Refactoring.LazyClass.Before;

/**
 * Classes that aren't really doing much and can be moved into another class
 */
public class Address {

    private int houseNumber;
    private String street;
    private Postcode postcode;

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Postcode getPostcode() {
        return postcode;
    }

    public void setPostcode(Postcode postcode) {
        this.postcode = postcode;
    }
}
