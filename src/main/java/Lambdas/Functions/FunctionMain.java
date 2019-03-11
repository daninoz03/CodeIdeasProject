package Lambdas.Functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


/**
 * The primary purpose for using the Function class is for mapping scenarios
 * i.e. when an object of a type is taken as an input and it is converted to another type
 */
public class FunctionMain {


    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee john = new Employee("John Doe", 27);
        Employee paul = new Employee("Paul Jones", 31);
        Employee mike = new Employee("Mike Starr", 24);
        Employee layne = new Employee("Layne Stayley", 22);

        employees.add(john);
        employees.add(paul);
        employees.add(mike);
        employees.add(layne);


        Function<Employee, String> getLastName = (Employee employee) -> {
            return employee.getName().substring(employee.getName().indexOf(' ')+1);
        };

        System.out.println("Last Name of John is: "+getLastName.apply(employees.get(3)));

        Function<Employee, String> getFirstName = (Employee employee) -> {
            return employee.getName().substring(0, employee.getName().indexOf(' '));
        };

        System.out.println("The third employee's first name is: "+getFirstName.apply(employees.get(2)));
    }
}
