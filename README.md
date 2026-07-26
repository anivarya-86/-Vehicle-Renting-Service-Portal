# 🚗 Vehicle Renting & Service Portal

A polymorphic Java console application that simulates a real-world vehicle rental system. It manages dynamic fleets, tracks real-time rental states, calculates vehicle-specific rental charges, and generates auto-formatted text receipts on local storage.

---------------------------------------------

## 🚀 Key Features & Concepts Implemented

* **Abstraction & Polymorphism:** Created an abstract base class `Vehicle` that enforces contract rules while allowing child classes (`Car`, `Bike`) to override specific pricing logic.
* **Interfaces & Contracts:** Implemented `Rentable` interface to standardise `rentVehicle()` and `returnVehicle()` state modifications across all vehicles.
* **Collections & Fleet Management:** Utilised Java `ArrayList` to store and dynamically update vehicle records and availability statuses.
* **File Handling (Receipt Generator):** Integrated Java File IO (`FileWriter`) with `try-with-resources` to persist booking receipts into clean `.txt` files.
* **Input Buffer Flush Handling:** Successfully resolved console Scanner carriage-return skips between numeric and text inputs.

---

## 🏗️ Architecture Overview

📦 VehicleRentingAndServicePortal
 ├── 📄 Rentable.java        --> Interface defining rental state methods.
 ├── 📄 Vehicle.java         --> Abstract Parent class holding state, getters/setters & Interface logic.
 ├── 📄 Car.java             --> Concrete child class overriding Car pricing logic.
 ├── 📄 Bike.java            --> Concrete child class overriding Bike pricing logic.
 └── 📄 RentableSystem.java  --> Main Driver class with dynamic Scanner loop & File IO engine. 


## 💻 How to Compile & Run
Bash
# Compile all source files
javac VehicleRentingAndServicePortal/*.java

# Run main driver class
java VehicleRentingAndServicePortal.RentableSystem
📄 Sample Generated Receipt Output (Receipt<CustomerName>.txt)
Plaintext
====================================
       VEHICLE RENTAL RECEIPT         
Customer Name : Vikas
Vehicle NumberPlate : UP 12 BZ 2023
Vehicle Brand : Swift
Day : 3
Total Cost : ₹ 4200.0
====================================
