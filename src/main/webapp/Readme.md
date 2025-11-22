# 🧺 Donation Portal – Java Servlet & MySQL Web Application

A simple yet functional web application that connects donors and receivers through a donation system.  
Built using **Java Servlets, JSP-style HTML output, JDBC, and MySQL**, this project demonstrates core backend concepts such as CRUD operations, request handling, server-side rendering, and MVC-style structuring.

---

## 📌 Project Overview

The Donation Portal allows users to:
- **Donate items** by submitting item details.
- **View all available donations** in a clean table format.
- **Receive an item** by selecting it, which deletes it from the database.
- Display inspirational **quotes** for a better user experience.

This project was built as part of my backend learning journey using **Java Servlets & JDBC** and aims to provide a clear understanding of server-side development fundamentals.

---

## 🛠️ Tech Stack

### **Frontend**
- HTML5  
- CSS3  

### **Backend**
- Java  
- Servlets (Jakarta EE)  
- JDBC  

### **Database**
- MySQL

### **Tools**
- Eclipse IDE / IntelliJ  
- Apache Tomcat  
- MySQL Workbench / Command Line  
- Git & GitHub  

---

## 📂 Project Features

### ✔ **1. Donate an Item**  
Users can donate any item by entering:
- Item Name  
- Donor Name  
- Location  

All details are stored in **MySQL** using JDBC.

### ✔ **2. View Available Donations**  
Retrieves all donation records from the database and displays them in a table.

### ✔ **3. Receive an Item**  
‘Receive’ button deletes the selected donation from the table, marking the item as collected.

### ✔ **4. Beautiful UI Enhancements**
Includes:
- Quote box  
- Buttons  
- Container layout  
- Gradient background  
- Clean and readable design  

---

## 🗄️ Database Schema

Table: **donation_table**

| Column Name | Type        | Description        |
|-------------|-------------|--------------------|
| sno         | INT (PK)    | Auto-increment ID  |
| item_name   | VARCHAR     | Name of the item   |
| donar_name  | VARCHAR     | Name of donor      |
| location    | VARCHAR     | City/Area          |

---

## 🚀 How It Works

### 1️⃣ **Donor submits item**  
Servlet saves it to MySQL database.

### 2️⃣ **Receiver views all items**  
Retrieve data using `SELECT * FROM donation_table`.

### 3️⃣ **User clicks Receive**  
`ReceiveStatus` servlet deletes the entry from database.

### 4️⃣ **Success/Failure UI messages**  
Each action returns a styled HTML response with quotes.

---

## ▶️ How to Run the Project

1. Install **JDK 17+**  
2. Install **Apache Tomcat (9 or 10)**  
3. Create MySQL database:
   use mydatabase;
   create table donation_table (
     sno int auto_increment primary key,
     item_name varchar(100),
     donar_name varchar(100),
     location varchar(100)
   );
4. Import project in Eclipse/IntelliJ  
5. Add Tomcat server  
6. Start the server and run the project  

---

## 🎯 Learning Outcomes

Through this project, I learned:
- Handling HTTP requests using **Servlets** (GET/POST)
- Performing CRUD using **JDBC**
- Writing dynamic HTML output from backend
- Connecting Java apps to MySQL
- Designing clean UI with HTML/CSS
- Debugging servlet flow & deployment issues

---

## 📸 Screenshots  
(Add your screenshots here after running the project)

---

## 💬 Future Enhancements

- Convert HTML output to JSP files  
- Add login for donors/receivers  
- Add donation categories  
- Add search functionality  
- Add timestamps for donations  
- Use MVC folder structure  

---

## 👤 Author

**Nireesha Addi**  
Java Backend Developer  
GitHub: *(your GitHub link)*  
LinkedIn: *(your LinkedIn link)*



