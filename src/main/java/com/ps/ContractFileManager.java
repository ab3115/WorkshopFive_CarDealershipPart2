package com.ps;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContractFileManager {

    public void saveContract(Contract contract){

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("contracts.csv", true));
                if(contract instanceof SalesContract){
                bufferedWriter.write(String.format("SALE |%s|%s|%s\n" + "%d|%d|%s|%s|%s|%s|%d|%.2f\n" + "%2f|%.2f|%.2f|%.2f|%s|%.2f\n",
                        contract.getDate(),
                        contract.getCustomer_name(),
                        contract.getCustomer_email(),
                        contract.getVehicle_sold().getVin(),
                        contract.getVehicle_sold().getYear(),
                        contract.getVehicle_sold().getMake(),
                        contract.getVehicle_sold().getModel(),
                        contract.getVehicle_sold().getVehicleType(),
                        contract.getVehicle_sold().getColor(),
                        contract.getVehicle_sold().getOdometer(),
                        contract.getVehicle_sold().getPrice(),
                        ((SalesContract) contract).getSales_tax_amount(),
                        ((SalesContract) contract).getRecording_fee(),
                        ((SalesContract) contract).getProcessing_fee(),
                        contract.getTotal_price()));

                }else{
                    bufferedWriter.write(String.format("LEASE |%s|%s|%s|\n" + "%d|%d|%s|%s|%s|%s|%d|%.2f|\n" + "%.2f|%.2f|%.2f|%.2f\n",
                            contract.getDate(),
                            contract.getCustomer_name(),
                            contract.getCustomer_email(),
                            contract.getVehicle_sold().getVin(),
                            contract.getVehicle_sold().getYear(),
                            contract.getVehicle_sold().getMake(),
                            contract.getVehicle_sold().getModel(),
                            contract.getVehicle_sold().getVehicleType(),
                            contract.getVehicle_sold().getColor(),
                            contract.getVehicle_sold().getOdometer(),
                            contract.getVehicle_sold().getPrice(),
                            ((LeaseContract) contract).getExpected_ending_value(),
                            ((LeaseContract) contract).getLease_fee(),
                            contract.getTotal_price(),
                            contract.getMonthly_payment()
                    ));
                }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
