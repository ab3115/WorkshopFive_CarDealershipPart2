package com.ps;

public class LeaseContract extends Contract{
    private double expected_ending_value;
    private double lease_fee;

    public LeaseContract(String date, String customer_name, String customer_email, Vehicle vehicle_sold,double expected_ending_value, double lease_fee){
        super(date, customer_name, customer_email, vehicle_sold);
        this.expected_ending_value = vehicle_sold.getPrice() * 0.5;
        this.lease_fee = vehicle_sold.getPrice() * 0.07;
    }

    public double getExpected_ending_value() {
        return expected_ending_value;
    }

    public void setExpected_ending_value(double expected_ending_value) {
        this.expected_ending_value = expected_ending_value;
    }

    public double getLease_fee() {
        return lease_fee;
    }

    public void setLease_fee(double lease_fee) {
        this.lease_fee = lease_fee;
    }

    @Override
    public double getTotal_price() {
        this.total_price = getLease_fee() + getExpected_ending_value();
        return total_price;
    }

    @Override
    public double getMonthly_payment() {
        this.monthly_payment = getTotal_price() * 0.04;
        return 0;
    }
}
