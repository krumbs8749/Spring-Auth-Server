# Spring Project with Authentication, Spring Security, and Hibernate

This Spring project is a sample application that demonstrates how to implement authentication using Spring Security and Hibernate, with a PostgreSQL database. It also includes JWT token-based authentication and CSRF protection. In addition to authentication, the project provides a basic API for job search, which can be expanded or integrated with external services like RapidAPI in the future.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Configuration](#configuration)
- [Authentication](#authentication)
- [API Endpoints](#api-endpoints)
- [Future Improvements](#future-improvements)
- [License](#license)

## Prerequisites

Before you begin, ensure you have the following:

- Java Development Kit (JDK) 8 or higher
- Apache Maven installed
- PostgreSQL database server
- Postman or a similar API testing tool
- Your favorite integrated development environment (IDE)

## Getting Started

Follow these steps to set up and run the project on your local machine:

1. Clone this repository to your local machine:

   ```shell
   git clone https://github.com/yourusername/spring-authentication-project.git
   ```

2. Open the project in your IDE.

3. Create a PostgreSQL database and update the database configuration in `src/main/resources/application.yml` with your database credentials:


   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
   spring.datasource.username=your_database_username
   spring.datasource.password=your_database_password
   ```

4. Build the project using Maven:

   ```shell
   mvn clean install
   ```

5. Run the application:

   ```shell
   mvn spring-boot:run
   ```

The application should now be running at `http://localhost:8080`.

## Configuration

The project includes basic configuration files that you can customize according to your requirements:

- `src/main/resources/application.yml`: Contains configuration for JWT token settings and  database and Spring Security configuration properties.

Make sure to review and modify these files as needed.

## Authentication

Authentication in this project is handled by Spring Security. Users can register and log in through the following API endpoints:

- **Registration**: `/api/v1/auth/register` (HTTP POST)
  - Payload: JSON containing `firstname`, `lastname`, `email` and `password`.

- **Login**: `/api/v1/auth/authenticate` (HTTP POST)
  - Payload: JSON containing `email` and `password`.

Upon successful authentication, the user will receive a JWT token in the response, which should be included in the `Authorization` header for subsequent API requests.

## API Endpoints

### Job Search

The project includes a basic API for job search. The API endpoint for job search is:

- **Job Search**: `/api/v1/jobs/search` (HTTP GET)
  - Payload: JSON containing `query` and `numPage`.

Example request (Powershell):

```http
 Invoke-RestMethod -Uri http://localhost:8080/api/v1/job/search -Method POST -Body '{"query" : "Java Developer Werkstident", "numPage" : 1}' -ContentType "application/json"

```

Example response:

```json
[
  {
    "title": "Java Developer",
    "location": "New York",
    "description": "We are looking for an experienced Java developer...",
    "company": "ABC Inc.",
    "jobType": "Full-time"
  },
  // Additional job listings...
]
```

You can expand and enhance this API according to your project's requirements, and consider integrating with external job search services like RapidAPI in the future.

## Future Improvements

Here are some ideas for future improvements and enhancements to this project:

- Implement user roles and permissions for fine-grained access control.
- Add email verification during the registration process.
- Implement password reset functionality.
- Enhance the job search API with more advanced search features and filters.
- Implement pagination and sorting for job search results.
- Set up automated tests for the application.
