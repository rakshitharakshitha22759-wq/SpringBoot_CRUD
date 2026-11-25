# Spring Boot CRUD

A RESTful application built with Spring Boot to perform CRUD operations on student records.

## Features

- Create one or multiple students
- Retrieve all students or a student by id
- Update a student completely (PUT) or partially (PATCH)
- Delete a student by id or delete all students

## Tech Stack

Java, Spring Boot, Spring Data JPA, MySQL

## API Endpoints

| Method | Endpoint     | Description              |
|--------|--------------|--------------------------|
| POST   | /save        | Save a student           |
| POST   | /saveall     | Save multiple students   |
| GET    | /findAll     | Fetch all students       |
| GET    | /find/{id}   | Fetch a student by id    |
| PUT    | /update      | Update a student         |
| PATCH  | /patch/{id}  | Update selected fields   |
| DELETE | /delete/{id} | Delete a student by id   |
| DELETE | /delete      | Delete all students      |

## Getting Started

1. Clone the repository.
2. Create a MySQL database.
3. In src/main/resources, copy application.properties.example to application.properties and enter your database details.
4. Run the application from your IDE, or use mvnw spring-boot:run.

## Author

Rakshitha G N 

GitHub: [rakshitharakshitha22759-wq](https://github.com/rakshitharakshitha22759-wq)
