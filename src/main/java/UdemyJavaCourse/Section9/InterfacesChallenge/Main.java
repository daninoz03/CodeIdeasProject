package UdemyJavaCourse.Section9.InterfacesChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void saveObject(Savable objectToSave) {
        for (int i = 0; i< objectToSave.write().size(); i++){
            System.out.println("Saving "+ objectToSave.write().get(i)+ " to storage device.");
        }
    }

    public static void loadObject(Savable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

    public static void main(String[] args) {

        Player dan = new Player("Dan", 100, 50);
        System.out.println(dan.toString());
        saveObject(dan);

        dan.setHitPoints(120);
        System.out.println(dan);
        dan.setWeapon("StormBringer");
        saveObject(dan);
        loadObject(dan);
        System.out.println(dan);


        Savable werewolf = new Monster("Werewolf", 100, 50);
        //Need to cast to monster type as it's declared as an interface
        System.out.println("Monster's name is "+ ((Monster)werewolf).getName());
        System.out.println(werewolf);
        saveObject(werewolf);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }


}
