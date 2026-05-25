package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //add scanner
    static Scanner myScanner = new Scanner(System.in);
    //add array capable holding 20 vehicles
    static vehicle[] vehicles = new vehicle[20];
    //add preloaded 6 vehicles
    static int preloadedVehicles = 6;

    public static void main(String[] args) {
        preloadedVehicles();

        //add menu using while
        while (true) {
            //add the given structure copy and pasted
            System.out.println("What do you want to do?\n");
            System.out.println("1 - List all vehicles\n" +
                    "2 - Search by make/model\n" +
                    "3 - Search by price range\n" +
                    "4 - Search by color\n" +
                    "5 - Add a vehicle\n" +
                    "6 - Quit\n" +
                    "Enter your command");

            //add command to parse and pick which one
            int command = Integer.parseInt(myScanner.nextLine());

            //add switch for user choice
            switch (command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    findVehiclesByPrice();
                    break;
                case 5:
                    addAVehicle();
                    break;
                case 6:
                    return;
            }

        }
    }
    public static void preloadedVehicles() {
        //add preloaded
        vehicles [0] = new vehicle (101121,Ford Explorer,Red,45000,13500);
        vehicles [1] = new vehicle (101122,Toyota Camry,Blue,60000,11000);
        vehicles [2] = new vehicle (101123,Chevrolet Malibu,Black,50000,9700);
        vehicles [3] = new vehicle(101124,Honda Civic,White,70000,7500);
        vehicles [4] = new vehicle(101125,Subaru Outback,Green,55000,14500);
        vehicles [5] = new vehicle (101126,Jeep Wrangler,Yellow,30000,16000);
    }
    //list all vehicles
    public static void listAllVehicles() {
        for (int i = 0; i < preloadedVehicles; i++){
            displayVehicle(vehicle[i]);
        }
    }
    //search by make/model
    public static void searchByMakeModel() {
        System.out.println("Enter the cars make and model: ");
        String search = myScanner.nextLine();

        for (int i = 0; i < preloadedVehicles; i++) {
            if (vehicles[i].getMakeModel().equalsIgnoreCase(search)) {
                displayVehicle(vehicles[i]);
            }
        }
    }
    // search by price
    public static void findVehiclesByPrice() {
        //add mini
        System.out.println("Enter minimum price: ");
        float minimum = Float.parseFloat(myScanner.nextLine());

        //add maxi
        System.out.println("Enter maximum price: ");
        float maximum = Float.parseFloat((myScanner.nextLine());

        //add logic for max and min
        for(int i = 0; i < preloadedVehicles; i++) {
            if (vehicles[i].getPrice() >= minimum && vehicles[i].getPrice() <= maximum) {
                displayVehicle(vehicles[i]);
            }
        }
    }
    //search by color

    //add vehicle
}
