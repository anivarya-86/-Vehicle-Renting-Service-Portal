package VehicleRentingAndServicePortal;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RentableSystem {
      public static void Receipt(String customer , Vehicle vehicle , int days ,double totalCost ) {
        String fileName = "Receipt" + customer + ".txt";
        try(FileWriter fileWriter = new FileWriter(fileName)) {
           fileWriter.write("====================================\n");
           fileWriter.write("       VEHICLE RENTAL RECEIPT         \n");
           fileWriter.write("Customer Name : " + customer + "\n");
           fileWriter.write("Vehicle NumberPlate : " + vehicle.getVehicleNumber()+ "\n");
           fileWriter.write("Vehicle Brand : " + vehicle.getVehicleBrand()+ "\n");
           fileWriter.write("Day : " + days+ "\n");
           fileWriter.write("Total Cost : ₹ " + totalCost+ "\n");

            System.out.println(" ✅ Receipt Generated Successfully ");
        } catch (IOException e) {
            System.out.println("❌ Receipt Generate Failed ");
        }
      }
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();
          vehicleArrayList.add(new Car("UP 12 BZ 2023",
                  "Swift", 1200, "Available"));
          vehicleArrayList.add(new Bike("UP 15 EW 6487", "Hero",
                  500, "Available"));
          vehicleArrayList.add(new Bike("UP 16 GW 2487", "TVS RONIN",
                  800, "Available"));

          vehicleArrayList.add(new Bike("UP 12 BD 1002", "Hero",
                  500, "Available"));
      while (true){
          System.out.println("-------------------------------------");
          System.out.println(" 1. Display All Display & Status" );
          System.out.println(" 2. Rent a Vehicle");
          System.out.println(" 3. Return a Vehicle");
          System.out.println( " 4. Exit");
          System.out.println("-------------------------------------");
          System.out.print("Enter ->");
          int Choice = input.nextInt();
          input.nextLine();
          switch (Choice){
              case 1 ->{
                  System.out.println(" 🚗️Display all status 🏍: ");
                   if (vehicleArrayList.isEmpty()){
                       System.out.println("Vehicle are not available");
                   }
                   else{
                       for (Vehicle V : vehicleArrayList){
                       System.out.print("Brand Name : "+ V.getVehicleBrand() + " | ");
                       System.out.print("Number : "+ V.getVehicleNumber()+ " | ");
                       System.out.println("Rental Rate : ₹ "+ V.getBaseRentalRate()+ " | ");
                       System.out.print("Status : "+ V.isOnRent()+ " |\n ");
                       System.out.println("--------------------------------");
                   }
                  }
              }
              case 2 -> {
                  System.out.println("---------Rent a Vehicle------- ");
                  System.out.print("Customer Name : ");
                  String CustomerName = input.nextLine();
                  System.out.print("Enter the Vehicle Number : ");
                  String number = input.nextLine();
                  boolean found = false;

                  for (Vehicle V : vehicleArrayList) {
                      if (V.getVehicleNumber().equalsIgnoreCase(number)) {
                          found = true;
                          if (V.isOnRent().equalsIgnoreCase("Available")) {
                              System.out.print("Days : ");
                              int days = input.nextInt();
                              input.nextLine(); // clear buffer

                              double totalCost = V.calculateRentalCost(days);
                              V.rentVehicle();

                              System.out.println("✅ Vehicle Rented Successfully!");
                              System.out.println("Your Total Amount ₹ : " + totalCost);
                              Receipt(CustomerName, V, days, totalCost);
                          } else {
                              System.out.println("⚠️ Sorry, Vehicle is already on Rent!");
                          }
                          break;
                      }
                  }
                  if (!found) {
                      System.out.println("❌ Vehicle with Number '" + number + "' Not Found!");
                  }
              }
              case 3 -> {
                  System.out.println("----Vehicle Return----");
                  System.out.println("Enter Your Vehicle Number : ");
                  String num = input.nextLine();
                  boolean found = false;
                  for (Vehicle V : vehicleArrayList){
                      if (V.getVehicleNumber().equalsIgnoreCase(num)){
                          found = true;
                          if (V.getVehicleNumber().equalsIgnoreCase("Rented"))
                              V.returnVehicle();
                              V.returnVehicle(); System.out.println("Vehicle Return Successfully");
                      }else {
                          System.out.println("Vehicle are not rented (Its available)");
                      }break;
                  }if (!found){
                      System.out.println("Vehicle are not found : " + num );
                  }
              }
              case 4 ->{
                  System.out.println("Exit Successfully , Goodbye👍");
                 System.exit(0);

              }
          }

      }
      }


}

