package Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * This example is very similar to using Predicates
 */
public class SomeClass {


    private static List<String> getEmployeeNames(List<Employee> employeeList, Function<Employee, String> function) {
        List<String> returnedListOfNames = new ArrayList<>();
        for (Employee employee: employeeList){
            returnedListOfNames.add(function.apply(employee));
        }
        return returnedListOfNames;

    }

    public static void main(String[] args) {

        Function<Employee, String> employeeFunctionToString = employee -> employee.getName();
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bob",55,12345));
        employees.add(new Employee("John",32,1324));
        employees.add(new Employee("Paul",40,54321));


        List<String> employeeNames = getEmployeeNames(employees, employeeFunctionToString);
        employeeNames.forEach(employee -> System.out.println(employee));
    }


}
