# Employee PDF Report Generator

## Description
This Java project connects to a MySQL database, fetches employee data, and generates a formatted PDF report using Apache PDFBox.

## Technologies
- Java
- Apache PDFBox
- MySQL
- Maven

## Setup Instructions

### 1. Database Setup
Run the provided `sample_db.sql` to create the database and sample employee table.

### 2. Update DB Credentials
Edit `DBConnector.java` with your MySQL username and password.

### 3. Build and Run
Use Maven to build and run the project:
```
mvn compile
mvn exec:java -Dexec.mainClass="Main"
```

### 4. Output
A timestamped PDF file will be generated in your project directory.

## License
Open source for educational and personal use.