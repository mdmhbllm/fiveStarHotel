package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import java.io.Serializable;
import java.time.LocalDate;

public class Benefit implements Serializable {
   private String Name;
   private String id;
   private LocalDate Hiredates;
   private String Department;
   private String benefitType;


    public Benefit(String name, String id, LocalDate hiredates, String department, String benefitType) {
        Name = name;
        this.id = id;
        Hiredates = hiredates;
        Department = department;
        this.benefitType = benefitType;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getHiredates() {
        return Hiredates;
    }

    public void setHiredates(LocalDate hiredates) {
        Hiredates = hiredates;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getBenefitType() {
        return benefitType;
    }

    public void setBenefitType(String benefitType) {
        this.benefitType = benefitType;
    }

    @Override
    public String toString() {
        return "Benefit{" +
                "Name='" + Name + '\'' +
                ", id='" + id + '\'' +
                ", Hiredates=" + Hiredates +
                ", Department='" + Department + '\'' +
                ", benefitType='" + benefitType + '\'' +
                '}';
    }
}
