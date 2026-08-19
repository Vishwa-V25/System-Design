# SOLID Principles in Java

SOLID is a set of five principles that help developers write **clean, maintainable, flexible, and scalable code**.

## 1. Single Responsibility Principle (SRP)

> A class should have only one responsibility.

### 🌍 Real-World Example

A restaurant has separate people for **cooking, serving, and billing**. One person should not handle everything.

### 💻 Technical Example

❌ Bad:

```java
class Employee {
    void calculateSalary() {}
    void saveToDatabase() {}
    void generateReport() {}
}
```

✅ Good:

```java
class SalaryCalculator {
    void calculateSalary() {}
}

class EmployeeRepository {
    void saveToDatabase() {}
}

class EmployeeReport {
    void generateReport() {}
}
```

---

## 2. Open/Closed Principle (OCP)

> Classes should be **open for extension but closed for modification**.

### 🌍 Real-World Example

A payment system can add **UPI, Card, or PayPal** without changing the existing payment process.

### 💻 Technical Example

```java
interface Payment {
    void pay();
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Pay using UPI");
    }
}

class Card implements Payment {
    public void pay() {
        System.out.println("Pay using Card");
    }
}
```

New payment methods can be added without modifying existing classes.

---

## 3. Liskov Substitution Principle (LSP)

> A child class should be replaceable for its parent class without breaking the program.

### 🌍 Real-World Example

An **Eagle** is a bird that can fly, but a **Penguin** cannot. So flying should not be a mandatory behavior for every bird.

### 💻 Technical Example

```java
class Bird {
    void eat() {
        System.out.println("Eating");
    }
}

interface FlyingBird {
    void fly();
}

class Eagle extends Bird implements FlyingBird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Penguin extends Bird {
}
```

---

## 4. Interface Segregation Principle (ISP)

> A class should not be forced to implement methods it doesn't need.

### 🌍 Real-World Example

A basic printer only needs to **print**. It shouldn't be forced to support scanning and faxing.

### 💻 Technical Example

```java
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class BasicPrinter implements Printer {
    public void print() {
        System.out.println("Printing");
    }
}
```

Small interfaces are better than one large interface.

---

## 5. Dependency Inversion Principle (DIP)

> Depend on **abstractions**, not concrete classes.

### 🌍 Real-World Example

A mobile phone charger works through a **standard interface**, so different compatible chargers can be used.

### 💻 Technical Example

```java
interface Database {
    void save();
}

class MySQL implements Database {
    public void save() {
        System.out.println("Saving to MySQL");
    }
}

class UserService {
    private Database database;

    UserService(Database database) {
        this.database = database;
    }

    void saveUser() {
        database.save();
    }
}
```

`UserService` depends on the `Database` interface rather than directly on MySQL.

---

## 📌 SOLID Cheat Sheet

| Principle | Simple Meaning                 |
| --------- | ------------------------------ |
| **S**     | One class → One responsibility |
| **O**     | Extend without modifying       |
| **L**     | Child can replace parent       |
| **I**     | Small, specific interfaces     |
| **D**     | Depend on abstractions         |

## 🎯 Benefits

* Clean and readable code
* Easy maintenance
* Easy testing
* Less coupling
* Easier to extend
* Better scalability

---

### 👨‍💻 Author

**Vishwa**
B.Tech Information Technology
St. Joseph's Institute of Technology, Chennai

