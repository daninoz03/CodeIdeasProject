package Generics.GlassExample;

public class Solpadeine implements Liquid {
    @Override
    public Boolean isDrinkable() {
        return true;
    }

    @Override
    public Boolean isMedicine() {
        return true;
    }
}
