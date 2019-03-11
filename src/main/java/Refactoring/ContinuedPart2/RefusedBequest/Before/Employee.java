package Refactoring.ContinuedPart2.RefusedBequest.Before;

/**
 * Some functions of parent class are useless to child class
 */
public class Employee {

    private String name;
    private int id;
    private int quota;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }
}
