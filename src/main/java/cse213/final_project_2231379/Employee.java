package cse213.final_project_2231379;

import java.time.LocalDate;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private String role;
    private LocalDate hireDate;
    private String eligibilityStatus;

    public Employee(int employeeId, String name, String department, String role, LocalDate hireDate, String eligibilityStatus) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.role = role;
        this.hireDate = hireDate;
        this.eligibilityStatus = eligibilityStatus;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getEligibilityStatus() {
        return eligibilityStatus;
    }

    public void setEligibilityStatus(String eligibilityStatus) {
        this.eligibilityStatus = eligibilityStatus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", role='" + role + '\'' +
                ", hireDate=" + hireDate +
                ", eligibilityStatus='" + eligibilityStatus + '\'' +
                '}';
    }
}
