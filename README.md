Campus Course & Records Manager (CCRM)
This is a console-based Java application designed to manage student and course records for an academic institution. The project demonstrates a variety of core Java programming concepts, including Object-Oriented Programming (OOP) principles, modern Java APIs, and design patterns.

⚙️ How to Run
JDK Version: This project was built and tested with Java Development Kit (JDK) 21. Please ensure you have a compatible JDK installed.

IDE: The project was developed using Eclipse IDE. It is recommended to use Eclipse for development and execution.

Execution: To run the application, simply run the main method in the edu.ccrm.cli.CCRMApp class.

📝 Project Details
Evolution of Java
Java 1.0 (1996): The initial release, focused on simple applets for web browsers.

Java 5 (2004): A major update introducing generics, enums, autoboxing, and annotations.

Java 8 (2014): Introduced game-changing features like lambda expressions, the Stream API, and a new Date/Time API.

Java 11 (2018): The first Long-Term Support (LTS) release after Java 8, with improvements like new string methods and the var keyword.

Java 21 (2023): The latest LTS version, with features like Virtual Threads and Pattern Matching for switch.

Java ME vs. Java SE vs. Java EE
Feature

Java SE (Standard Edition)

Java ME (Micro Edition)

Java EE (Enterprise Edition)

Purpose

Core Java programming, desktop apps.

Small devices (mobile, IoT).

Large-scale, enterprise applications.

Example Use

This CCRM project, desktop games.

Legacy mobile phone applications.

Web servers, e-commerce platforms.

APIs Included

Basic APIs (Collections, Streams, etc.).

A subset of Java SE APIs.

Extensive APIs (Servlets, JSF, JPA).

JDK, JRE, and JVM
JDK (Java Development Kit): The complete kit for developing Java applications. It includes the JRE and the compiler (javac).

JRE (Java Runtime Environment): The environment required to run Java applications. It contains the JVM and the core class libraries.

JVM (Java Virtual Machine): The core component that executes Java bytecode. It provides a platform-independent way to run Java code.

Installation & Setup Screenshots
(Place your screenshots here as a link to a screenshots folder in your repository)

JDK Installation Verification: java -version output

Eclipse Project Setup: Screenshot of your project in Eclipse.

Program Running: Screenshots of the menu and sample operations.

Exports/Backups Folder: Screenshot of the backup folder structure.

🗺️ Syllabus Topic Mapping
Syllabus Topic

File/Class/Method Where Demonstrated

Packages

edu.ccrm.domain, edu.ccrm.service, etc.

OOP Pillars

Person (Abstraction, Inheritance), Student (Polymorphism, Encapsulation)

Design Patterns

Course.Builder (Builder), AppConfig (Singleton - to be implemented)

File I/O

ImportExportService (NIO.2 - to be implemented)

Exceptions

MaxCreditLimitExceededException (to be implemented)

Streams

CourseService.findCoursesByInstructor

Enums

Semester, Grade

🚨 Notes on Assertions
To enable assertions, run your Java application with the -ea flag. For example:
java -ea edu.ccrm.cli.CCRMApp

📋 Sample Commands & Data
(Add your sample commands and a link to your test-data folder here)

