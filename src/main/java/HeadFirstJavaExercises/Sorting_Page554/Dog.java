package HeadFirstJavaExercises.Sorting_Page554;

import java.util.List;

public class Dog {
    private String name;
    private int age;
    private List<String> previousOwners;

    public Dog(String name, int age, List<String> previousOwners) {
        this.name = name;
        this.age = age;
        this.previousOwners = previousOwners;
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

    public List<String> getPreviousOwners() {
        return previousOwners;
    }

    public void setPreviousOwners(List<String> previousOwners) {
        this.previousOwners = previousOwners;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", previousOwners=" + previousOwners +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (age != dog.age) return false;
        if (name != null ? !name.equals(dog.name) : dog.name != null) return false;
        return previousOwners != null ? previousOwners.equals(dog.previousOwners) : dog.previousOwners == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (previousOwners != null ? previousOwners.hashCode() : 0);
        return result;
    }
}
