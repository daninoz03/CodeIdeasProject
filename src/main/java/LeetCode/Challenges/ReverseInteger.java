package LeetCode.Challenges;

public class ReverseInteger {


    public int reverseTheInt(int x) {
        String returnedIntString = "";
        while(x > 0) {
            returnedIntString = returnedIntString.concat(String.valueOf(x%10));
            x = x/10;
        }
        return Integer.parseInt(returnedIntString);
    }

    public long reverseTheIntNotUsingString(Integer x) {
        boolean negativeNumber = false;
        if (x <0) {
            negativeNumber = true;
            x=  -x;
        }
        long returnedInt = 0;
        int multiplier = (int) Math.pow(10, (String.valueOf(x).length()-1));
        while(x > 0) {
            returnedInt = returnedInt + ((x%10) * multiplier);
            x = x/10;
            multiplier = multiplier /10;
        }
        if (returnedInt < Integer.MIN_VALUE || returnedInt > Integer.MAX_VALUE){
            return 0;
        }
        if (negativeNumber){
            return (int)-returnedInt;
        }else{
            return (int)returnedInt;
        }
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();

        int integerToReverse = -123456;

        //System.out.println(reverseInteger.reverseTheInt(integerToReverse));


        System.out.println(reverseInteger.reverseTheIntNotUsingString(integerToReverse));

        System.out.println(reverseInteger.reverseTheIntNotUsingString(1534236469));
    }
}
