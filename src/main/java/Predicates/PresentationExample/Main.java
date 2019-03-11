package Predicates.PresentationExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {


    public static List<Employee> filterByRankList(List<Employee> employees, Predicate<String> stringPredicate){
        List<Employee> returnedEmployees = new ArrayList<>();
        for (Employee employee: employees){
            if (stringPredicate.test(employee.getRank())){
                returnedEmployees.add(employee);
            }
        }
        return returnedEmployees;
    }


    public static List<Employee> filterByAgeList(List<Employee> employees, Predicate<Integer> integerPredicate) {
        List<Employee> retrunedListOfEmployees = new ArrayList<>();
        for (Employee employee: employees){
            if (integerPredicate.test(employee.getAge())){
                retrunedListOfEmployees.add(employee);
            }
        }
        return retrunedListOfEmployees;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 56, "Software Engineer", "Dublin");
        Employee employee2 = new Employee("Sarah", 23,"Software Engineer", "New York");
        Employee employee3 = new Employee("Dave",68, "N/A", "Dreieich");
        Employee employee4 = new Employee("Richie",62, "Manager", "Belfast");
        Employee employee5 = new Employee("Mandy",64, "Product Manager", "Brasov");
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);


        List<Employee> filteredListOfSoftwareEngineerEmployees = filterByRankList(employees, EmployeePredicateExample.getEmployeesWhoAreSoftwareEngineers);
        filteredListOfSoftwareEngineerEmployees.forEach(employee -> System.out.println(employee.getName()+" is a software engineer."));

        List<Employee> filterListOfEmployeesNearRetirement = filterByAgeList(employees, EmployeePredicateExample.getEmployeesNearRetirement);
        filterListOfEmployeesNearRetirement.forEach(employee -> System.out.println(employee.getName()+" is near retirement."));

        List<Employee> filterListOfEmployeesNotRetired = filterByAgeList(employees, EmployeePredicateExample.getNonRetiredEmployees);
        filterListOfEmployeesNotRetired.forEach(employee -> System.out.println(employee.getName()+" is not retired."));

    }
}
