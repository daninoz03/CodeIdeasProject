package Refactoring.ContinuedPart2.MiddleMan.Before;

/**
 * A useless class (or method) that just calls another class
 */
public class InsuranceCalculator {


    Motorist motorist = new Motorist();
    public String calculateRiskFactor() {
        if (motorist.calculatePoints() >3 || motorist.getAge() < 25){
            return "HIGH RISK";
        }else if (motorist.calculatePoints() > 0 ) {
            return "MODERATE RISK";
        } else {
            return "LOW RISK";
        }

    }
}
