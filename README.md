A Spring Boot REST API for managing categories and products with JPA, Hibernate, and Pagination.

📌 Features
✅ Category CRUD Operations
✅ Product CRUD Operations
✅ One-to-Many Relationship (Category → Products)
✅ Pagination for Category & Product Lists
✅ REST API with JSON Responses
✅ Spring Boot, JPA, Hibernate, and MySQL

🛠 Tech Stack
Backend: Spring Boot, Spring Data JPA, Hibernate
Database: MySQL
Build Tool: Maven
API Documentation: Postman 

📢 API Endpoints
🟢 Category APIs
Method	Endpoint	Description
GET	/api/categories?page=3	Get paginated categories
POST	/api/categories	Create a new category
GET	/api/categories/{id}	Get category by ID
PUT	/api/categories/{id}	Update category by ID
DELETE	/api/categories/{id}	Delete category by ID
🟢 Product APIs
Method	Endpoint	Description
GET	/api/products?page=2	Get paginated products
POST	/api/products	Create a new product
GET	/api/products/{id}	Get product by ID (includes category details)
PUT	/api/products/{id}	Update product by ID
DELETE	/api/products/{id}	Delete product by ID
⚙️ Database Schema
Category (One) ↔ (Many) Product
Tables: categories, products
Foreign Key: products.category_id → categories.id

