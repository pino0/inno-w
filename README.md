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
    Koin (Dependency Injection) : This was because it was easy to use and try and different option from Springboot
    JUnit (Testing)
    Gradle

Directory Structure

We have three layers to follow the Hexagonal architecture proposal

    Application/
    Domain/
    Architecture/

Configuration

The application expects an input.txt file in the resources directory. This file contains the test cases to be executed
by the application. You can edit this file with your test cases.

The output will be printed to the console.


How to Run the Application

To run the application, execute the MainKt class in your preferred Kotlin IDE or build and run the application using
the following command:

./gradlew clean build
./gradlew run

Example output
> Task :run
> 

    1 3 N
    5 1 E


How to Run Tests

To run the tests, use the following command:

./gradlew clean build

./gradlew test



Why these technologies?

Kotlin: I chose Kotlin as the programming language because of its conciseness, expressiveness, and strong type inference, which leads to less boilerplate code and increased productivity. Additionally, Kotlin is fully interoperable with Java, making it suitable for existing Java projects.

Koin (Dependency Injection): I opted for Koin as the DI framework because of its simplicity and ease of use. Koin offers a DSL-based approach, reducing the complexity of DI setup and making it easier to manage dependencies in a modular and testable manner.

JUnit (Testing): JUnit is a widely-used testing framework in the Java and Kotlin ecosystems. It provides rich tools for writing units, integration, and even automated tests. Using JUnit ensures that I can maintain a high level of code quality and detect regressions early in the development process.

Gradle: I selected Gradle as the build automation tool due to its flexibility, powerful dependency management capabilities, and widespread adoption in the Kotlin and Java communities. Gradle simplifies the build process, enabling me to efficiently manage project dependencies and configurations.

Hexagonal Architecture: I adopted Hexagonal Architecture (Ports and Adapters) to separate concerns and improve the application's maintainability. By decoupling the core domain logic from external dependencies, such as databases or user interfaces, the application becomes more flexible and easier to test.

Domain-Driven Design (DDD): DDD allows me to model the application's core domain using a ubiquitous language shared between stakeholders and developers. By focusing on the domain and its business rules, DDD helps me design a more robust and maintainable system, leading to a better alignment between the codebase and the real-world problem domain.

By combining Kotlin, Koin, JUnit, and Gradle with Hexagonal Architecture and DDD, I aim to build a scalable, maintainable, and testable application that can evolve as business requirements change.

