package InterviewTypeQuestions.JasonsQuestions;

import java.util.ArrayList;

public class SpiralPrint {


    // TODO: Finish the implementation off
    public static void spiralPrint(ArrayList<ArrayList<Integer>> list ) {

        for (int i= 0 ;i<list.size();i++) {
            for (int j=0; j<list.get(i).size(); j++) {

                if (i != 0 && j == 0) {
                    System.out.println(list.get(i).get(list.get(i).size()-1));
                }else {
                    System.out.println(list.get(i).get(j));
                }


                //list.remove(0);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        row1.add(4);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(5);
        row2.add(6);
        row2.add(7);
        row2.add(8);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(9);
        row3.add(10);
        row3.add(11);
        row3.add(12);

        ArrayList<Integer> row4 = new ArrayList<>();
        row4.add(13);
        row4.add(14);
        row4.add(15);
        row4.add(16);


        matrix.add(row1);
        matrix.add(row2);
        matrix.add(row3);
        matrix.add(row4);

        spiralPrint(matrix);
    }
}
