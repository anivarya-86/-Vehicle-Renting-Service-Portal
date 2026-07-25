# 🚗 Vehicle Renting & Service Portal

A polymorphic Java console application that simulates a real-world vehicle rental system. It manages dynamic fleets, tracks real-time rental states, calculates vehicle-specific rental charges, and generates auto-formatted text receipts on local storage.

---

## 🚀 Key Features & Concepts Implemented

* **Abstraction & Polymorphism:** Created an abstract base class `Vehicle` that enforces contract rules while allowing child classes (`Car`, `Bike`) to override specific pricing logic.
* **Interfaces & Contracts:** Implemented `Rentable` interface to standardise `rentVehicle()` and `returnVehicle()` state modifications across all vehicles.
* **Collections & Fleet Management:** Utilised Java `ArrayList` to store and dynamically update vehicle records and availability statuses.
* **File Handling (Receipt Generator):** Integrated Java File IO (`FileWriter`) with `try-with-resources` to persist booking receipts into clean `.txt` files.
* **Input Buffer Flush Handling:** Successfully resolved console Scanner carriage-return skips between numeric and text inputs.

---

## 🏗️ Architecture Overview

```text
📦 VehicleRentingAndServicePortal
 ├── 📄 Rentable.java        --> Interface defining rental state methods
 ├── 📄 Vehicle.java         --> Abstract Parent class holding state, getters/setters & Interface logic
 ├── 📄 Car.java             --> Concrete child class overriding Car pricing logic
 ├── 📄 Bike.java            --> Concrete child class overriding Bike pricing logic[cite: 19]
 └── 📄 RentableSystem.java  --> Main Driver class with dynamic Scanner loop & File IO engine[cite: 22]
