package InterviewTypeQuestions.DominiksInterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Employee {

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

class Main {

    public static void main(String[] args) {
        Employee emp = new Employee("Dan", 35);
        Map<Employee, Integer> salaries = new HashMap<>();
        salaries.put(emp, 50000);

        System.out.println("The best employee's salary is " + salaries.get(emp));

        emp.setAge(emp.getAge() + 1);

        /*
         * Employee will now be null because the hashmap key is not the object but its hashcode.
         * So you will be able to get the salary back only if its hashcode is unchanged.
         * Therefore, the only reliable way to set keys in a hashmap is when you use immutable objects as keys
         * like `String` or `Long` etc
         */

        System.out.println("The best employee's salary is " + salaries.get(emp));
    }
}
