package UdemyJavaCourse.Section8.OrderedLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class OrderedLinkedList {

    public static void main(String[] args) {


        LinkedList<String> cities = new LinkedList<>();
        addOrderedCitiesToList(cities, "Dublin");
        addOrderedCitiesToList(cities, "Galway");
        addOrderedCitiesToList(cities, "Cork");
        addOrderedCitiesToList(cities, "Belfast");
        addOrderedCitiesToList(cities, "Wicklow");



        printList(cities);
    }

    private static void printList(LinkedList<String> cities) {


        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()){
            System.out.println("Now printing "+iterator.next());
        }
    }

    private static boolean addOrderedCitiesToList(LinkedList<String> cities, String newCity) {

        ListIterator<String> iterator = cities.listIterator();

        while(iterator.hasNext()){
            int comparison = iterator.next().compareTo(newCity);
            if (comparison==0){
                //equal, do not add
                System.out.println(newCity+" already exists!");
                return false;
            }else if (comparison>0){
                // new city should appear before this one
                iterator.previous();
                iterator.add(newCity);
                return true;
            }else if(comparison<0){
                //move onto next city
            }


        }
        iterator.add(newCity);
        return true;

    }
}
