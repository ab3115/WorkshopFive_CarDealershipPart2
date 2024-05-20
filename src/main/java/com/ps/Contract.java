package com.ps;

public abstract class Contract {
    protected String date;
    protected String customer_name;
    protected String customer_email;
    protected Vehicle vehicle_sold;
    protected double total_price;
    protected double monthly_payment;

    public Contract(String date, String customer_name, String customer_email, Vehicle vehicle_sold) {
        this.date = date;
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.vehicle_sold = vehicle_sold;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public Vehicle getVehicle_sold() {
        return vehicle_sold;
    }

    public void setVehicle_sold(Vehicle vehicle_sold) {
        this.vehicle_sold = vehicle_sold;
    }

    public abstract double getTotal_price();

    public abstract double getMonthly_payment();

}

