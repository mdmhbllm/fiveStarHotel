package cse213.final_project_2231379;

import java.time.LocalDate;
import java.time.LocalTime;

public class Attendance {
    private Staff staff;
    private LocalDate date;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;
    private String status;

    public Attendance(Staff staff, LocalDate date, LocalTime checkInTime, LocalTime checkOutTime, String status) {
        this.staff = staff;
        this.date = date;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.status = status;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(LocalTime checkInTime) {
        this.checkInTime = checkInTime;
    }

    public LocalTime getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(LocalTime checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "staff=" + staff +
                ", date=" + date +
                ", checkInTime=" + checkInTime +
                ", checkOutTime=" + checkOutTime +
                ", status='" + status + '\'' +
                '}';
    }
}
