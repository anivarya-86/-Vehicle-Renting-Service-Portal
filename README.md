# 🚗 Vehicle Renting & Service Portal

A polymorphic Java console application that simulates a real-world vehicle rental system. It manages dynamic fleets, tracks real-time rental states, calculates vehicle-specific rental charges, and generates auto-formatted text receipts on local storage.

---

## 🚀 Key Features & Concepts Implemented

* **Abstraction & Polymorphism:** Created an abstract base class `Vehicle` that enforces contract rules while allowing child classes (`Car`, `Bike`) to override specific pricing logic[cite: 19, 20, 23].
* **Interfaces & Contracts:** Implemented `Rentable` interface to standardise `rentVehicle()` and `returnVehicle()` state modifications across all vehicles[cite: 21, 23].
* **Collections & Fleet Management:** Utilised Java `ArrayList` to store and dynamically update vehicle records and availability statuses[cite: 22].
* **File Handling (Receipt Generator):** Integrated Java File IO (`FileWriter`) with `try-with-resources` to persist booking receipts into clean `.txt` files[cite: 22].
* **Input Buffer Flush Handling:** Successfully resolved console Scanner carriage-return skips between numeric and text inputs[cite: 22].

---

## 🏗️ Architecture Overview

```text
📦 VehicleRentingAndServicePortal
 ├── 📄 Rentable.java        --> Interface defining rental state methods[cite: 21]
 ├── 📄 Vehicle.java         --> Abstract Parent class holding state, getters/setters & Interface logic[cite: 23]
 ├── 📄 Car.java             --> Concrete child class overriding Car pricing logic[cite: 20]
 ├── 📄 Bike.java            --> Concrete child class overriding Bike pricing logic[cite: 19]
 └── 📄 RentableSystem.java  --> Main Driver class with dynamic Scanner loop & File IO engine[cite: 22]
