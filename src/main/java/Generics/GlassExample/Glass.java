package Generics.GlassExample;

public class Glass <Object extends Liquid> {

    //private T liquid;
    public static void main(String[] args) {
        /*Water water = new Water();
        water.setHydrogenAtoms(1);
        water.setOxygenAtoms(2);*/
        Glass<Water> waterGlass = new Glass<Water>();
        //Glass<Cake> cakeGlass = new Glass<Cake>();

        Glass<Solpadeine> solpadeineGlass = new Glass<>();



    }

}
