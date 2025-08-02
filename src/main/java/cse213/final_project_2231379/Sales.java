package cse213.final_project_2231379;

import java.time.LocalDate;
import java.util.List;

public class Sales {
    private String orderId;
    private LocalDate date;
    private double totalAmount;
    private List<String> itemsSold;
    private String paymentMethod;

    public Sales(String orderId, LocalDate date, double totalAmount, List<String> itemsSold, String paymentMethod) {
        this.orderId = orderId;
        this.date = date;
        this.totalAmount = totalAmount;
        this.itemsSold = itemsSold;
        this.paymentMethod = paymentMethod;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<String> getItemsSold() {
        return itemsSold;
    }

    public void setItemsSold(List<String> itemsSold) {
        this.itemsSold = itemsSold;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "orderId='" + orderId + '\'' +
                ", date=" + date +
                ", totalAmount=" + totalAmount +
                ", itemsSold=" + itemsSold +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
