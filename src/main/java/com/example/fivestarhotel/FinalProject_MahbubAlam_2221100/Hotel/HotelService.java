package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel;

import java.io.Serializable;

public class HotelService implements Serializable {
    private String serviceId;
    private String name;
    private String description;
    private double price;
    private String availability;  // "Available", "Unavailable"

    public HotelService(String serviceId, String name, String description, double price, String availability) {
        this.serviceId = serviceId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.availability = availability;
    }

    public String getServiceDetails() {
        return "Service ID: " + serviceId + "\n" +
                "Name: " + name + "\n" +
                "Description: " + description + "\n" +
                "Price: $" + price + "\n" +
                "Availability: " + availability;
    }

    public boolean isAvailable() {
        if (availability == null) {
            return false;
        } else if (availability.equals("Available")) {
            return true;
        } else {
            return false;
        }
    }

    public void updateAvailability() {
        if (availability == null || availability.equals("Unavailable")) {
            availability = "Available";
        } else if (availability.equals("Available")) {
            availability = "Unavailable";
        }
    }


    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAvailability() {
        return availability;
    }
}
