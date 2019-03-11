package ExceptionChain;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private Integer id;
    private String name;
    private ArrayList<String> managers;

    public ArrayList<String> getManagers() {
        return managers;
    }

    public void setManagers(ArrayList<String> managers) {
        this.managers = managers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
