package Top5Algorithms;

import com.sun.source.tree.Tree;

import java.util.*;

public class TopOrBottomKAlgorithm {


    public List<Integer> getTopKElements(List<Integer> integerList, int k) {
        // Using a heap
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < integerList.size(); i++) {
            priorityQueue.add(integerList.get(i));
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
        List<Integer> listOfKElements = new ArrayList<>(priorityQueue);
        Collections.sort(listOfKElements);
        return listOfKElements;
    }

    public List<Integer> getBottomKElements(List<Integer> integerList, int k) {

        TreeSet<Integer> treeSet = new TreeSet<>(integerList);

        List<Integer> returnedList = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            returnedList.add(treeSet.getFirst());
            treeSet.removeFirst();
        }

        return returnedList;
    }
}
