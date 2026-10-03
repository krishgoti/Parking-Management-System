# 🚗 Parking Management System

A **C++ Object-Oriented Programming (OOP)** project that demonstrates how a real-world parking facility can be modeled using classes, objects, encapsulation, inheritance, polymorphism, and abstraction.

> **Project:** Parking Management System  
> **Language:** C++  
> **Focus:** Object-Oriented Programming (OOP)  
> **Author:** Krish Goti

---

## 📌 Overview

The **Parking Management System** is a console-based C++ project developed to represent the basic operations of a parking facility.

The project applies Object-Oriented Programming concepts to organize parking-related data and operations into reusable and maintainable components.

The main goal of this project is to understand how OOP can be used to solve a practical real-world problem while keeping the code structured and easy to extend.

---

## 🎯 Objectives

- Manage basic parking operations using C++.
- Represent real-world entities using classes and objects.
- Demonstrate the four major pillars of OOP.
- Practice constructors, destructors, access modifiers, and methods.
- Improve code reusability and maintainability.
- Apply OOP concepts to a practical problem.

---

## ✨ Key Features

- 🚘 Vehicle information management
- 🅿️ Parking space management
- 🎫 Parking entry and exit handling
- 💰 Parking fee calculation
- 📋 Display of parking-related information
- 🔄 Menu-driven console interface
- 🧩 Object-oriented program structure

> The exact functionality depends on the implementation in the source code.

---

# 🧠 OOP Concepts Demonstrated

## 1. Classes

A class acts as a blueprint for creating objects.

```cpp
class Vehicle {
private:
    string vehicleNumber;

public:
    void displayDetails();
};
```

Classes help group related data and functions together.

---

## 2. Objects

An object is an instance of a class.

```cpp
Vehicle car;
Vehicle bike;
```

Objects are used to access the properties and functions defined by their class.

---

## 3. Encapsulation

Encapsulation combines data and methods inside a class and controls access using access modifiers.

```cpp
class Vehicle {
private:
    string vehicleNumber;

public:
    void setVehicleNumber(string number) {
        vehicleNumber = number;
    }

    string getVehicleNumber() {
        return vehicleNumber;
    }
};
```

### Benefits

- Protects data
- Provides controlled access
- Improves maintainability
- Keeps implementation organized

---

## 4. Inheritance

Inheritance allows one class to reuse the properties and behavior of another class.

```cpp
class Vehicle {
public:
    void displayVehicle();
};

class Car : public Vehicle {
public:
    void displayCar();
};
```

Here, `Car` inherits from `Vehicle`.

### Benefits

- Code reusability
- Reduced duplication
- Better class hierarchy
- Easier maintenance

---

## 5. Polymorphism

Polymorphism allows the same function or interface to behave differently for different objects.

Example using function overriding:

```cpp
class Vehicle {
public:
    virtual void displayDetails() {
        cout << "Vehicle Details";
    }
};

class Car : public Vehicle {
public:
    void displayDetails() override {
        cout << "Car Details";
    }
};
```

The same `displayDetails()` function can produce different behavior depending on the object.

---

## 6. Abstraction

Abstraction hides unnecessary implementation details and exposes only the required functionality.

For example, a user can perform parking operations without needing to know the internal logic used for slot management or fee calculation.

### Benefits

- Reduces complexity
- Improves usability
- Separates implementation from usage
- Makes the system easier to maintain

---

## 7. Constructors

Constructors are special member functions that are automatically called when an object is created.

```cpp
class Vehicle {
public:
    Vehicle() {
        cout << "Vehicle created";
    }
};
```

Constructors are useful for initializing objects.

---

## 8. Destructors

Destructors are automatically called when an object is destroyed.

```cpp
class Vehicle {
public:
    ~Vehicle() {
        cout << "Vehicle destroyed";
    }
};
```

They can be used for cleanup and resource management.

---

# 🔄 System Workflow

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
              ┌────────────┼─────────────┐
              │            │             │
              ▼            ▼             ▼
        Add / Park     View Details   Exit Vehicle
          Vehicle           │             │
              │             │             ▼
              ▼             │        Calculate Fee
        Assign Slot         │             │
              │             │             │
              └─────────────┼─────────────┘
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

---

# 🏗️ Conceptual Design

A simple object-oriented structure can be represented as:

```text
                         Vehicle
                            │
             ┌──────────────┼──────────────┐
             │              │              │
             ▼              ▼              ▼
           Car            Bike          Other Vehicle
             │              │              │
             └──────────────┼──────────────┘
                            │
                            ▼
                 Parking Management
                            │
                            ▼
                    Slot Management
                            │
                            ▼
                    Fee Management
```

This structure allows common vehicle behavior to be reused while keeping specific behavior separate.

---

# 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| **C++** | Core programming language |
| **OOP** | Program architecture and design |
| **STL / Standard Library** | Utility and data handling where required |
| **Console Interface** | User interaction |

---

# 💻 Requirements

To run the project, you need:

- A C++ compiler
- GCC / MinGW / g++
- Visual Studio Code, Code::Blocks, Dev-C++, Visual Studio, or another C++ IDE
- Windows, Linux, or macOS

---

# 🚀 How to Run

## 1. Clone the Repository

```bash
git clone https://github.com/krishgoti/Parking-Management-System.git
```

## 2. Open the Project

```bash
cd Parking-Management-System
```

## 3. Compile

If the project has a single `main.cpp` file:

```bash
g++ main.cpp -o parking
```

If the project contains multiple `.cpp` files:

```bash
g++ *.cpp -o parking
```

## 4. Run

### Windows

```bash
parking.exe
```

### Linux / macOS

```bash
./parking
```

> If your project uses a different file structure, compile the required source files according to your setup.

---

# 📂 Suggested Project Structure

```text
Parking-Management-System/
│
├── main.cpp
├── *.cpp
├── *.h
└── README.md
```

The source files contain the implementation of the parking management system, while header files can be used for class declarations and reusable interfaces.

---

# 📊 OOP Concepts Summary

| Concept | Purpose in the Project |
|---|---|
| **Class** | Defines system entities and their behavior |
| **Object** | Represents instances of those entities |
| **Encapsulation** | Protects and controls access to data |
| **Inheritance** | Reuses common properties and methods |
| **Polymorphism** | Allows different behaviors through a common interface |
| **Abstraction** | Hides unnecessary implementation details |
| **Constructor** | Initializes objects |
| **Destructor** | Performs cleanup when objects are destroyed |

---

# 🎓 Learning Outcomes

Through this project, the following skills are practiced:

- Understanding C++ classes and objects
- Applying encapsulation
- Implementing inheritance
- Understanding polymorphism
- Applying abstraction
- Using constructors and destructors
- Designing reusable program components
- Converting a real-world problem into an OOP solution
- Improving logical thinking and problem-solving
- Writing organized and maintainable C++ code

---

# 🔮 Future Enhancements

The project can be extended with:

- 🗄️ Database integration
- 🌐 Web-based parking management
- 📱 Mobile application
- 🔐 User authentication
- 👨‍💼 Admin dashboard
- 🅿️ Real-time slot availability
- 📊 Parking analytics and reports
- 💳 Online payment integration
- 🎫 Digital parking tickets
- 🔔 Notifications and alerts
- 🔍 Vehicle search and filtering
- 🧾 Automatic receipt generation
- 📈 Advanced reporting

---

# 📌 Why This Project?

Parking is a practical real-world problem that contains multiple entities and relationships, making it a suitable example for learning Object-Oriented Programming.

This project demonstrates how OOP concepts can be combined to build a structured solution instead of keeping all logic inside a single program.

---

# 👨‍💻 Author

## Krish Goti

GitHub:  
https://github.com/krishgoti

Project Repository:  
https://github.com/krishgoti/Parking-Management-System

---

# ⭐ Conclusion

The **Parking Management System** is a C++ OOP project created to demonstrate how fundamental Object-Oriented Programming concepts can be applied to a real-world problem.

By using classes, objects, encapsulation, inheritance, polymorphism, abstraction, constructors, and destructors, the project provides practical experience in designing structured and reusable C++ applications.

---

⭐ If you find this project useful, consider giving the repository a star!
