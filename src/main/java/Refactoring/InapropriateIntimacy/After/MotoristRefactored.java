package Refactoring.InapropriateIntimacy.After;

import Refactoring.InapropriateIntimacy.Before.License;

public class MotoristRefactored {

    private String title;
    private String firstName;
    private String lastName;
    private License license;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSummary() {
        return getTitle()+"."+getFirstName()+" "+
                getLastName()+" has "+license.getPoints()+" penalty points on their license";
    }


}
