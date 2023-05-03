# SpringBoot_Book_Store
- Book Store Management | Spring boot simple project | MySql | Thymeleaf |JPA


# Project-Documentation

<p align="center">
  <a href="" rel="noopener">
 <img width=200px height=200px src="https://github.com/Suraj138/SpringBoot_Book_Store/blob/master/screenshot/booklogo.png" alt="Project logo"></a>
</p>

<h3 align="center">SpringBoot Book Store Management</h3>

<div align="center">

  [![Status](https://img.shields.io/badge/status-active-success.svg)]() 
  [![GitHub Issues](https://img.shields.io/github/issues/kylelobo/The-Documentation-Compendium.svg)](https://github.com/kylelobo/The-Documentation-Compendium/issues)
  [![GitHub Pull Requests](https://img.shields.io/github/issues-pr/kylelobo/The-Documentation-Compendium.svg)](https://github.com/kylelobo/The-Documentation-Compendium/pulls)
  [![License](https://img.shields.io/badge/license-MIT-blue.svg)](/LICENSE)

</div>

---

<p align="center"> 
The Book Store Management system is a Java-based software application developed using Springboot, Thymeleaf, and JPA frameworks. The system is designed to simplify the operations of a bookstore by providing tools for managing inventory, tracking sales, and monitoring store performance. It is a scalable and flexible solution that provides a user-friendly interface for easy navigation and performing tasks such as adding new books, updating inventory, and managing sales.
    <br> 
</p>


## 📝 Table of Contents
- [About](#about)
- [Getting Started](#getting_started)
- [Deployment](#deployment)
- [Usage](#usage)
- [Built Using](#built_using)
- [Contributing](../CONTRIBUTING.md)
- [Authors](#authors)
- [Acknowledgments](#acknowledgement)


## 🧐 About <a name = "about"></a>
The Book Store Management System is a Java-based web application developed using Spring Boot, Thymeleaf, and JPA. The purpose of this system is to manage the storage, tracking, and sale of books in a bookstore. It has been designed for single-user access, with the admin managing the overall application. The system is built using the MVC (Model, View, Controller) pattern, with Spring Boot as the backend, Hibernate as the data access layer, and HTML, CSS, and Bootstrap for the frontend. MySQL is used as the database for this application.

The Book Store Management system is a powerful software solution designed to simplify the operations of a bookstore. Developed using Java and leveraging the Springboot, Thymeleaf, and JPA frameworks, the system offers a variety of features to help bookstore owners or managers manage their store operations more efficiently.

The main functionalities of the system include:-

- Listing all books: The system provides the all book list in our store ("/book-list") to fetch the details of all registered books.

- Updating a book: Users can update book details by providing the book ID and a make changes itself ("/books/{id})".

- AddBook: In this section, we can add books to our online store by providing the necessary details, and once added successfully, they will appear in the bookList section.

- MyBookList: In this section, we can add books to our favorites list, and we can view this list at any time.

- DeletBook: In this section, we can delete any book from our book list as needed.

- Fetching book details by ID: This functionality allows users to get all the details of a book by providing its ID. The endpoint for this function.


## 🏁 Getting Started <a name = "getting_started"></a>
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See [Deployment](#deployment) for notes on how to deploy the project on a live system.

### Prerequisites
You need Eclipse EE edition/Spring Tool Suite, Tomcat Server, Spring Framework MySQL Databasev software to work on this project. Go to google and search,

```
I'm using Spring Tool Suite for this project.

1. Sprint-Tool-Suite Installation

2. Create a Project File in spring boot initializr

3. Here give name project, details about store and adding dependency

4. click generate button

5. After generating u get 1 zip file extrack and import in your STS.
```
Example:


![screenshot10](https://github.com/Suraj138/SpringBoot_Book_Store/blob/master/screenshot/screenshot%2011.jpg)
![screenshot11](https://github.com/Suraj138/SpringBoot_Book_Store/blob/master/screenshot/screenshot%2012.jpg)


### Installing
A step by step series of examples that tell you how to get a development env running.

- To install the software for your Spring Boot online book store management project, you will need to install the following components:

```
Spring Boot: This is a framework for building Java-based web applications, and includes many pre-built components and modules that simplify the development process. You can download Spring Boot from the official website or via the Maven or Gradle build tools.
Database: You will need to choose a database management system to store and manage data for your application. Some popular databases for Spring Boot development include MySQL, PostgreSQL, and MongoDB. Here am using MySQL Workbench 8.0
Once you have downloaded and installed these components, you can set up your development environment and start building your Spring Boot application. The installation process will
vary depending on your operating system and the specific tools you choose to use, but most of them have user-friendly installation wizards that guide you through the process.

To install Spring Boot, you can follow these steps:

Download the latest version of Spring Boot from the official website.
Extract the downloaded archive to a directory on your computer.
Set up your development environment to use Spring Boot by adding it to your classpath or build tool configuration.
To install a database management system, you can follow the instructions provided by the specific database vendor for your operating system.

Remember, always make sure to install and configure these components properly, as they are critical to the success of your project.
```

## 🔧 Running the tests <a name = "tests"></a>
Open Spring Tool Suit and Run the project on Spring boot. Check the port on which the server is running. Open a browser and go to local host and check webpage is running.

### Break down into end to end tests
After opening the local host. you enter our online book management system and see all collection book, add book and my book list page.

```
Example
```
![screenshot10](https://github.com/Suraj138/SpringBoot_Book_Store/blob/master/screenshot/Screenshot%2010.png)


## 🎈 Usage <a name="usage"></a>
Portal designed to help users keep track of their personal book collection. With the ability to add any book with its details, users can easily manage their library and keep track of their reading progress. Additionally, the portal allows users to modify book details, delete books, and register new books to their collection.



## 🚀 Deployment <a name = "deployment"></a>
Screenshots showing working of the project:
- Home page:
![screenshot1](https://github.com/Suraj138/SpringBoot_Book_Store/blob/master/screenshot/Screenshot%201.png)

- Available Book List:
![screenshot2](https://github.com/Suraj138/SpringBoot_Book_Store/blob/master/screenshot/Screenshot%202.png)

- MyBookList
![screenshot3](https://github.com/Suraj138/SpringBoot_Book_Store/blob/master/screenshot/Screenshot%203.png)

- NewBookRegister
![screenshot4](https://github.com/Suraj138/SpringBoot_Book_Store/blob/master/screenshot/Screenshot%204.png)

- EditBookList
![screenshot5](https://github.com/Suraj138/SpringBoot_Book_Store/blob/master/screenshot/Screenshot%204.png)

- JavaCodes main runnable class
![screenshot6](https://github.com/Suraj138/SpringBoot_Book_Store/blob/master/screenshot/Screenshot%206.png)

- Application.Properties
![screenshot7](https://github.com/Suraj138/SpringBoot_Book_Store/blob/master/screenshot/Screenshot%207.png)

- MySQL Database
![screenshot8](https://github.com/Suraj138/SpringBoot_Book_Store/blob/master/screenshot/Screenshot%208.png)

- MySQL Database
![screenshot9](https://github.com/Suraj138/SpringBoot_Book_Store/blob/master/screenshot/Screenshot%209.png)



## ⛏️ Built Using <a name = "built_using"></a>
- [MySQL](https://www.mysql.com/) - Database
- [SpringBoot](https://start.spring.io/) - Server Framework
- [HTML5](https://www.w3schools.com/html/) - Markup language used for creating web pages.
- [Bootstrap5](https://getbootstrap.com/) - Web Environment



## ✍️ Authors <a name = "authors"></a>
- [@Suraj Kumar](https://github.com/suraj138) - Idea & Initial work



## 🎉 Acknowledgements <a name = "acknowledgement"></a>
- Inspiration: Junie Deny Solomon &  [@Skill-Lync](https://skill-lync.com/)
- References: Junie Deny Solomon
- References: Bheemesh R
- References: Bhupendra Parihar
- References: Imaginary Engineering
