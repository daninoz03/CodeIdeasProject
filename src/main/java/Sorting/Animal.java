package Sorting;

public class Animal {

    private String species;
    private int topSpeed;

    public Animal(String species, int topSpeed) {
        this.species = species;
        this.topSpeed = topSpeed;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", topSpeed=" + topSpeed +
                '}';
    }
}
