package TreesVSList;

import java.util.*;

public class TimeTest {

    public static void main(String[] args) {

        CollectionTimeTester<Set<Integer>> collectionTimeTester = new CollectionTimeTester<>();
        ListTimeTester listTimeTester = new ListTimeTester();

        Set<Integer> treeSet = new TreeSet<>();

        List<Integer> linkedList = new LinkedList<>();

        collectionTimeTester.testTimeForCollection(treeSet);
        listTimeTester.testTimeForCollection(linkedList);
    }
}
