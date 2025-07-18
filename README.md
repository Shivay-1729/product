# 🛒 Product Inventory System

A simple Spring Boot CRUD application to manage product inventory for an e-commerce platform. This project performs basic Create, Read, Update, and Delete operations on a single `Product` entity using MySQL as the database.

---

## 📦 Features

- Add a new product
- Get a list of all products
- Update existing product information
- Delete a product by name
- Uses Spring Data JPA with MySQL
- RESTful API architecture

---

## 🛠 Tech Stack

- Java 17+
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- MySQL
- Lombok
- Gradle (build tool)
- IntelliJ IDEA (IDE)

---

## 🧩 Project Structure

src/
├── main/
│ ├── java/
│ │ └── com/Saurabh/product/
│ │ ├── controller/
│ │ ├── entity/
│ │ ├── repository/
│ │ ├── requestModel/
│ │ ├── responseModel/
│ │ ├── service/
│ │ └── service/impl/
│ └── resources/
│ ├── application.properties
│ └── schema.sql (optional)

pgsql
Copy
Edit

---

## 🧪 API Endpoints

| Method | Endpoint               | Description            |
|--------|------------------------|------------------------|
| POST   | `/api/product`         | Add new product        |
| GET    | `/api/getAllProduct`   | Get all products       |
| PUT    | `/api/product`         | Update existing product|
| DELETE | `/api/product/{name}`  | Delete product by name |

> Example POST JSON:
```json
{
  "name": "Laptop",
  "brand": "Apple",
  "price": 12345,
  "quantity": 2
}
⚙️ Setup Instructions
Clone the project

bash
Copy
Edit
git clone https://github.com/your-username/your-repo-name.git
Create MySQL database

sql
Copy
Edit
CREATE DATABASE productdetails;
Update application.properties

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/productdetails
spring.datasource.username=root
spring.datasource.password=root
Run the app

Via IntelliJ: Run the main class ProductApplication

Or via terminal:

bash
Copy
Edit
./gradlew bootRun
🚀 Deployment
This project can be containerized using Docker or deployed on any Spring-compatible server like Tomcat, AWS Elastic Beanstalk, or Heroku.
