package UdemyJavaCourse.Section7.OOPMasterChallenge;

public class DeluxBurger extends Hamburger {

    private boolean chips;
    private boolean drink;
    private float totalAdditionalCostDelux;

    public DeluxBurger(String breadRollType, String meat) {
        super(breadRollType, meat);
        this.chips = true;
        this.drink = true;
    }


    public float getTotalCost() {
        return getBurgerCost() + 2.5f;
    }
}
