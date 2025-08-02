package com.example.fivestarthotel.FinalProject_UdoyRoy_2231379;

public class Table {
    private int tableID;
    private String type;
    private int capacity;
    private String status;

    public Table(int tableID, String type, int capacity, String status) {
        this.tableID = tableID;
        this.type = type;
        this.capacity = capacity;
        this.status = status;
    }

    public int getTableID() {
        return tableID;
    }

    public void setTableID(int tableID) {
        this.tableID = tableID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableID=" + tableID +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                ", status='" + status + '\'' +
                '}';
    }
}
