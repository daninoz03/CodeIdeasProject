package Refactoring.ContinuedPart2.MiddleMan.After;


public class InsuranceCalculator {
    Motorist motorist = new Motorist();
    License license = new License();
    public String calculateRiskFactor() {
        if (license.getNumOfPoints() >3 || motorist.getAge() < 25){
            return "HIGH RISK";
        }else if (license.getNumOfPoints() > 0 ) {
            return "MODERATE RISK";
        } else {
            return "LOW RISK";
        }

    }
}
