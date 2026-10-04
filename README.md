# 🚗 Parking Management System

A **Java-based Object-Oriented Programming (OOP)** project designed to manage basic parking operations using Core Java and fundamental OOP principles.

## 📌 Overview

The Parking Management System is a console-based Java application created to demonstrate how a real-world parking problem can be modeled using objects and classes.

The project focuses on clean object-oriented design and practical implementation of Java concepts such as:

- Classes and Objects
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Constructors
- Access Modifiers
- Method Overloading and Overriding
- Exception Handling

## 🎯 Objectives

- Build a parking management application using Java.
- Apply OOP concepts to a real-world problem.
- Manage vehicle and parking information in a structured way.
- Practice reusable and maintainable Java code.
- Strengthen Core Java and OOP programming skills.

## ✨ Features

- 🚘 Vehicle information management
- 🅿️ Parking-related operations
- 🎫 Vehicle parking and exit handling
- 🔎 Vehicle information/search functionality
- 💰 Parking charge handling where applicable
- 📋 Display parking information
- 🖥️ Menu-driven console interface

> The exact operations depend on the functionality implemented in the project source code.

## 🧠 OOP Concepts Used

### 1. Classes and Objects

Classes define the structure and behavior of system entities, while objects represent actual instances.

```java
class Vehicle {
    private String vehicleNumber;

    public void displayDetails() {
        System.out.println(vehicleNumber);
    }
}

Vehicle car = new Vehicle();
```

### 2. Encapsulation

Data is kept private and accessed through public methods.

```java
class Vehicle {
    private String vehicleNumber;

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }
}
```

**Benefits:** data protection, controlled access, and better maintainability.

### 3. Inheritance

Inheritance allows a class to reuse properties and methods from another class.

```java
class Vehicle {
    void displayVehicle() {
        System.out.println("Vehicle");
    }
}

class Car extends Vehicle {
    void displayCar() {
        System.out.println("Car");
    }
}
```

### 4. Polymorphism

Polymorphism allows the same method/interface to have different behavior.

**Method Overloading:**

```java
class Parking {
    void calculateFee(int hours) {
        System.out.println("Fee based on hours");
    }

    void calculateFee(int hours, String vehicleType) {
        System.out.println("Fee based on hours and vehicle type");
    }
}
```

**Method Overriding:**

```java
class Vehicle {
    void displayDetails() {
        System.out.println("Vehicle details");
    }
}

class Car extends Vehicle {
    @Override
    void displayDetails() {
        System.out.println("Car details");
    }
}
```

### 5. Abstraction

Abstraction hides implementation details and exposes only the required functionality.

```java
abstract class Vehicle {
    abstract void calculateFee();
}
```

Abstraction can also be implemented using interfaces.

### 6. Constructors

Constructors initialize objects when they are created.

```java
class Vehicle {
    String vehicleNumber;

    Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}
```

### 7. Exception Handling

Exception handling can be used to manage invalid input and runtime problems.

```java
try {
    // code
} catch (Exception e) {
    System.out.println("Invalid input");
}
```

## 🔄 System Workflow

```text
                 ┌───────────────┐
                 │     START     │
                 └───────┬───────┘
                         │
                         ▼
               ┌───────────────────┐
               │   Display Menu    │
               └─────────┬─────────┘
                         │
                         ▼
                ┌────────────────┐
                │  Select Option │
                └───────┬────────┘
                        │
            ┌───────────┼──────────────┐
            │           │              │
            ▼           ▼              ▼
       Add / Park   View Details   Exit Vehicle
         Vehicle         │              │
            │            │              ▼
            ▼            │        Calculate Charge
      Store Details      │              │
            │            │              │
            └────────────┼──────────────┘
                         │
                         ▼
                   Display Result
                         │
                         ▼
                    Main Menu
                         │
                         ▼
                        EXIT
```

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| **Java** | Main programming language |
| **Core Java** | Application development |
| **OOP** | Program architecture |
| **Java Collections** | Data management where required |
| **Exception Handling** | Error/input handling |
| **Console UI** | User interaction |

## 💻 Requirements

- Java Development Kit (**JDK 17+ recommended**)
- `javac` and `java`
- IntelliJ IDEA, Eclipse, VS Code, NetBeans, or another Java IDE

## 🚀 How to Run

### 1. Clone the repository

```bash
git clone https://github.com/krishgoti/Parking-Management-System.git
cd Parking-Management-System
```

### 2. Open the project

Open the project in your Java IDE.

### 3. Compile

For a simple project with a `Main.java` entry point:

```bash
javac Main.java
```

### 4. Run

```bash
java Main
```

> If the project uses packages or multiple source files, run the main class from your IDE or compile the required source files together.

## 📂 Suggested Structure

```text
Parking-Management-System/
│
├── src/
│   ├── Main.java
│   ├── Vehicle.java
│   ├── Parking.java
│   ├── ParkingSlot.java
│   └── ...
│
├── README.md
└── .gitignore
```

> Update the example filenames to match your actual source files.

## 📊 OOP Concepts Summary

| Concept | Purpose |
|---|---|
| **Class** | Blueprint for system entities |
| **Object** | Instance of a class |
| **Encapsulation** | Protects and controls data |
| **Inheritance** | Reuses existing functionality |
| **Polymorphism** | Supports multiple behaviors |
| **Abstraction** | Hides implementation details |
| **Constructor** | Initializes objects |
| **Exception Handling** | Handles runtime/input problems |

## 🎓 Learning Outcomes

Through this project, you practice:

- Core Java programming
- Classes and objects
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Constructors and access modifiers
- Method overloading and overriding
- Exception handling
- Object-oriented software design
- Code reuse and maintainability
- Real-world problem solving with Java

## 🔮 Future Enhancements

Possible improvements include:

- 🗄️ MySQL database integration using JDBC
- 🔐 User authentication
- 👨‍💼 Admin panel
- 🅿️ Real-time parking slot availability
- 💳 Online payment integration
- 🎫 Digital parking tickets
- 📊 Parking analytics and reports
- 🧾 Automatic receipt generation
- 🔔 Notifications
- 🖥️ Java Swing / JavaFX GUI
- 🌐 Web-based version

## 📚 Academic Purpose

This project was developed as an **Object-Oriented Programming project in Java** to demonstrate practical application of OOP concepts to a real-world parking management problem.

## 👨‍💻 Author

**Krish Goti**

GitHub: https://github.com/krishgoti

Repository: https://github.com/krishgoti/Parking-Management-System

## ⭐ Conclusion

The **Parking Management System** demonstrates how Java and Object-Oriented Programming can be used to build a structured solution for a practical problem.

The project focuses on **classes, objects, encapsulation, inheritance, polymorphism, abstraction, constructors, and exception handling**, providing hands-on experience with Core Java and OOP design.

---

⭐ If you find this project useful, consider giving the repository a star!
