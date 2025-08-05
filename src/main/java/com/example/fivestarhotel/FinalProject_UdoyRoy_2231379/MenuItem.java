package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import java.time.LocalDate;

public class MenuItem {
    private String itemId;
    private String name;
    private String category;
    private double price;
    private LocalDate lastUpdate;

    public MenuItem(String itemId, String name, String category, double price, LocalDate lastUpdate) {
        this.itemId = itemId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.lastUpdate = lastUpdate;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDate lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "itemId='" + itemId + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
