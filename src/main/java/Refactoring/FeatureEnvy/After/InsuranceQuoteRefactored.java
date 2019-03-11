package Refactoring.FeatureEnvy.After;

import Refactoring.FeatureEnvy.After.Motorist;

public class InsuranceQuoteRefactored {

    private Motorist motorist;
    public String calculateRiskFactor() {
        return motorist.getRiskFactor();
    }
}
