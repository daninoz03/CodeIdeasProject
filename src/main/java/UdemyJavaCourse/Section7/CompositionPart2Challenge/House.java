package UdemyJavaCourse.Section7.CompositionPart2Challenge;

public class House {

    public static void main(String[] args) {

        Wall wall = new Wall(2.5,3.6);
        Room bedroom = new Room("Bedroom",2, true, wall);

        bedroom.roomSummary();
    }
}
