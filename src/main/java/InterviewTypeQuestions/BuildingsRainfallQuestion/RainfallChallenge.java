package InterviewTypeQuestions.BuildingsRainfallQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

/**
 * Given two arrays (the first being how many buildings there is and the second being the heights of each building)
 * calculate the maximum amount of rainfall units that could be captured
 */
public class RainfallChallenge {



    //static final int buildingHeights[] = new int[]{2,5,1,2,3,4,7,7,6};
    static int buildingHeights[] = new int[]{1, 5, 6, 2, 6, 3, 4, 6, 2};


    public RainfallChallenge(int[] buildingHeights) {
        this.buildingHeights = buildingHeights;
    }

    private static ArrayList<Integer> getTheTallestBuildingOnEachSide(int index) {
        ArrayList<Integer> tallestBuildingOnEitherSide = new ArrayList<>();
        ArrayList<Integer> tallestBuildingOnEitherSideIndexValues = new ArrayList<>();

        //Check if building is on the edge
        if (isBuildingOnTheEdge(index)) {
            return tallestBuildingOnEitherSide;
        }

        ArrayList<Integer> rightBuildings = new ArrayList<>();
        ArrayList<Integer> rightBuildingsIndexValues = new ArrayList<>();
        ArrayList<Integer> leftBuildings = new ArrayList<>();
        ArrayList<Integer> leftBuildingsIndexValues = new ArrayList<>();
        // Is there a taller building on the right
        for (int i = index; i < buildingHeights.length; i++) {
            if (buildingHeights[i] > buildingHeights[index]) {
                rightBuildings.add(buildingHeights[i]);
                rightBuildingsIndexValues.add(i);
            }
        }
        int rightMax = 0;
        int rightMaxIndexValue = 0;
        try {
            rightMax = Collections.max(rightBuildings);
            rightMaxIndexValue = IntStream.range(index, buildingHeights.length)
                    .filter(i -> Collections.max(rightBuildings) == buildingHeights[i])
                    .findFirst()
                    .orElse(-1);
        } catch (Exception e) {
            System.out.println("There is no right max");
            return new ArrayList<>();
        }

        for (int j = index; j >= 0; j--) {

            if (buildingHeights[j] > buildingHeights[index]) {
                leftBuildings.add(buildingHeights[j]);
                leftBuildingsIndexValues.add(j);
            }
        }
        int leftMax = 0;
        int leftMaxIndexValue = 0;

        try {
            leftMax = Collections.max(leftBuildings);
            leftMaxIndexValue = IntStream.range(0, index)
                    .filter(i -> Collections.max(leftBuildings) == buildingHeights[i])
                    .reduce((first, second) -> second)
                    .orElse(-1);
        } catch (Exception e) {
            System.out.println("There is no left max");
            return new ArrayList<>();
        }

        tallestBuildingOnEitherSideIndexValues.add(leftMaxIndexValue);
        tallestBuildingOnEitherSideIndexValues.add(rightMaxIndexValue);

        tallestBuildingOnEitherSide.add(leftMax);
        tallestBuildingOnEitherSide.add(rightMax);

        return tallestBuildingOnEitherSideIndexValues;
    }

    public static boolean isBuildingOnTheEdge(int index) {
        if (index == 0 || index == buildingHeights.length - 1) {
            System.out.println("Building is at the edge");
            return true;
        } else {
            return false;
        }
    }

    public static boolean isThereATallerBuildingOnEachSide(ArrayList<Integer> list) {
        if (list.size() == 2 && list.get(0) > 0 && list.get(1) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int calculateAreaBasedOnTallestBuildingEitherSide(ArrayList<Integer> tallestBuildingsOnEitherSide, int index) {
        // get the minimum of the two sides
        // then cycle through heights of elements in between and minus the current building heights from the minimum

        //int minIndex = Collections.min(tallestBuildingsOnEitherSide);

        //int minOfTallestBuildingValue = Math.min(buildingHeights[tallestBuildingsOnEitherSide.get(0)], buildingHeights[tallestBuildingsOnEitherSide.get(1)]);

        int newMinValue;
        if (buildingHeights[tallestBuildingsOnEitherSide.get(0)] >= buildingHeights[tallestBuildingsOnEitherSide.get(1)]) {
            newMinValue = buildingHeights[tallestBuildingsOnEitherSide.get(1)];
        } else {
            newMinValue = buildingHeights[tallestBuildingsOnEitherSide.get(0)];
        }
        int returnedArea = 0;

        for (int i = tallestBuildingsOnEitherSide.get(0); i < tallestBuildingsOnEitherSide.get(1); i++) {
            if (newMinValue - buildingHeights[i] >= 0) {
                returnedArea = returnedArea + (newMinValue - buildingHeights[i]);
            }
        }
        return returnedArea;
    }

    public Integer entryMethodUsedForTesting() {

        ArrayList<Integer> areas = new ArrayList<>();
        ArrayList<Integer> tallestBuildingsOnEitherSide;

        for (int i = 0; i < buildingHeights.length; i++) {
            if (!isBuildingOnTheEdge(i)) {
                tallestBuildingsOnEitherSide = getTheTallestBuildingOnEachSide(i);
                if (!isThereATallerBuildingOnEachSide(tallestBuildingsOnEitherSide)) {
                    continue;
                } else {
                    areas.add(calculateAreaBasedOnTallestBuildingEitherSide(tallestBuildingsOnEitherSide, i));
                }
            }
        }
        if (areas.size() !=0){
            Integer solution = Collections.max(areas);
            System.out.println("The solution is " + solution);
            return solution;
        }else {
            return 0;
        }

    }

    public static void main(String[] args) {
        /*ArrayList<Integer> areas = new ArrayList<>();
        ArrayList<Integer> tallestBuildingsOnEitherSide;

        for (int i = 0; i < buildingHeights.length; i++) {
            if (!isBuildingOnTheEdge(i)) {
                tallestBuildingsOnEitherSide = getTheTallestBuildingOnEachSide(i);
                if (!isThereATallerBuildingOnEachSide(tallestBuildingsOnEitherSide)) {
                    continue;
                } else {
                    areas.add(calculateAreaBasedOnTallestBuildingEitherSide(tallestBuildingsOnEitherSide, i));
                }
            }
        }
        Integer solution = Collections.max(areas);
        System.out.println("The solution is " + solution);*/
        RainfallChallenge rainfallChallenge = new RainfallChallenge(new int[]{1, 5, 6, 2, 6, 3, 4, 6, 2});
        rainfallChallenge.entryMethodUsedForTesting();
    }
}
