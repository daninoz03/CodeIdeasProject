package main.java;

import java.util.Map;
import java.util.Scanner;

/**
 * Created by danielobrien on 6/23/17.
 */
public class HackerRank {

    public static void main(String [] arg) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                if (x>Math.pow(-2,63) && x< Math.pow(2,63)) {

                    System.out.println(x + " can be fitted in:");
                    if (x >= -128 && x <= 127) System.out.println("* byte");
                    if (x >= -32768 && x <= 32767) System.out.println("* short");
                    if (x >= Math.pow(-2,31) && x <= Math.pow(2,31)) System.out.println("* int");
                    //if (x >= -128 && x <= 127) System.out.println("* long");
                }else {
                    throw new Exception();
                }
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }

}
