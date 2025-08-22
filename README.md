💖 Love Calculator Application

This is a Java-based Spring Boot web application that predicts love compatibility between two individuals using the FLAMES algorithm.
The project demonstrates the use of Spring Boot, JSP, Hibernate/JPA, Validation, Email Integration, and custom annotations.

🚀 Features

User registration and login system with form validation.

Custom validators like @Age for restricting user age.

Love Calculator (FLAMES logic) to predict relationship compatibility.

Email service integration to send results via Gmail SMTP.

Supports session management using @SessionAttributes.

Error handling & validation messages using messages.properties.

🛠️ Technologies Used

Programming Language: Java 17

Framework: Spring Boot (MVC, Validation, JPA, Mail)

Database: MySQL with Spring Data JPA

View Technology: JSP & JSTL

Tools: Maven, Eclipse/IntelliJ, Git

📂 Project Structure
src/main/java
 └── com.example.demo
      ├── LoveCalculatorApplication.java      # Main entry point
      ├── CommunicationDTO/                   # DTOs for communication (Email, Phone)
      ├── Config/                             # Formatter & Mail configurations
      ├── Controller/                         # Controllers (Home, Login, Register, Email)
      ├── EmailDTO/                           # DTO for Email handling
      ├── EmailService/                       # Service layer (Email, Logic, Entity)
      ├── EntityClass/                        # Entity and Repository
      ├── UserDTO/                            # DTOs for User (Login, Register, HomePage)
      └── Validator/                          # Custom Validators (Age)
      
src/main/resources
 ├── application.properties                   # App configuration
 ├── mail.properties                          # Mail setup
 └── messages.properties                      # Validation messages

src/main/webapp/WEB-INF/views
 ├── home.jsp
 ├── home-process.jsp
 ├── email.jsp
 ├── email-process.jsp
 ├── registration.jsp
 ├── register-process.jsp
 └── Login.jsp

⚙️ Prerequisites

Before running this project, ensure you have:

Java 17 installed

MySQL installed and running

A database created in MySQL (e.g., love_calculator)

CREATE DATABASE love_calculator;


Update your application.properties with correct DB credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/love_calculator
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update


For Email Service, configure mail.properties with your Gmail SMTP credentials.

▶️ How to Run

Clone the repository:

git clone https://github.com/your-username/love-calculator.git
cd love-calculator


Build the project:

mvn clean install


Run the Spring Boot application:

mvn spring-boot:run


Open the browser and visit:

http://localhost:8080/

🎯 What I Learned

Using Spring Boot MVC with JSP.

Implementing custom annotations and validators.

Sending emails using Spring Boot MailSender.

Building authentication and registration flows.

Applying FLAMES algorithm with Java OOP principles.

🚀 Future Improvements

Add REST APIs for frontend integration.

Use Spring Security for authentication & authorization.

Improve UI with Thymeleaf or React instead of JSP.

Store email sending logs for tracking.
