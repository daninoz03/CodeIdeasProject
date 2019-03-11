package Refactoring.InapropriateIntimacy.Before;

/**
 * Two classes that know too much about each other
 * Like bi-directional feature envy
 */
public class License {

    private Motorist motorist = new Motorist();

    private long licenseNumber;

    public int getPoints() {
        return 2;
    }
    public String getSummary() {
        return motorist.getTitle()+"."+motorist.getFirstName()+" "+
                motorist.getLastName()+" has "+getPoints()+" penalty points on their license";
    }
}
