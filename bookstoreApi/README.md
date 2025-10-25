
📚 **Bookstore API**

A Spring Boot RESTful API that manages books and authors in a bookstore system.
**It supports CRUD operations, filtering, pagination, and sorting — with an in-memory H2 Database, Swagger UI documentation, and Postman testing support.**

---
🚀 **Features**

Manage Authors and Books|

One-to-Many relationship (One Author → Many Books)|

CRUD Operations on both entities|

Filtering (e.g., by genre)|

Pagination & Sorting|

Integrated H2 Database|

Swagger UI for API documentation|

Tested via Postman|

---
**Tech Stack**

| Category            | Tools/Frameworks            |
| ------------------- | --------------------------- |
| **Language**        | Java 21                     |
| **Framework**       | Spring Boot 3.x             |
| **Database**        | H2 (In-memory)              |
| **Build Tool**      | Maven                       |
| **ORM**             | Hibernate / JPA             |
| **API Docs**        | Swagger (Springdoc OpenAPI) |                      |
| **Version Control** | Git, GitHub                 |

---


**Author**
 ├── authorId : Long
 ├── name : String
 └── books : List<Book>

**Book**
 ├── bookId : Long
 ├── title : String
 ├── genre : String
 ├── publicationYear : int
 ├── price : double
 └── author : Author



---
**API endpoints**

| Method     | Endpoint      | Description           |
| ---------- | ------------- | --------------------- |
| **POST**   | `/books`      | ➕ Add a new book      |
| **GET**    | `/books`      | 📋 Get all books      |
| **GET**    | `/books/{id}` | 🔍 Get a book by ID   |
| **PUT**    | `/books/{id}` | ✏️ Update a book      |
| **DELETE** | `/books/{id}` | ❌ Delete a book by ID |
