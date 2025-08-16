package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

public class MonitorFinances {
    private String departmentName;
    private double departmentBudget;
    private double monthlyExpenses;
    private double revenue;
    private double profitMargin;
    private String period;

    public MonitorFinances(String departmentName, double departmentBudget, double monthlyExpenses) {
        this.departmentName = departmentName;
        this.departmentBudget = departmentBudget;
        this.monthlyExpenses = monthlyExpenses;
        this.revenue = revenue;
        this.profitMargin = profitMargin;
        this.period = period;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getDepartmentBudget() {
        return departmentBudget;
    }

    public void setDepartmentBudget(double departmentBudget) {
        this.departmentBudget = departmentBudget;
    }

    public double getMonthlyExpenses() {
        return monthlyExpenses;
    }

    public void setMonthlyExpenses(double monthlyExpenses) {
        this.monthlyExpenses = monthlyExpenses;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getProfitMargin() {
        return profitMargin;
    }

    public void setProfitMargin(double profitMargin) {
        this.profitMargin = profitMargin;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "MonitorFinances{" +
                "departmentName='" + departmentName + '\'' +
                ", departmentBudget=" + departmentBudget +
                ", monthlyExpenses=" + monthlyExpenses +
                ", revenue=" + revenue +
                ", profitMargin=" + profitMargin +
                ", period='" + period + '\'' +
                '}';
    }
}
