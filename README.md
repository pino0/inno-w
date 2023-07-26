Inno W - Hexagonal Architecture with DDD

This is a demo application using Hexagonal Architecture with Domain-Driven Design (DDD) to maintain a clear and decoupled
structure that facilitates code evolution and maintenance.


Cleaning Factory

A cleaning robot's position and orientation is represented by its X and Y coordinates and a letter representing one of the
four cardinal compass points (N, E, S, W). The workspace where the robot operates is divided up into a grid to simplify
navigation. For instance, an example position of the robot could be 0, 0, N, which indicates that the robot is at the
bottom-left corner and facing North.

Technologies Used

    Kotlin
    Koin (Dependency Injection)
    JUnit (Testing)
    Gradle

Directory Structure

/
|-- src/
|   |-- main/
|   |   |-- kotlin/
|   |   |   |-- com/
|   |   |   |   |-- inno/
|   |   |   |   |   |-- aplication/
|   |   |   |   |   |-- domain/
|   |   |   |   |   |   |-- models/
|   |   |   |   |   |   |-- ports/
|   |   |   |   |   |-- infrastructure/
|   |   |   |   |   |   |   |-- adapters/
|   |   |   |   |   |   |   |-- config/
|   |   |   |   |   |-- Main.kt
|   |   |-- resources/
|   |-- test/
|   |   |-- kotlin/
|   |   |   |-- com/
|   |   |   |   |-- inno/
|   |   |   |   |   |-- domain
|   |   |   |   |   |   |-- models/
|   |   |   |   |   |-- infrastructure/
|-- build.gradle.kts
|-- README.md


Configuration

The application expects an input.txt file in the resources directory. This file contains the test cases to be executed
by the application. You cand edit this file with your own test cases.

The output will be printed to the console.


How to Run the Application

To run the application, simply execute the MainKt class in your preferred Kotlin IDE or build and run the application using
the following command:

./gradlew clean build
./gradlew run

Example output
> Task :run
        1 3 N
        5 1 E

How to Run Tests

To run the tests, use the following command:

./gradlew clean build
./gradlew test



