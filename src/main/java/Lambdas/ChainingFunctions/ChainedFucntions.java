package Lambdas.ChainingFunctions;

import Lambdas.Functions.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

public class ChainedFucntions {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee john = new Employee("John Doe", 20);
        Employee paul = new Employee("Paul Jones", 46);
        Employee mike = new Employee("Mike Starr", 77);
        Employee layne = new Employee("Layne Stayley", 27);

        employees.add(john);
        employees.add(paul);
        employees.add(mike);
        employees.add(layne);



        Function<Employee, String> upperCaseName = (Employee employee) -> {
            return employee.getName().toUpperCase();
        };

        Function<String, String> firstName = (String name) -> {
          return name.substring(0, name.indexOf(' '));
        };
        /**
         * andThen method
         */
        Function chainedFunction = upperCaseName.andThen(firstName);

        System.out.println(chainedFunction.apply(employees.get(0)));


        /**
         * compose method reverses the call order when compared to 'andThen'
         */
        Function<String, String> upperCaseNameCompose = (String employee) -> {
            return employee.toUpperCase();
        };
        Function<Employee, String> firstNameEmployee = (Employee employee) -> {
            return employee.getName().substring(0, employee.getName().indexOf(' '));
        };

        Function chainedFunctionCompose = upperCaseNameCompose.compose(firstNameEmployee);

        System.out.println(chainedFunctionCompose.apply(employees.get(2)));

        /**
         * BiFunction method combines two functions:
         * can be chained if it is the start of the chain. Cannot be the 2nd or further in the chain
         */
        BiFunction<String, Employee, String> concatAge = (String name, Employee employee) -> {
            return name.concat(" "+ employee.getAge());
        };
        String upperName = upperCaseName.apply(employees.get(2));
        System.out.println(concatAge.apply(upperName, employees.get(2)));

        /**
         * Unary operator: accepts a single argument and return a value of the same type
         */

        IntUnaryOperator incrementBy5 = i -> i +5;
        System.out.println(incrementBy5.applyAsInt(5));


        int a[][] = new int[3][];
        a[1] = new int[]{1,2,3};
               a[2] = new int[]{4,5};
           System.out.print(a[1][1]);

    }
}
