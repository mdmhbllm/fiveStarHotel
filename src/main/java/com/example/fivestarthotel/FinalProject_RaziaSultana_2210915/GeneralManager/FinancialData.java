package com.example.fivestarthotel.FinalProject_RaziaSultana_2210915.GeneralManager;

import java.time.LocalDate;

public class FinancialData {
    private String department;
    private Double budget,monthly,expenses,revenue,profitMargin;
    private LocalDate month,year;

    public FinancialData(String department, Double budget, Double monthly, Double expenses, Double revenue, Double profitMargin, LocalDate month, LocalDate year) {
        this.department = department;
        this.budget = budget;
        this.monthly = monthly;
        this.expenses = expenses;
        this.revenue = revenue;
        this.profitMargin = profitMargin;
        this.month = month;
        this.year = year;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public Double getMonthly() {
        return monthly;
    }

    public void setMonthly(Double monthly) {
        this.monthly = monthly;
    }

    public Double getExpenses() {
        return expenses;
    }

    public void setExpenses(Double expenses) {
        this.expenses = expenses;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Double getProfitMargin() {
        return profitMargin;
    }

    public void setProfitMargin(Double profitMargin) {
        this.profitMargin = profitMargin;
    }

    public LocalDate getMonth() {
        return month;
    }

    public void setMonth(LocalDate month) {
        this.month = month;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "FinancialData{" +
                "department='" + department + '\'' +
                ", budget=" + budget +
                ", monthly=" + monthly +
                ", expenses=" + expenses +
                ", revenue=" + revenue +
                ", profitMargin=" + profitMargin +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
