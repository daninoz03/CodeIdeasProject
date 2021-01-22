package UdemyJavaCourse.Section12.AdventureGameChallenge;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private int locationId;
    private String currentLocationInfo;
    private final Map<String, Integer> exits;

    public Map<String, Integer> getExits() {
        return exits;
    }

    public Location(int locationId, String currentLocationInfo) {
        this.locationId = locationId;
        this.currentLocationInfo = currentLocationInfo;
        this.exits = new HashMap<>();
    }

    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getCurrentLocationInfo() {
        return currentLocationInfo;
    }

    public void setCurrentLocationInfo(String currentLocationInfo) {
        this.currentLocationInfo = currentLocationInfo;
    }
}
