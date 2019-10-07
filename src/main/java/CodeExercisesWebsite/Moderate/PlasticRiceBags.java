package CodeExercisesWebsite.Moderate;

/**
 * All exercises were taken from https://code-exercises.com/programming/
 */
public class PlasticRiceBags {

    private static final int SMALL_BAG_KILO_AMOUNT = 1;
    private static final int BIG_BAG_KILO_AMOUNT = 5;

    public Boolean packageRice(Integer big, Integer small, Integer goal) {
        int bigBagsUsed = 0;
        int smallBagsUsed = 0;

        if (goal >= BIG_BAG_KILO_AMOUNT) {
            bigBagsUsed = goal / BIG_BAG_KILO_AMOUNT;

            int smallBagsNeeded = goal - (bigBagsUsed * 5);
            if (smallBagsNeeded <= small) {
                return true;
            } else {
                return false;
            }
        } else {
            if (small <= goal) {
                return true;
            } else {
                return false;
            }
        }
    }


    public static void main(String[] args) {
        PlasticRiceBags plasticRiceBags = new PlasticRiceBags();

        System.out.println(plasticRiceBags.packageRice(2, 2, 12));
        System.out.println(plasticRiceBags.packageRice(2, 1, 13));
        System.out.println(plasticRiceBags.packageRice(2, 1, 5));
        System.out.println(plasticRiceBags.packageRice(5, 3, 24));
        System.out.println(plasticRiceBags.packageRice(2, 7, 18));
    }
}
