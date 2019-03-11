package Predicates.PresentationExample;

import java.util.function.Predicate;

public class EmployeePredicateExample {

    public static Predicate<Integer> getEmployeesNearRetirement = e -> e >= 60 && e < 65;
    public static Predicate<String> getEmployeesWhoAreSoftwareEngineers = e -> e.contentEquals("Software Engineer");
    public static Predicate<Integer> getNonRetiredEmployees = e -> e < 65;

}
