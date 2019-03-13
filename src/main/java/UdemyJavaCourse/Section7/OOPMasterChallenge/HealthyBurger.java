package UdemyJavaCourse.Section7.OOPMasterChallenge;

public class HealthyBurger extends Hamburger {

    private boolean lowFatMayo;
    private boolean egg;
    private float totalAdditionalCostHealthy;

    public HealthyBurger(String meat, boolean lowFatMayo, boolean egg) {
        super("Rye", meat);
        this.lowFatMayo = lowFatMayo;
        this.egg = egg;
    }

    public void setLowFatMayo(boolean lowFatMayo) {
        if (lowFatMayo) {
            totalAdditionalCostHealthy += 0.2;
        }
        this.lowFatMayo = lowFatMayo;
    }

    public void setEgg(boolean egg) {
        if (egg) {
            totalAdditionalCostHealthy+=1;
        }
        this.egg = egg;
    }

    public float getTotalCost() {
        return getBurgerCost() + getTotalAdditionalCostBasic() + getTotalAdditionalCostHealthy();
    }

    public float getTotalAdditionalCostHealthy() {
        return totalAdditionalCostHealthy;
    }
}
