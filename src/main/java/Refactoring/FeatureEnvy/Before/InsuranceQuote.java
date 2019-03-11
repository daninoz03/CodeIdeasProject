package Refactoring.FeatureEnvy.Before;

/**
 * Constantly uses another class so it can be moved to another class
 */
public class InsuranceQuote {
    private Motorist motorist;
    public String calculateRiskFactor() {
        if (motorist.getPointsOnLicense() >3 || motorist.getAge() < 25){
            return "HIGH RISK";
        }else if (motorist.getPointsOnLicense() > 0 ) {
            return "MODERATE RISK";
        } else {
            return "LOW RISK";
        }

    }
}
