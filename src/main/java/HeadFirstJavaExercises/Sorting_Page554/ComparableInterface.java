package HeadFirstJavaExercises.Sorting_Page554;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ComparableInterface {


    private LinkedList<ComparableInterface.Mountain> mtn = new LinkedList<>();

    public static void main (String[] args) {
        ComparableInterface comparableInterface = new ComparableInterface();
        comparableInterface.go();


        Collection<String> arrayList = new ArrayList<>();
    }


    public void go() {
        mtn.add(new ComparableInterface.Mountain("Longs", 14255));
        mtn.add(new ComparableInterface.Mountain("Elbert", 14433));
        mtn.add(new ComparableInterface.Mountain("Maroon", 14156));
        mtn.add(new ComparableInterface.Mountain("Castle", 14265));

        System.out.println("as entered:\n" + mtn);
        Collections.sort(mtn);

        System.out.println("by name:\n" + mtn);
        Collections.sort(mtn);

        System.out.println("by height:\n" + mtn);
    }

    public class Mountain implements Comparable<Mountain>{
        private String name;
        private int height;

        public Mountain(String name, int height) {
            this.name = name;
            this.height = height;
        }

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

        @Override
        public int compareTo(Mountain mountain) {
            return mountain.getName().compareTo(name);
        }

        public int compareToHeight(Mountain mountain) {
            return mountain.getName().compareTo(name);
        }
    }
}
