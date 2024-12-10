# NimapTest
Machine Test - Spring Boot Application with Category and Product CRUD Operations

This project implements a Spring Boot application with Category and Product CRUD operations. The following technologies and features have been used:

Technologies:
Spring Boot: The main framework for building the application.
REST Controller: Used to expose API endpoints for Category and Product entities.
JPA & Hibernate: For ORM (Object-Relational Mapping) and database interactions.
MySQL: Relational Database (RDB) used instead of in-memory storage.
Pagination: Server-side pagination implemented for fetching lists of categories and products.
Annotations-based Configuration: No XML configurations used, all configurations are done via annotations.
Features Implemented:
Category CRUD Operations:

GET /api/categories?page={page} - Get all categories with pagination.
POST /api/categories - Create a new category.
GET /api/categories/{id} - Fetch category details by ID.
PUT /api/categories/{id} - Update category by ID.
DELETE /api/categories/{id} - Delete category by ID.
Product CRUD Operations:

GET /api/products?page={page} - Get all products with pagination.
POST /api/products - Create a new product.
GET /api/products/{id} - Fetch product details by ID.
PUT /api/products/{id} - Update product by ID.
DELETE /api/products/{id} - Delete product by ID.
Category-Product Relationship:

One-to-many relationship between Category and Product.
One category can have multiple products.
Server-Side Pagination:

Pagination is implemented for both categories and products.
Use page parameter in the request to fetch paginated results.
Product Details with Category Information:

When fetching a single product's details, the response includes the related category information.
Database Configuration:
MySQL is used as the relational database.
Proper configuration for database connection and JPA-Hibernate integration.
Requirements:
Spring Boot application with JPA, Hibernate, and MySQL.
REST APIs for Category and Product CRUD operations.
Annotations-based configuration (no XML configuration).
Pagination for server-side data fetching.
Instructions:
Clone the repository:

bash
Copy code
git clone https://github.com/your-username/your-repository-name.git
Configure your database connection in application.properties:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/your-database-name
spring.datasource.username=your-username
spring.datasource.password=your-password
Run the Spring Boot application:

bash
Copy code
./mvnw spring-boot:run
Test the APIs using Postman or any HTTP client.

API Documentation:
GET /api/categories?page=3: Fetch all categories (paginated).

POST /api/categories: Create a new category.

GET /api/categories/{id}: Fetch a category by ID.

PUT /api/categories/{id}: Update a category by ID.

DELETE /api/categories/{id}: Delete a category by ID.

GET /api/products?page=2: Fetch all products (paginated).

POST /api/products: Create a new product.

GET /api/products/{id}: Fetch product by ID.

PUT /api/products/{id}: Update a product by ID.

DELETE /api/products/{id}: Delete a product by ID.

Note:
Pagination is mandatory for fetching categories and products.
Each product's response includes the related category information.
