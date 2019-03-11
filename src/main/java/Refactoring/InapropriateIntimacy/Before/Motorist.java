package Refactoring.InapropriateIntimacy.Before;

public class Motorist {

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

    public String getRiskFactor(){
        if (license.getPoints() >3){
            return "HIGH RISK";
        }else if (license.getPoints() > 0 && license.getPoints()<=3) {
            return "MODERATE RISK";
        } else {
            return "LOW RISK";
        }
    }
}
