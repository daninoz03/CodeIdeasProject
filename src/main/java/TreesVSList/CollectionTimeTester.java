package TreesVSList;

import org.apache.commons.lang3.time.StopWatch;

import java.util.Collection;
import java.util.Random;

public class CollectionTimeTester<T extends Collection<Integer>> {

    private void addElementsToCollection(T collection) {


        for (int i = 0; i <= 100000; i++) {
            Random random = new Random();
            //Setting the bound to more than the count as treesets don't allow duplicates
            int randomInt = random.nextInt(10000000);


            collection.add(randomInt);
        }
    }

    public void testTimeForCollection(T collection) {

        StopWatch timer = new StopWatch();
        timer.start();
        addElementsToCollection(collection);
        executeAdditionalLogic(collection);
        timer.stop();
        System.out.println("Time taken for " + collection.getClass().getSimpleName() + " is " + timer.getTime());
        System.out.println(""+collection.getClass().getSimpleName()+" has "+collection.size()+" elements");
    }

    protected void executeAdditionalLogic(T list) {

    }
}
