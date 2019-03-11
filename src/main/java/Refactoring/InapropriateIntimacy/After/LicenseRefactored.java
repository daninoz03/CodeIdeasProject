package Refactoring.InapropriateIntimacy.After;


public class LicenseRefactored {

    private long licenseNumber;

    public int getPoints() {
        return 2;
    }

    public String getRiskFactor(){
        if (getPoints() >3){
            return "HIGH RISK";
        }else if (getPoints() > 0 && getPoints()<=3) {
            return "MODERATE RISK";
        } else {
            return "LOW RISK";
        }
    }
}
