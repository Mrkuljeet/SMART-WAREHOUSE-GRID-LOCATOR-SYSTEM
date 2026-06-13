# 📦 Smart Warehouse Grid Locator System

## 📌 Overview

The **Smart Warehouse Grid Locator System** is a Java-based console application designed to simulate an efficient warehouse storage and retrieval system using a two-dimensional grid structure.

Each item in the warehouse is stored at a specific coordinate within the grid, allowing precise tracking and easy retrieval. The system demonstrates how real-world warehouse management can be modeled using structured data and object-oriented programming principles.

---
## 🎯 Objectives

* To represent a warehouse using a 2D grid structure
* To store and manage items using object-oriented design
* To implement an efficient search mechanism based on item ID
* To demonstrate practical use of Java and OOP concepts

---

## 🚀 Key Features

* 📍 Grid-based warehouse representation (2D Array)
* 📦 Object-oriented item modeling using classes
* 🔍 Search functionality using unique item ID
* ⚡ Efficient traversal using nested loops
* 🧱 Simple, modular, and scalable design

---

## 🧠 Technologies & Concepts Used

* **Java (Core Java)**
* **Object-Oriented Programming (OOP)**

  * Encapsulation
  * Abstraction
* **2D Arrays (Matrix Representation)**
* Basic search algorithm (Linear Search in grid)

---

## 🏗️ System Architecture

The project is structured into three main components:

* **GridItem Class**
  Represents individual items with attributes such as ID and name.

* **Warehouse Class**
  Manages the 2D grid and handles item insertion and search operations.

* **Main Class**
  Acts as the entry point of the program and demonstrates system functionality.

---

## ⚙️ Working Principle

1. The warehouse is initialized as a 2D array.
2. Items are placed at specific coordinates within the grid.
3. A search operation is performed using the item ID.
4. The system traverses the grid using nested loops.
5. If a match is found, the coordinates and item details are displayed.

---

## 📂 Project Structure

```
SmartWarehouse/
│── GridItem.java
│── Warehouse.java
│── Main.java
│── README.md
```

---

## ▶️ How to Run the Project

### 🔹 Compile

```bash
javac *.java
```

### 🔹 Execute

```bash
java Main
```

---

## 🧪 Sample Output

```
Item located at position: (1, 2)
Item ID: 102, Name: Mouse
```

---

## 📈 Complexity Analysis

* **Time Complexity:** O(n × m)
* **Space Complexity:** O(n × m)

---

## ⚡ Advantages

* Simple and easy to understand implementation
* Efficient for small to medium-sized warehouses
* Demonstrates real-world application of OOP

---

## ⚠️ Limitations

* Uses linear search (not optimized for very large datasets)
* No persistent storage (data resets after execution)

---

## 🔮 Future Enhancements

* Integration with database systems (MySQL)
* Graphical User Interface (GUI)
* Barcode or QR code-based item tracking
* Optimization using advanced data structures

---

## 📊 Real-World Relevance

This concept is applicable in:

* Warehouse management systems
* E-commerce inventory tracking (Amazon, Flipkart)
* Logistics and supply chain systems

---

## 👨‍💻 Author

**Kuljeet**
B.Tech Cybersecurity (2nd Semester)
Rungta International Skills University, Bhilai

---

## 📜 Note

This project is developed for academic purposes to demonstrate the implementation of Object-Oriented Programming concepts in Java.

---
