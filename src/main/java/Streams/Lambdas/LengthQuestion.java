package Streams.Lambdas;

public class LengthQuestion {


    public static void main(String[] args) {
        LambdaInterface stringLength = (String s) -> s.length();

        int x = stringLength.length("Something");
        System.out.println(x);
    }

    interface LambdaInterface {
        int length(String s);
    }
}
