# 🛒 Ecommerce Website

A repository for my **Ecommerce Website** project built with Java and MySQL.

---

## 📦 Overview

This project is a dynamic web application that allows users to explore and interact with an online storefront. It includes features such as admin login, product management, and integration with a MySQL database.

---

## 🗃️ Database Setup

The project requires a functional **MySQL database connection** to operate correctly.

👉 Please refer to the `interior_db.txt` file located in the root directory. It contains:
- SQL statements to create the required tables
- Initial data setup
- Default **Admin login credentials**

Make sure the database is set up before launching the application.

---

## 🧭 Filepath Configuration

If you encounter any **file path errors**, ensure:
- You update hardcoded paths (e.g., image uploads, includes) based on your local/project structure.
- Any absolute paths are changed to relative paths or corrected as per your file system.

---

## 🔧 Technologies Used

- **Java Servlets & JSP**
- **MySQL**
- **HTML/CSS**
- **JDBC**
- **Apache Tomcat** (or any servlet container)

---

## ⚠️ Important Notes

- Ensure your MySQL server is running before launching the application.
- Modify DB credentials in your Java code if needed:
  ```java
