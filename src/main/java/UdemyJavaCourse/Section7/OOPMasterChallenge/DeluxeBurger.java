package UdemyJavaCourse.Section7.OOPMasterChallenge;

public class DeluxeBurger extends Hamburger {

    private boolean chips;
    private boolean drink;
    private float totalAdditionalCostDelux;

    public DeluxeBurger(String breadRollType, String meat) {
        super(breadRollType, meat);
        this.chips = true;
        this.drink = true;
    }


    public float getTotalCost() {
        return getBurgerCost() + getTotalAdditionalCostBasic() + 2.5f;
    }
}
