package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

public class ManageStaff {
    private String staffId,name,department,shiftTime,availability;
    private Double performanceRating;

    public ManageStaff(String staffId, String name, String department, String shiftTime, String availability, Double performanceRating) {
        this.staffId = staffId;
        this.name = name;
        this.department = department;
        this.shiftTime = shiftTime;
        this.availability = availability;
        this.performanceRating = performanceRating;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShiftTime() {
        return shiftTime;
    }

    public void setShiftTime(String shiftTime) {
        this.shiftTime = shiftTime;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public Double getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(Double performanceRating) {
        this.performanceRating = performanceRating;
    }

    @Override
    public String toString() {
        return "ManageStaff{" +
                "staffId='" + staffId + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", shiftTime='" + shiftTime + '\'' +
                ", availability='" + availability + '\'' +
                ", performanceRating=" + performanceRating +
                '}';
    }
}
