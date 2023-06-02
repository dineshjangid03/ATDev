# Spring Boot Student Project

This is a simple Spring Boot project for managing student records.

## Prerequisites

Before running the application, make sure you have the following installed:

- Java Development Kit (JDK) 8 or later
- Apache Maven
- MySQL database

## Technologies Used

- Java
- Hibernate
- Maven
- Spring Boot
- MySQL

## Getting Started

To build and run the project, follow these steps:

- Clone the repository: git clone https://github.com/dineshjangid03/ATDev.git
- Navigate to the project directory: cd ATDev
- Build the project: mvn clean install
- Run the application: mvn spring-boot:run
- The application will start running on http://localhost:8080.


## API Endpoints
The following API endpoints are available:

#### Inserts a new student record into the system.

- Endpoint: POST /insert

Request Body:

```json
{
  "studentName": "John Doe",
  "age": 20,
  "mobileNo": "1234567890"
}
```

Response:

```json
{
  "studentId": 123,
  "studentName": "John Doe",
  "age": 20,
  "mobileNo": "1234567890"
}
```

#### Retrieves all the student records from the system.

- Endpoint: GET /get

Response:

```json
[
  {
    "studentId": 123,
    "studentName": "John Doe",
    "age": 20,
    "mobileNo": "1234567890"
  },
  {
    "studentId": 456,
    "studentName": "Jane Smith",
    "age": 19,
    "mobileNo": "9876543210"
  },
  ...
]
```


#### Retrieves a student record by their ID.

- Endpoint: GET /get/{studentId}

    Path Parameter:
    studentId: The ID of the student to retrieve.

Response:

```json
{
  "studentId": 123,
  "studentName": "John Doe",
  "age": 20,
  "mobileNo": "1234567890"
}
```

#### Updates an existing student record in the system.

- Endpoint: PUT /update

Request Body:

```json
{
  "studentId": 123,
  "studentName": "John Doe",
  "age": 21,
  "mobileNo": "1234567890"
}
```

Response:

```json
{
  "studentId": 123,
  "studentName": "John Doe",
  "age": 21,
  "mobileNo": "1234567890"
}
```

#### Deletes a student record from the system.

- Endpoint: DELETE /delete/{studentId}

    Path Parameter:
    studentId: The ID of the student to delete.

Response:

```json
{
  "studentId": 123,
  "studentName": "John Doe",
  "age": 21,
  "mobileNo": "1234567890"
}
```
