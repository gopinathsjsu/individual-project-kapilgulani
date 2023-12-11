# Credit Card Processing System

## Getting Started

This project implements a credit card processing system in Java, capable of reading credit card records from different file formats (CSV, JSON, XML), validating them, and identifying the card issuer.

## Folder Structure

- The project's Java files are located at the root directory.
- `lib`: the folder to maintain dependencies.
- `.vscode/settings.json`: contains project settings including referenced libraries.
- `Test`: the folder contains the unit test for every java class of the project.
- `uml`: contains the class diagram of all the design patterns used in the project.
- Compiled output files are generated in the root folder by default.

## Project Configuration

The project is configured in `.vscode/settings.json` to reference libraries stored in the `lib` folder:


## How to Run

Make sure you are in the project root directory.

1. **Compile the Project**:

- javac -cp ".;lib/*" *.java 

2. **Run the Application**:
The main method is in the CreditCardProcessor class.
- For CSV files:
  ```
    java -cp ".;lib/*" CreditCardProcessor input_file.csv output_file.csv  
    ```
- For JSON files:
  ```
  java -cp ".;lib/*" CreditCardProcessor input_file.json output_file.json
  ```
- For XML files:
  ```
  java -cp ".;lib/*" CreditCardProcessor input_file.xml output_file.xml
  ```

## Primary Problem

The system addresses the challenge of parsing and processing credit card records from various file formats, validating card numbers, and determining the card issuer.

## Secondary Problems

- **File Format Flexibility**: Ability to handle multiple file formats (CSV, JSON, XML) and extend to new ones.
- **Credit Card Validation**: Validation of credit card numbers and identification of card issuers like Visa, MasterCard, AmericanExpress, and Discover.

## Design Patterns Used

- **Factory Pattern**: In `CreditCardFactory`, creates instances of different credit card types based on card numbers.
- **Strategy Pattern**: Through `Strategy` interface with implementations like `CSVStrategy`, `JSONStrategy`, and `XMLStrategy`, for flexible file parsing.

**UML Class Diagram for Factory Pattern Implementation:**

![UML Class Diagram for Factory Pattern](https://github.com/gopinathsjsu/individual-project-kapilgulani/blob/main/uml/Factory_Pattern.png)

**UML Class Diagram for Strategy Pattern Implementation:**

![UML Class Diagram for Strategy Pattern](https://github.com/gopinathsjsu/individual-project-kapilgulani/blob/main/uml/Strategy_pattern.png)



## Consequences of Using These Patterns

- **Factory Pattern**:
*Pros*: Simplifies object creation and centralizes logic.
*Cons*: The factory class may require modifications for new card types.

- **Strategy Pattern**:
 *Pros*: Enhances flexibility and scalability for file parsing.
 *Cons*: Can introduce complexity with multiple strategy classes.

## Dependency Management

Dependencies are managed manually. Ensure that all required libraries are included in the `lib` folder.