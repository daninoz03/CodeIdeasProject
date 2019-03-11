package Predicates.PresentationExample;

public class Employee {

    private String name;
    private int age;
    private String rank;
    private String location;

    public Employee(String name, int age, String rank, String location) {
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.location = location;
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

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
