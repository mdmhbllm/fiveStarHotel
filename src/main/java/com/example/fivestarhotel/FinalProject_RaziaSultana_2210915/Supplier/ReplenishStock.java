package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.Supplier;

public class ReplenishStock {
    private String itemName;
    private Integer currentStockLevel;
    private  Integer recommendedQuantity;
    private String deliveryWindow;

    public ReplenishStock(String itemName, Integer currentStockLevel, Integer recommendedQuantity, String deliveryWindow) {
        this.itemName = itemName;
        this.currentStockLevel = currentStockLevel;
        this.recommendedQuantity = recommendedQuantity;
        this.deliveryWindow = deliveryWindow;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getCurrentStockLevel() {
        return currentStockLevel;
    }

    public void setCurrentStockLevel(Integer currentStockLevel) {
        this.currentStockLevel = currentStockLevel;
    }

    public Integer getRecommendedQuantity() {
        return recommendedQuantity;
    }

    public void setRecommendedQuantity(Integer recommendedQuantity) {
        this.recommendedQuantity = recommendedQuantity;
    }

    public String getDeliveryWindow() {
        return deliveryWindow;
    }

    public void setDeliveryWindow(String deliveryWindow) {
        this.deliveryWindow = deliveryWindow;
    }

    @Override
    public String toString() {
        return "ReplenishStock{" +
                "itemName='" + itemName + '\'' +
                ", currentStockLevel=" + currentStockLevel +
                ", recommendedQuantity=" + recommendedQuantity +
                ", deliveryWindow='" + deliveryWindow + '\'' +
                '}';
    }
}
