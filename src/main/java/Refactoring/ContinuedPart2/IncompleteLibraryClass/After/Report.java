package Refactoring.ContinuedPart2.IncompleteLibraryClass.After;

import java.util.Date;

public class Report {

    Date previousEnd;
    void sendReport() {
        Date newStart = nextDay(previousEnd);
        //...
    }
    public static Date nextDay(Date arg) {
        return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
    }
}
