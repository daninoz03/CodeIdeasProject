package UdemyJavaCourse.Section7.EncapsulationChallenge;

public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplexPrinter) {
        if (tonerLevel >=0 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = 0;
        }

        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void fillPrinter(int amount) {
        if (amount+this.tonerLevel > 100){
            this.tonerLevel = 100;
            System.out.println("Too much toner added. Toner level is at maximum!");
        } else if (amount + this.tonerLevel > 0 && amount + this.tonerLevel < 100){
            this.tonerLevel = this.tonerLevel + amount;
            System.out.println("New toner level is "+this.tonerLevel);
        } else{
            System.out.println("Incorrect amount!");
        }

    }

    public void printPage(int pageNum) {
        double pagesToPrint = pageNum;
        if (this.isDuplexPrinter){
            pagesToPrint = Math.ceil(pageNum/2.0);
        }
        System.out.println("The number of pages to print is "+pagesToPrint+" as duplex printing is "+this.isDuplexPrinter);
    }

    public static void main(String[] args) {
        Printer printer = new Printer(50, 5, true);
        printer.printPage(5);

        Printer printerNonDuplex = new Printer(50, 5, false);
        printerNonDuplex.printPage(5);
    }
}
