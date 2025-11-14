# 🏦 Spring Boot Banking App

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen)
![MySQL](https://img.shields.io/badge/Database-MySQL-blue)
![License](https://img.shields.io/badge/License-MIT-lightgrey)
![Build](https://img.shields.io/badge/Build-Maven-yellow)

A simple and clean **Banking REST API** built using **Spring Boot**, **Spring Data JPA**, and **MySQL**.  
It demonstrates CRUD operations for managing bank accounts with a layered architecture (Controller → Service → Repository → Entity → DTO → Mapper).


## 🚀 Features

✅ Create a new bank account  
✅ Fetch account details by ID  
✅ Update account balance  
✅ Delete an account  
✅ Clean architecture with DTO and Mapper  
✅ Uses Lombok for boilerplate reduction  
✅ MySQL integration with JPA (Hibernate ORM)


## ⚙️ Tech Stack

| Layer | Technology |
|-------|-------------|
| Language | Java 17 |
| Framework | Spring Boot 3.x |
| ORM | Spring Data JPA (Hibernate) |
| Database | MySQL |
| Dependency Manager | Maven |
| Build Tool | Spring Boot Maven Plugin |
| Additional | Lombok, REST APIs |


## 🧩 Project Architecture
com.proj.Banking_app
├── controller
│ └── AccountController.java
├── service
│ ├── AccountService.java
│ └── implementation
│ └── AccountServiceImp.java
├── repository
│ └── AccountRepository.java
├── entity
│ └── Account.java
├── dto
│ └── AccountDto.java
├── mapper
│ └── AccountMapper.java
└── BankingAppApplication.java



## 📦 API Endpoints

| Method | Endpoint | Description |
|--------|-----------|-------------|
| `POST` | `/api/accounts` | Create a new account |
| `GET` | `/api/accounts/{id}` | Retrieve account by ID |
| `PUT` | `/api/accounts/{id}` | Update account balance/details |
| `DELETE` | `/api/accounts/{id}` | Delete an account |


## 🧪 Example Request (Create Account)

**POST** `http://localhost:8080/api/accounts`

**Body:**
```json
{
  "accountHolderName": "John Doe",
  "balance": 5000.00
}

**Response:**
{
  "id": 1,
  "accountHolderName": "John Doe",
  "balance": 5000.0
}


💬 **Author**
👤 Siddhu Tirse
💼 Java & Spring Boot Developer
🌐 www.linkedin.com/in/siddheshtirse
