# Rest Assured API Automation Framework

## Overview

This project is a lightweight API Automation Framework built using:



The framework follows a clean separation of responsibilities using Request Specifications, Response Specifications, Assertions, Endpoints, and Payload classes.


---

## Framework Structure

```text
RestAssuredFramework
│
├── src
│   └── test
│       ├── java
│       │
│       ├── assertions
│       │   └── EmployeeAssertions.java
│       │
│       ├── base
│       │   └── BaseTest.java
│       │
│       ├── config
│       │   └── ConfigReader.java
│       │
│       ├── endpoints
│       │   └── EmployeeEndpoints.java
│       │
│       ├── payloads
│       │   └── EmployeePayload.java
│       │
│       ├── specs
│       │   ├── RequestSpecs.java
│       │   └── ResponseSpecs.java
│       │
│       └── tests
│           ├── GetAllEmployeesTest.java
│           └── CreateEmployeeTest.java
│
├── src/test/resources
│   └── config.properties
│
├── pom.xml
│
└── README.md
```

---

## Design Architecture

### Request Specifications

Responsible for:

- Base URI
- Content Type
- Common Headers
- Authentication (future)

Example:

```java
given()
    .spec(RequestSpecs.defaultRequest())
``

---

### Response Specifications

Responsible for:

- Status Code Validation
- Content Type Validation
- Response Time Validation

Example:

```java
response.then()
        .spec(ResponseSpecs.successResponse());
```

---

### Assertions Layer

Responsible for business validations:

- Success Message Validation
- Employee Name Validation
- Employee List Validation

Example:

```java
EmployeeAssertions.verifySuccessMessage(
        actualStatus,
        "success",
        softAssert
);
```

---

### Payload Layer

Responsible for creating reusable request payloads.

Example:

```java
Map<String, Object> payload =
        EmployeePayload.createNewEmployeePayload();
```

Employee names are generated dynamically using timestamps to avoid duplicate data.

---

### Endpoints Layer

Stores all API endpoints in a centralized location.

Example:

```java
EmployeeEndpoints.CREATE_EMPLOYEE
```

---

## Current Test Coverage

### GET

- Get All Employees

### POST

- Create Employee

---


---

## Test Execution

Run all tests:

```bash
mvn clean test
```

---

## API Under Test

https://dummy.restapiexample.com/api/v1

---

