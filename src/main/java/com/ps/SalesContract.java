package com.ps;

public class SalesContract extends Contract{
    private double sales_tax_amount;
    private double recording_fee;
    private double processing_fee;
    private boolean finance;


    public SalesContract(String date, String customer_name, String customer_email, Vehicle vehicle_sold,double processing_fee, boolean finance){
        super(date, customer_name, customer_email, vehicle_sold);
        this.sales_tax_amount = 0.05 * vehicle_sold.getPrice();
        this.recording_fee = 100;
        if(vehicle_sold.getPrice() < 10000){
            this.processing_fee = 295;
        }else{
            this.processing_fee = 495;
        }
        this.finance = finance;

    }

    public double getSales_tax_amount() {
        return sales_tax_amount;
    }

    public void setSales_tax_amount(double sales_tax_amount) {
        this.sales_tax_amount = sales_tax_amount;
    }

    public double getRecording_fee() {
        return recording_fee;
    }

    public void setRecording_fee(double recording_fee) {
        this.recording_fee = recording_fee;
    }

    public double getProcessing_fee() {
        return processing_fee;
    }

    public void setProcessing_fee(double processing_fee) {
        this.processing_fee = processing_fee;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }

    @Override
    public double getTotal_price() {
        this.total_price =(vehicle_sold.getPrice() + sales_tax_amount + recording_fee + processing_fee);
        return total_price;
    }

    @Override
    public double getMonthly_payment(){

        double temp_total_price = getTotal_price();
        if (this.finance && (temp_total_price >= 10000)){
            this.monthly_payment = temp_total_price * 0.0425;
        } else if (this.finance && (temp_total_price < 10_000)) {
            this.monthly_payment = total_price * 0.0525;
        } else {
            this.monthly_payment = 0;
        }
        return this.monthly_payment;
    }


}
