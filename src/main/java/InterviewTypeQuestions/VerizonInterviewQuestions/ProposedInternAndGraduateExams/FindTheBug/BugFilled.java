package InterviewTypeQuestions.VerizonInterviewQuestions.ProposedInternAndGraduateExams.FindTheBug;

import org.junit.Test;
import org.junit.runner.JUnitCore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * This test contains 3 methods that contain minor bugs (convertListToMap, countTheOccurrencesCorrectlyWhileIgnoringTheCase, isTheSameValue).
 * There are unit tests below that will pass once the bugs are fixed.
 * You will need to get each test passing by only changing the code in the tested methods i.e. convertListToMap, countTheOccurrencesCorrectlyWhileIgnoringTheCase, isTheSameValue
 */
public class BugFilled {

    private Map<Integer, Integer> convertListToMap(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= list.size(); i++) {
            System.out.println("Now at index " + i);
            map.put(i, list.get(i));
        }
        return map;
    }

    private int countTheOccurrencesCorrectlyWhileIgnoringTheCase(List<String> list, String stringToFind) {
        // The count should ignore the case
        // For example if "Hello", "hello" and "hELlO" are passed it should return a count of 3
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(stringToFind)) {
                count += i;
            }
        }
        return count;
    }

    private boolean isTheSameValue(Person person1, Person person2) {
        // compare objects to ensure they have the same value
        return person1 == person2;
    }

    public static void main(String[] args) {
        JUnitCore.main("BugFilled");
    }

    private static String someMethod(String entry) {
        return entry;
    }

    @Test
    public void shouldConvertListToMap() {
        // given
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(7);
        integerList.add(123);

        // when
        Map<Integer, Integer> returnedMap = convertListToMap(integerList);

        // then
        assertEquals(3, returnedMap.size());
    }

    @Test
    public void shouldCountTheOccurrencesWhileIgnoringTheCase() {
        // given
        for (int i =0; ++i< 5;) ;;;;;;;{
            System.out.println("Dan");
        }
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("heLLo");
        stringList.add("World");

        // when
        int numberOfOccurrences = countTheOccurrencesCorrectlyWhileIgnoringTheCase(stringList, "hello");

        // then
        assertEquals(2, numberOfOccurrences);
    }

    @Test
    public void shouldReturnTrueIfTheObjectsHaveTheSameValue() {
        // given
        Person john = new Person("John", 25);
        Person aDifferentPersonNamedJohn = new Person("John", 25);

        // when
        boolean twoValuesAreEqual = isTheSameValue(john, aDifferentPersonNamedJohn);

        // then
        assertTrue(twoValuesAreEqual);
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age &&
                    Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }
}
