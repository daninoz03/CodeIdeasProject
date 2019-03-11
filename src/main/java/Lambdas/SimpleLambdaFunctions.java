package Lambdas;

public class SimpleLambdaFunctions {


    public static void main(String[] args) {

        LambdaPrintMessage printMessageLambda = () ->
            System.out.println("Hello world");

        LambdaAdd addFunction = (int a, int b) -> {
            return a + b;
        };

    }


    interface LambdaPrintMessage {
        void foo();
    }

    interface LambdaAdd {
        int foo(int a, int b);
    }
}
