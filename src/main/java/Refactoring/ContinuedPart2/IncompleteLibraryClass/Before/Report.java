package Refactoring.ContinuedPart2.IncompleteLibraryClass.Before;

import java.util.Date;

/**
 * A read only library class has missing methods
 */
public class Report {

    Date previousEnd;

    void sendReport() {
        Date nextDay = new Date(previousEnd.getYear(),
                previousEnd.getMonth(), previousEnd.getDate() + 1);
        //...
    }
}
