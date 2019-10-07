package TreesVSList;

import java.util.Collections;
import java.util.List;

public class ListTimeTester extends CollectionTimeTester<List<Integer>> {

    @Override
    protected void executeAdditionalLogic(List<Integer> list) {
        Collections.sort(list);
    }
}
