package HeadFirstJavaExercises.Sorting_Page554;

import java.util.*;

public class SortMountains {

    private LinkedList<Mountain> mtn = new LinkedList<>();

    class NameCompare implements Comparator<Mountain>{
        public int compare(Mountain one, Mountain two) {
            return one.getName().compareTo(two.getName());
        }
    }

    class HeightCompare implements Comparator<Mountain>{
        public int compare(Mountain one, Mountain two) {
            return two.getHeight() - one.getHeight();
        }
    }

    public static void main(String[] args) {
        new SortMountains().go();
    }

    public void go() {
        mtn.add(new Mountain("Longs", 14255));
        mtn.add(new Mountain("Elbert", 14433));
        mtn.add(new Mountain("Maroon", 14156));
        mtn.add(new Mountain("Castle", 14265));

        System.out.println("as entered:\n" + mtn);
        NameCompare nc = new NameCompare();
        Collections.sort(mtn, nc);

        System.out.println("by name:\n" + mtn);
        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn, hc);

        System.out.println("by height:\n" + mtn);
    }

    class Mountain {

        public Mountain(String name, int height) {
            this.name = name;
            this.height = height;
        }

        private String name;
        private int height;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String toString() {
            return name + " " + height;
        }
    }
}
