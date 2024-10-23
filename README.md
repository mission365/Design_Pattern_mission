# Design Patterns in Java

Welcome to the **Design Patterns in Java** repository! This repository contains examples of common design patterns implemented in Java. Design patterns are proven solutions to recurring design problems in software development, and they help improve code readability, maintainability, and scalability.

## Introduction
Design patterns are categorized into three main types:
- **Creational Patterns:** Concerned with the way of creating objects.
- **Structural Patterns:** Focus on how objects are composed to form larger structures.
- **Behavioral Patterns:** Deal with how objects interact and communicate.

This repository includes practical examples that demonstrate the implementation of various design patterns, both with and without their usage.

## Design Patterns Included
The following design patterns are covered in this repository:

### Creational Patterns
- **Singleton:** Ensures a class has only one instance and provides a global point of access.
- **Factory Method:** Defines an interface for creating an object but allows subclasses to alter the type of objects that will be created.
- **Abstract Factory:** Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
- **Prototype:** Creates new objects by copying an existing object, known as the prototype.

### Behavioral Patterns
- **State:** Allows an object to alter its behavior when its internal state changes.
- **Strategy:** Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
- **Template Method:** Defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
- **Chain of Responsibility:** Allows multiple objects to handle a request without knowing the handler's identity.
- **Command:** Encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations.
- **Iterator:** Provides a way to access elements of an aggregate object sequentially without exposing its underlying representation.

### Structural Patterns
- **Decorator:** Adds new functionality to an existing object without altering its structure.
- **Adapter:** Allows incompatible interfaces to work together.
- **Composite:** Composes objects into tree structures to represent part-whole hierarchies.

## Repository Structure
The repository is organized into folders for each design pattern. Each folder contains:
- A **README.md** file that provides a brief overview of the pattern, its use cases, and implementation details.
- Two subfolders:
  - **Without Design Pattern:** Contains the problem statement and the code implemented without using the design pattern.
  - **With Design Pattern:** Contains the code that implements the same functionality using the corresponding design pattern.
