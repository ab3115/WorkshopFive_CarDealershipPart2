package com.ps;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminUserInterface {

    ArrayList<Contract> contracts;
    static Scanner scanner;

    public AdminUserInterface() {
        contracts = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    int menu_input;


    public void adminUserMenu(){

        do {
            System.out.println("Welcome to Administrator Mode, Please select an option:");
            System.out.println("1-List all contracts");
            System.out.println("2-List last 10 contracts");
            System.out.println("89-Exit Admin. Mode");
            menu_input = scanner.nextInt();


            switch (menu_input) {
                case 1:
                    processListAllContracts();
                    break;
                case 2:
                    processListLastTenContracts();
                    break;
                case 89:
                    System.out.println("exiting...");
                    return;
            }
        }while(menu_input != 89);
    }

    public void initialize(){
    ContractFileManager.getContract();
    }

    public void processListAllContracts(){

    }

    public void processListLastTenContracts(){

    }

}
