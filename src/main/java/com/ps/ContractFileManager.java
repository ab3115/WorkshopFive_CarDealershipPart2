package com.ps;
import java.io.*;

public class ContractFileManager {

    public static void saveContract(Contract contract){

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("contracts.csv", true));
                if(contract instanceof SalesContract){
                bufferedWriter.write(String.format("SALE |%s|%s|%s\n" + "%d|%d|%s|%s|%s|%s|%d|%.2f\n" + "%2f|%.2f|%.2f|%.2f|%.2f\n",
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
                        contract.getTotal_price(),
                        contract.getMonthly_payment()));

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
                bufferedWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    public static void getContract(){
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("contracts.csv"));
            String contract_info = bufferedReader.readLine();
            int count = 0;
            while(contract_info != null && count <= 3) {
                String[] splitFirstLine = contract_info.split("\\|");

                String date = splitFirstLine[0];
                String name = splitFirstLine[1];
                String email = splitFirstLine[2];

                String[] splitSecondLine = contract_info.split("\\|");

                String[] splitThirdLine = contract_info.split("\\|");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
