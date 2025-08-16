package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

public class ManageStaff {
    private int staffId;
    private String staffName;
    private String department;
    private String shiftTime;
    private String availability;
    private double performanceRating;

    public ManageStaff(int staffId, String staffName, String department, String shiftTime, String availability, double performanceRating) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.department = department;
        this.shiftTime = shiftTime;
        this.availability = availability;
        this.performanceRating = performanceRating;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
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

    public double getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(double performanceRating) {
        this.performanceRating = performanceRating;
    }

    @Override
    public String toString() {
        return "ManageStaff{" +
                "staffId=" + staffId +
                ", staffName='" + staffName + '\'' +
                ", department='" + department + '\'' +
                ", shiftTime='" + shiftTime + '\'' +
                ", availability='" + availability + '\'' +
                ", performanceRating=" + performanceRating +
                '}';
    }
}
