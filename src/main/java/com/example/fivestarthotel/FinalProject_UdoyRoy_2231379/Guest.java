package com.example.fivestarthotel.FinalProject_UdoyRoy_2231379;

public class Guest {
    private String guestId;
    private String name;
    private boolean isVIP;
    private String contact;

    public Guest(String guestId, String name, boolean isVIP, String contact) {
        this.guestId = guestId;
        this.name = name;
        this.isVIP = isVIP;
        this.contact = contact;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVIP() {
        return isVIP;
    }

    public void setVIP(boolean VIP) {
        isVIP = VIP;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guestId='" + guestId + '\'' +
                ", name='" + name + '\'' +
                ", isVIP=" + isVIP +
                ", contact='" + contact + '\'' +
                '}';
    }
}
