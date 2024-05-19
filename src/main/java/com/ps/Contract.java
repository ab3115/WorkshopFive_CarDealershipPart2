package com.ps;

public class Contract {
    protected String date;
    protected String customer_name;
    protected String customer_email;
    protected String vehicle_sold;
    protected double total_price;
    protected double monthly_payment;

    public Contract(String date, String customer_name, String customer_email, String vehicle_sold, double total_price, double monthly_payment) {
        this.date = date;
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.vehicle_sold = vehicle_sold;
        this.total_price = total_price;
        this.monthly_payment = monthly_payment;
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

    public String getVehicle_sold() {
        return vehicle_sold;
    }

    public void setVehicle_sold(String vehicle_sold) {
        this.vehicle_sold = vehicle_sold;
    }

    public void getTotal_price() {

    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    public void getMonthly_payment() {

    }

    public void setMonthly_payment(double monthly_payment) {
        this.monthly_payment = monthly_payment;
    }
}

