# 🛒 E-Commerce Backend Application

A hands-on backend development project built using **Java and Spring Boot**, focused on developing RESTful APIs and understanding real-world backend application architecture.

The project is being developed incrementally, starting with User Management APIs and progressing towards database integration, complete E-Commerce functionality, Docker containerization, and Microservices architecture.

## 🛠️ Technology Stack

**Currently Used**
- Java
- Spring Boot
- Spring MVC
- REST APIs
- ResponseEntity
- Postman
- Git & GitHub
- Maven

**Planned Technologies**
- Spring Data JPA
- Hibernate
- H2 Database
- PostgreSQL
- Spring Boot Actuator
- Docker
- Docker Compose
- Microservices
- API Gateway

## ✅ Current Implementation

### Phase 1: Project Setup & User Management APIs

Completed and tested the initial User Management module.

Implemented functionality:
- Fetch all users
- Create new users
- Fetch a single user
- Update existing users
- Service layer implementation
- Unique ID management
- REST API development using Spring MVC
- HTTP response handling using ResponseEntity

**API Testing:** Implemented endpoints have been tested successfully using Postman.

## 🚀 Development Roadmap

### Phase 2: Data Access with JPA & Hibernate
- H2 database configuration
- JPA and Hibernate integration
- Entity and repository implementation
- User-Address relationships
- Data Transfer Object (DTO) pattern

### Phase 3: E-Commerce Functionality
- Product management and CRUD APIs
- Shopping cart implementation
- Adding and removing cart items
- Order management
- End-to-end order processing

### Phase 4: Monitoring & DevOps
- Spring Boot Actuator
- Application health monitoring
- Metrics and logging
- Docker image and container creation
- Docker Compose
- PostgreSQL integration

### Phase 5: Microservices Architecture
- Transition from monolithic to microservices architecture
- User Service
- Product Service
- Order Service
- API Gateway
- Docker Compose orchestration
- Service integration and deployment testing

## 📂 Project Structure

```text
ecom-application/
│
├── src/
│   ├── main/
│   │   ├── java/com/app/ecom/
│   │   │   ├── EcomApplication.java
│   │   │   ├── User.java
│   │   │   ├── UserController.java
│   │   │   └── UserService.java
│   │   │
│   │   └── resources/
│   │
│   └── test/
│
├── .mvn/
├── pom.xml
├── mvnw
├── mvnw.cmd
└── .gitignore
```

## ▶️ Getting Started

### Prerequisites
- Java JDK 17
- IntelliJ IDEA
- Maven
- Git

### Clone the repository

```bash
git clone https://github.com/imayeshakhatoon/E-Commerce_application.git
```

### Open the project
Import the project into IntelliJ IDEA as a Maven project.

### Run the application

Run `EcomApplication.java` from IntelliJ IDEA.

## 🧪 API Testing

Postman is used to test the implemented REST API endpoints, inspect HTTP responses, and verify endpoint functionality.

## 🎯 Project Objective

The objective is to strengthen practical Java backend development skills by building an E-Commerce application step by step, understanding backend architecture, implementing REST APIs, and gradually exploring database management, containerization, and distributed systems.

## 👩‍💻 Development Approach

This is an evolving learning project. Features are implemented, tested, and documented as development progresses.

**Current milestone:** User Management REST APIs — Completed and tested.

More functionality will be added as the project evolves.
