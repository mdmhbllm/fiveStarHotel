package cse213.final_project_2231379;

public class Venue {
    private String venueId;
    private String name;
    private int capacity;

    public Venue(String venueId, String name, int capacity) {
        this.venueId = venueId;
        this.name = name;
        this.capacity = capacity;
    }

    public String getVenueId() {
        return venueId;
    }

    public void setVenueId(String venueId) {
        this.venueId = venueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "venueId='" + venueId + '\'' +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
