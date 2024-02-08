JDBC (Java Database Connectivity) is a Java API that enables Java applications to interact with relational databases. The JDBC architecture consists of several key components and layers that work together to provide a bridge between Java applications and relational databases.

### JDBC Architecture Components:
![[JDBC Components.png]]

1. **JDBC API:**
    - The JDBC API provides a set of classes and interfaces that define how Java applications interact with databases.
    - Key interfaces include `Driver`, `Connection`, `Statement`, `ResultSet`, and others.
2. **JDBC Driver Manager:**
    - The `DriverManager` class manages a list of database drivers. It is responsible for:
        - Loading the appropriate JDBC driver.
        - Establishing a database connection.
        - Handling multiple drivers.
3. **JDBC Driver:**
    - JDBC drivers are platform-specific implementations that allow Java applications to communicate with a particular database management system (DBMS).
    - There are four types of JDBC drivers: Type-1 (JDBC-ODBC Bridge), Type-2 (Native-API), Type-3 (Network Protocol), and Type-4 (Thin Driver or Direct-to-Database).
4. **Database Connection:
    - The `Connection` interface represents a connection to the database. It provides methods to:
        - Establish a connection.
        - Create statements.
        - Commit or rollback transactions.
        - Close the connection.
5. **Statement:
    - The `Statement` interface is used to execute SQL queries and updates. There are three types of statements:
        - `Statement`: for general-purpose SQL statements.
        - `PreparedStatement`: precompiled SQL statements for improved performance.
        - `CallableStatement`: used to execute stored procedures.
6. **ResultSet:
    - The `ResultSet` interface represents the result set of a query. It provides methods to traverse and access the data returned by a query.
7. **SQL Exceptions:
    - The `SQLException` class and its subclasses handle exceptions related to database operations. Applications need to handle exceptions to gracefully manage errors during database interactions.

### JDBC Workflow:

1. **Loading the Driver:
    - Use `Class.forName("driverClassName")` to load the appropriate JDBC driver dynamically. Alternatively, modern JDBC drivers often do not require explicit loading due to automatic driver registration.
2. **Establishing Connection:
    - Use `DriverManager.getConnection(url, username, password)` to establish a connection to the database. The URL typically includes information about the database server and the specific database.
3. **Creating Statements:**
    - Create `Statement`, `PreparedStatement`, or `CallableStatement` objects to execute SQL queries and updates.
4. **Executing Queries:
    - Execute SQL queries using the appropriate statement object (`executeQuery` for SELECT queries).
5. **Processing Results:
    - Use the `ResultSet` to process the results of a query. Iterate through the result set to retrieve and manipulate data.
6. **Updating the Database:
    - Use the appropriate statement object (`executeUpdate`) to perform database updates, inserts, and deletes.
7. **Closing Resources:
    - Close the `ResultSet`, `Statement`, and `Connection` objects to release database resources. It is crucial to close resources explicitly to avoid memory leaks and maintain good database connection management.
