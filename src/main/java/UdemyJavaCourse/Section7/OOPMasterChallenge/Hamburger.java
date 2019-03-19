package UdemyJavaCourse.Section7.OOPMasterChallenge;

public class Hamburger {

    private String breadRollType;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean cheese;
    private boolean pickle;

    public float additionalCost = 0;

    private float basePrice;


    public Hamburger(String breadRollType, String meat) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = 5;
    }

    public void setLettuce(boolean lettuce) {
        if (lettuce){
            this.additionalCost += 0.5;
        }

        this.lettuce = lettuce;
    }

    public void setTomato(boolean tomato) {
        if (tomato){
            this.additionalCost += 0.5;
        }

        this.tomato = tomato;
    }

    public void setCheese(boolean cheese) {
        if (cheese){
            this.additionalCost += 1.5;
        }

        this.cheese = cheese;
    }

    public void setPickle(boolean pickle) {
        if (pickle){
            this.additionalCost += 0.3;
        }

        this.pickle = pickle;
    }

    public float getTotalAdditionalCostBasic() {
        return additionalCost;
    }

    public float getBurgerCost(){
        return basePrice;
    }
}
