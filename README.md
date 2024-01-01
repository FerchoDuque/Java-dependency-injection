Random Number Generator App

This Java application implements a random number generation service with configurable options. It utilizes the dependency injection pattern to provide flexibility in choosing the random number generator.
Description

The application consists of the following main classes:

    RandApplication: Main class that starts the Spring Boot application.
    RandController: Controller handling requests related to random number generation.
    Rand: Class representing random number generation and storing the resulting set in an array.

Features

    Random Number Generation: The controller provides an endpoint "/random" that generates random numbers with configuration options such as an upper limit, start value, and the quantity of numbers to generate.

    Dependency Injection: The application uses dependency injection to provide flexibility in choosing the random number generator. Both secure and non-secure generators can be selected.

Execution

To run the application, follow these steps:

    Ensure you have Java installed on your system.
    Clone this repository: git clone https://github.com/yourusername/random-number-generator.git
    Navigate to the project directory: cd random-number-generator
    Run the application: ./mvnw spring-boot:run

The application will be available at http://localhost:8080.
Configuration

You can configure the application by adjusting parameters in requests to the "/random" and "/random_security_selection" endpoints. These parameters include:

    bound: Upper limit for random number generation (default: 100).
    origin: Start value for random number generation (default: 50).
    size: Quantity of random numbers to generate (default: 50).
    secure: Indicates whether to use a secure random number generator (default: false).

Contributions

Contributions are welcome! If you find a bug or have an enhancement, please create an issue or submit a pull request.
License

This project is licensed under the MIT License - see the LICENSE.md file for details.
