package UdemyJavaCourse.Section7.CompositionPart2Challenge;

public class Room {

    private String roomType;
    private int numberOfDoors;
    private boolean isEnSuite;
    private Wall wallDimensions;

    public Room(String roomType, int numberOfDoors, boolean isEnSuite, Wall wallDimensions) {
        this.roomType = roomType;
        this.numberOfDoors = numberOfDoors;
        this.isEnSuite = isEnSuite;
        this.wallDimensions = wallDimensions;
    }

    public void roomSummary() {
        System.out.println("The room type is "+getRoomType()+" and has "+numberOfDoors+" number of doors and wall height is "+wallDimensions.getHeight()+" and " +
                "wall width is "+wallDimensions.getWidth());
    }

    public String getRoomType() {
        return roomType;
    }

    /*public int getNumberOfDoors() {
        return numberOfDoors;
    }*/

    public boolean isEnSuite() {
        return isEnSuite;
    }
}
