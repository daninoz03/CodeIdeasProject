package Streams;

import Streams.Lambdas.Functions.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {





  public void capitaliseUsingForEach(List<String> list) {

    list.forEach(e -> System.out.println(e.toUpperCase()));
  }


  /**
   * map() produces a new stream after applying a function to each element of the original stream. The new stream could be of different type.
   * @param list
   */
  public void map(List<String> list) {
    Integer[] employeeIds = new Integer[]{1,2,3};

    List<Employee> employees = Stream.of(employeeIds)
      .map(this::getEmployeeById)
      .collect(Collectors.toList());

  }

  public void collect(List<String> list) {

  }


  public List<String> filter(List<String> list) {

    return list.stream().filter(e -> e.contains("Dan"))
      .collect(Collectors.toList());

  }

  public Employee findFirst(List<Employee> list) {

    return list.stream()
      .filter(e -> e.getName() != null)
      .filter(employee -> employee.getAge()>33)
      .findFirst()
      .orElse(null);
  }


  public Employee[] toArray(List<Employee> list) {

    Employee[] employeesArray = list.stream().toArray(Employee[]::new);
    return employeesArray;
  }


  public List<String> flatMap() {

    List<List<String>> namesNested = Arrays.asList(
      Arrays.asList("Jeff", "Bezos"),
      Arrays.asList("Bill", "Gates"),
      Arrays.asList("Mark", "Zuckerberg"));

    List<String> namesFlatStream = namesNested.stream()
      .flatMap(Collection::stream)
      .collect(Collectors.toList());
    return namesFlatStream;
  }

  public void peek(List<String> list) {

  }


  public static void main(String[] args) {
    StreamExamples streamExamples = new StreamExamples();

    List<String> stringList = new ArrayList<>();
    stringList.add("Hello");
    stringList.add("Big");
    stringList.add("World");

    streamExamples.capitaliseUsingForEach(stringList);



    streamExamples.flatMap();
  }

  private Employee getEmployeeById(Integer id) {
    List<Employee> employees = new ArrayList<>();

    Employee employee1 = new Employee("Dan", 34);
    Employee employee2 = new Employee("Paul", 33);
    Employee employee3 = new Employee("Ringo", 32);

    employees.add(employee1);
    employees.add(employee2);
    employees.add(employee3);

    return (Employee) employees.stream().filter(employee -> employee.getAge() == id);

  }

}
