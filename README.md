# PROG2004 Assignment 1: Health Service Appointment System

## Overview
This project implements an object-oriented health service appointment system in Java, demonstrating:
- **Inheritance**: `HealthProfessional` as a base class, with `GeneralPractitioner` and `Radiologist` as subclasses.
- **Polymorphism**: `Appointment` class accepts any `HealthProfessional` subclass.
- **Encapsulation**: All classes use private fields with getters and validation.
- **Collection Management**: `ArrayList` to manage appointments with create/cancel/print features.

## Class Structure
- `HealthProfessional`: Base class with ID, name, and specialty area.
- `GeneralPractitioner`: Subclass with `maxPatientsPerDay`.
- `Radiologist`: Subclass with `specializedEquipment`.
- `Appointment`: Manages patient details, time slots, and assigned doctors.
- `AssignmentOne`: Main class with demo logic.

## How to Run
Compile and run `AssignmentOne.java` in a Java 8+ environment.