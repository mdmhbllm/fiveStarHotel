package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.Supplier;

public class SupplierDashboard {
    private String Id;
    private String companyName;
    private String email;
    private String password;
    private String role;

    public SupplierDashboard(String id, String companyName, String email, String password, String role) {
        Id = id;
        this.companyName = companyName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "SupplierDashboard{" +
                "Id='" + Id + '\'' +
                ", companyName='" + companyName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
