#Credit Card Processing System

## Getting Started
This project implements a credit card processing system in Java, capable of reading credit card records from different file formats (CSV, JSON, XML), validating them, and identifying the card issuer.

## Folder Structure
.vscode: 
lib: the folder to maintain dependencies.

## How to Run
Make sure you are in the project root directory.

## Compile the Project:
>javac src/main/java/*.java

##  Run the Application:

For CSV files:
>java -cp src/main/java CreditCardProcessor resources/input_file.csv resources/output_file.csv

For JSON files:
>java -cp src/main/java CreditCardProcessor resources/input_file.json resources/output_file.json

For XML files:
>java -cp src/main/java CreditCardProcessor resources/input_file.xml resources/output_file.xml

##  Primary Problem
The system addresses the challenge of parsing and processing credit card records from various file formats, validating card numbers, and determining the card issuer.

##  Secondary Problems
File Format Flexibility: Ability to handle multiple file formats (CSV, JSON, XML) and extend to new ones.
Credit Card Validation: Validation of credit card numbers and identification of card issuers like Visa, MasterCard, AmericanExpress, and Discover.

##  Design Patterns Used
Factory Pattern: In CreditCardFactory, creates instances of different credit card types based on card numbers.
Strategy Pattern: Through Strategy interface with implementations like CSVStrategy, JSONStrategy, and XMLStrategy, for flexible file parsing.

##  Factory Pattern:
Pros: Simplifies object creation and centralizes logic.
Cons: The factory class may require modifications for new card types.

##  Strategy Pattern:
Pros: Enhances flexibility and scalability for file parsing.
Cons: Can introduce complexity with multiple strategy classes.

##  Dependency Management
Dependencies are managed manually. Ensure that all required libraries are included in the lib folder.