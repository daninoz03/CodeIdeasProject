package UdemyJavaCourse.Section11.ScopeChallenge;

import java.util.Scanner;

public class Main {

    private int x;

    private void printTimesTables() {
        for (int x=1; x<=12; x++) {
            System.out.println(x+" times "+this.x+ " equals "+(x*this.x));
        }
    }

    public static void main(String[] args) {
        Main x = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter what times tables you wish to calculate:");
        x.x = scanner.nextInt();

        x.printTimesTables();

        scanner.close();
    }
}
