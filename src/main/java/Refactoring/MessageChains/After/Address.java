package Refactoring.MessageChains.After;

public class Address {

    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public boolean isInEurope() {
        if (getCountry().isInEurope()){
            return true;
        }
        return false;
    }
}
