# Auth API - Spring Boot + MySQL

## Features

- User signup
- User login
- Password hashing using BCrypt
- Input validation using Jakarta Validation
- Global exception handling
- MySQL database integration
- Layered architecture using Controller, Service, Repository, DTO, and Entity layers

## Tech Stack

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security (used for password encoding)
- MySQL
- Maven

## Project Structure

```text
src/main/java/com/example/authapi
├── controller
│   ├── AuthController.java
│   └── HomeController.java
├── dto
│   ├── ApiResponse.java
│   ├── LoginRequest.java
│   └── SignupRequest.java
├── entity
│   └── User.java
├── exception
│   ├── GlobalExceptionHandler.java
│   └── ResourceAlreadyExistsException.java
├── repository
│   └── UserRepository.java
├── security
│   └── SecurityConfig.java
├── service
│   ├── AuthService.java
│   └── AuthServiceImpl.java
└── AuthapiApplication.java
