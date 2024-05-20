package com.ps;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContractFileManager {

    public void saveContract(Contract contract){

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("contracts.csv"));

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
