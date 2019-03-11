package Generics.GlassExample;

public class Water implements Liquid {

    public int hydrogenAtoms;
    public int oxygenAtoms;

    public int getHydrogenAtoms() {
        return hydrogenAtoms;
    }

    public void setHydrogenAtoms(int hydrogenAtoms) {
        this.hydrogenAtoms = hydrogenAtoms;
    }

    public int getOxygenAtoms() {
        return oxygenAtoms;
    }

    public void setOxygenAtoms(int oxygenAtoms) {
        this.oxygenAtoms = oxygenAtoms;
    }

    @Override
    public Boolean isDrinkable() {
        return true;
    }

    @Override
    public Boolean isMedicine() {
        return false;
    }
}
