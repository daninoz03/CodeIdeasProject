package Refactoring.DataClumps.After;

public class CustomerRefactored {


    private String name;
    private int age;
    private int houseNumber;
    private String street;
    private String city;
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
