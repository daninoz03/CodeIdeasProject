package UdemyJavaCourse.Section7.OOPMasterChallenge;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Rye","beef");
        hamburger.setCheese(true);
        hamburger.setLettuce(true);
        System.out.println("Total cost is "+hamburger.getBurgerCost());

        HealthyBurger healthyBurger = new HealthyBurger("Chicken", true, false);
        healthyBurger.setCheese(true);
        System.out.println("The total cost of the healthy burger is "+healthyBurger.getTotalCost());

        DeluxBurger deluxBurger = new DeluxBurger("Italian","deer");
        System.out.println("The total cost of the deluxe burger is "+deluxBurger.getTotalCost());
    }
}
