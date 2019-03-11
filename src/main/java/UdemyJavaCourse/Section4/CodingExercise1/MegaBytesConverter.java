package UdemyJavaCourse.Section4.CodingExercise1;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else if (kiloBytes == 0){
            System.out.println("0KB = 0MB and 0KB");
        } else {
            int megaByteValue = kiloBytes/1024;
            int remainingKilobyteValue = kiloBytes % 1024;
            System.out.println(kiloBytes+" KB = "+megaByteValue+" MB and "+remainingKilobyteValue+" KB");
        }
    }

    public static void main(String[] args) {
        //MegaBytesConverter megaBytesConverter = new MegaBytesConverter();

        printMegaBytesAndKiloBytes(23);
    }
}
