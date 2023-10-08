# Relationship Management Portal

This repository contains a Java application that provides a comprehensive solution for managing various relationships, including one-to-one, one-to-many, many-to-one, and many-to-many, using the following model entities:

- **Student**: Represents information about students.
- **Laptop**: Represents information about laptops owned by students.
- **Course**: Represents information about courses offered.
- **Book**: Represents information about books owned by students.
- **Address**: Represents address details.

## Features

- **Create**: Add new records for students, laptops, courses, books, and addresses.
- **Read**: Retrieve information about students, laptops, courses, books, and addresses.
- **Update**: Modify existing records for students, laptops, courses, books, and addresses.
- **Delete**: Remove records for students, laptops, courses, books, and addresses.

## Model Definitions

### Student
- **ID**: Unique identifier for the student.
- **Name**: Name of the student.
- **Age**: Age of the student.
- **Phone Number**: Contact number of the student.
- **Branch**: Branch of study.
- **Department**: Department of study.
- **Address**: One-to-one relationship with Address entity.
- **Course Set**: One-to-many relationship with Course entity.

### Laptop
- **ID**: Unique identifier for the laptop.
- **Name**: Name of the laptop.
- **Brand**: Brand of the laptop.
- **Price**: Price of the laptop.
- **Student**: One-to-one relationship with Student entity.

### Course
- **ID**: Unique identifier for the course.
- **Title**: Title of the course.
- **Description**: Description of the course.
- **Duration**: Duration of the course.
- **Student Set**: Many-to-many relationship with Student entity.

### Book
- **ID**: Unique identifier for the book.
- **Title**: Title of the book.
- **Author**: Author of the book.
- **Description**: Description of the book.
- **Price**: Price of the book.
- **Student**: Many-to-one relationship with Student entity.

### Address
- **Address ID**: Unique identifier for the address.
- **Landmark**: Landmark or reference point.
- **Zipcode**: Zipcode of the address.
- **District**: District of the address.
- **State**: State of the address.
- **Country**: Country of the address.

## CRUD Operations

- **Create**: Create new records for each entity.
- **Read**: Retrieve information about each entity.
- **Update**: Modify existing records for each entity.
- **Delete**: Remove records for each entity.

## Getting Started

To get started with this application, follow these steps:

1. Clone this repository to your local machine.
2. Configure the database settings in the `application.properties` file.
3. Run the application.

## Usage

- Use the provided API endpoints to perform CRUD operations on the entities.
- Refer to the API documentation for detailed usage instructions.

## API Documentation

For detailed API documentation, please refer to the [API Documentation](api-documentation.md) file.

## License

This project is licensed under the [MIT License](LICENSE). Feel free to use and modify it as needed.

## Acknowledgments

Special thanks to the developers who contributed to this project and the libraries used to build it. Your contributions are greatly appreciated.

---

Feel free to reach out if you have any questions or need further assistance. Happy coding! 😊
