package com.pluralsight;

import java.math.BigDecimal;

public abstract class Contract {
    String date;
    String customerName;
    String customerEmail;
    int vehicleSold;
    BigDecimal totalPrice;
    BigDecimal monthlyPayment;

    public Contract(String date, String customerName, String customerEmail, int vehicleSold) {
        this.date = date;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(int vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    // abstract classes for price and payments that will return computed values based on contract type.
    public abstract void getTotalPrice();

    public abstract void getMonthlyPayment();
}
