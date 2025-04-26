
---

# **RLF2025 - Master Project**

This project is a web application developed as part of the Master Two program. It was generated using Visual Paradigm 15.2, utilizes Maven for dependency management, Hibernate for data persistence, and Apache Tomcat as the application server.
## **Prerequisites**

Before getting started, ensure you have the following tools installed on your machine:

1. **Java Development Kit (JDK)**: Version 11 or higher.
    - Verify your version with: `java -version`
2. **Apache Maven**: Version 3.6 or higher.
    - Verify your version with: `mvn -v`
3. **Apache Tomcat**: Version 9.x.
4. **Database**: Set up a database compatible with Hibernate (e.g., MySQL or PostgreSQL).
5. **IDE**: Use Intellij Community

---

## **Project Structure**

The project is organized as follows:

```
.
├── src/
│   ├── main/
│   │   ├── java/          # Java source code and webapp
│   │   ├── resources/     # Configuration files (Hibernate, etc.)
│   │
│   └── test/              # Unit tests
├── lib/                   # External libraries
├── pom.xml                # Maven configuration file
└── README.md
```

---

## **Instructions to Set Up and Run the Project**

### **1. Clone the Repository**
Clone this repository to your local machine:
```bash
git clone https://github.com/your-username/rlf2025.git
cd rlf2025
```

### **2. Configure the Database**
- Create an empty database (e.g., `RLF2025`) on your database server.
- Modify the file `src/main/resources/ormmapping/database.cfg.xml` to include your database connection details:
  ```xml
  <hibernate-configuration>
      <session-factory>
          <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/RLF2025</property>
          <property name="hibernate.connection.username">your_username</property>
          <property name="hibernate.connection.password">your_password</property>
          <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
      </session-factory>
  </hibernate-configuration>
  ```

### **3. Compile the Project**
Use Maven to compile the project and download the necessary dependencies:
```bash
mvn clean install
```

### **4. Generate the `.war` File**
Generate a `.war` file for deployment:
```bash
mvn package
```
The `.war` file will be generated in the `target/` directory.


### **5. Access the Application**
Run apache Tomcat, access the application via the following URL:
```
http://localhost:8080/rlf2025/
```

## **Contact**

If you have any questions or issues, feel free to contact:

- **Name**: AndreaRabe
- **Email**: nantenainaandrea2@gmail.com

---