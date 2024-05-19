package com.ps;

public class SalesContract extends Contract{
    private double sales_tax_amount;
    private double recording_fee;
    private double processing_fee;
    private boolean finance;
    private double monthly_payment;

    public SalesContract(String date, String customer_name, String customer_email, String vehicle_sold, double total_price, double monthly_payment, double sales_tax_amount, double recording_fee, double prcoessing_fee, boolean finance, double monthly_payment1) {
        super(date, customer_name, customer_email, vehicle_sold, total_price, monthly_payment);
        this.sales_tax_amount = sales_tax_amount;
        this.recording_fee = recording_fee;
        this.processing_fee = processing_fee;
        this.finance = finance;
        this.monthly_payment = monthly_payment1;
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


}
