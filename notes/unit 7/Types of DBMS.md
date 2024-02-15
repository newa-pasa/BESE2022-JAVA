## History of Database 
| DBMS | Features |
| ---- | ---- |
| file systems (1950s) | store data after process created it has ceased to exist |
| hierarchical/ network (1960s)      | concurrency <br>recovery <br>fast access<br>complex structures  |
| relational (1970-80s) | more reliability <br>less redundancy <br>more flexibility <br>multiple views  |
| OODBMS (1990s) | better simulation <br>more (and complex) data types <br>more relationships (e.g. aggregation, specialization) <br>single language for database AND programming <br>better versioning <br>no 'reconstruction' of objects <br>other OO advantages (reuse, inheritance etc.) |

#### DBMS selection guideline by Stonebraker
|  | No Query | Query |
| ---- | ---- | ---- |
| Complex Data | OODBMS | ORDBMS |
| Simple Data | File System | RDBMS |

### Stonebraker's Application Matrix
Michael Stonebraker, a database researcher, introduced a classification known as the "Stonebraker's Application Matrix" to categorize database systems based on their intended application workload. This matrix helps to differentiate between different types of database management systems (DBMS) based on the nature of the applications they are designed to support. Stonebraker identified four classes of applications and classified databases accordingly:

1. **Online Transaction Processing (OLTP):**
   - **Characteristics:**
     - Involves a large number of short, simple transactions.
     - High transaction rates.
     - Frequent updates and inserts.
   - **Example DBMS:**
     - PostgreSQL, MySQL, Oracle, Microsoft SQL Server.

2. **Online Analytical Processing (OLAP):**
   - **Characteristics:**
     - Involves complex queries on large datasets.
     - Aggregation and reporting.
     - Decision support and data analysis.
   - **Example DBMS:**
     - Amazon Redshift, Google BigQuery, Snowflake.

3. **Scientific/Engineering Applications:**
   - **Characteristics:**
     - Complex numerical calculations.
     - Handling large volumes of scientific data.
     - Supports scientific simulations.
   - **Example DBMS:**
     - SciDB, MonetDB.

4. **Data Warehousing:**
   - **Characteristics:**
     - Large-scale data storage for analytical queries.
     - Optimized for read-intensive operations.
     - Star or snowflake schema designs.
   - **Example DBMS:**
     - Teradata, Vertica, Amazon Redshift.

The matrix helps in understanding which types of databases are suitable for different application workloads. For example, OLTP databases are optimized for high-speed transactions, while OLAP databases are designed for complex queries and data analysis.

| Application Workload | OLTP | OLAP | Scientific/Engineering Applications | Data Warehousing |
| ---- | ---- | ---- | ---- | ---- |
| Characteristics | - Short, simple transactions<br>- High transaction rates<br>- Frequent updates and inserts | - Complex queries on large datasets<br>- Aggregation and reporting<br>- Decision support and data analysis | - Complex numerical calculations<br>- Handling large volumes of data<br>- Scientific simulations | - Large-scale data storage<br>- Optimized for read-intensive operations |
| Example DBMS | PostgreSQL, MySQL, Oracle, Microsoft SQL Server | Amazon Redshift, Google BigQuery, Snowflake | SciDB, MonetDB | Teradata, Vertica, Amazon Redshift |

### Example of OODBMS
An Object-Oriented Database Management System (OODBMS) is a type of database management system that is designed to store, retrieve, and manage objects, as opposed to traditional relational databases that store and manage data in tables. Here's an example of an Object-Oriented Database Management System:

### ObjectDB:

[ObjectDB](https://www.objectdb.com/) is an example of an Object-Oriented Database Management System. It is a high-performance, scalable, and lightweight OODBMS that is fully integrated with Java. ObjectDB supports the Java Persistence API (JPA), making it easy to work with for developers familiar with Java.

**Example of Using ObjectDB with JPA:**

Let's consider a simple example using ObjectDB with JPA to model a basic "Person" entity:

```java
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    private Long id;
    private String name;
    private int age;

    // Constructors, getters, setters, etc.
}
```

Now, let's use this entity in a Java program to store and retrieve objects using ObjectDB:

```java
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ObjectDBExample {
    public static void main(String[] args) {
        // Create an EntityManagerFactory and connect to ObjectDB
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/person.odb");
        EntityManager em = emf.createEntityManager();

        // Create a new person
        Person person = new Person();
        person.setId(1L);
        person.setName("John Doe");
        person.setAge(30);

        // Store the person in the database
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(person);
        tx.commit();

        // Retrieve the person from the database
        Person retrievedPerson = em.find(Person.class, 1L);
        System.out.println("Retrieved Person: " + retrievedPerson.getName() + ", Age: " + retrievedPerson.getAge());

        // Close the EntityManager and EntityManagerFactory
        em.close();
        emf.close();
    }
}
```

In this example:

- We define a simple "Person" entity class annotated with JPA annotations.
- We use ObjectDB to persist the "Person" object to the database and then retrieve it.

Note: The persistence unit configuration (`$objectdb/db/person.odb`) is specific to ObjectDB. In a production environment, you would configure the persistence unit based on your database setup.

ObjectDB is just one example of an OODBMS, and there are other systems, each with its own features and strengths. When choosing an OODBMS, consider factors such as integration with programming languages, performance, and scalability based on your application's requirements.

### Example of ORDBMS
An Object-Relational Database Management System (ORDBMS) combines the features of both relational databases and object-oriented databases. PostgreSQL is a widely used open-source ORDBMS that supports complex data types, user-defined types, and object-oriented features through the use of the SQL standard and additional extensions. Here's a simple example using PostgreSQL as an ORDBMS:

### PostgreSQL Example:

Consider a scenario where you want to model a database for a library with books and authors. We'll use PostgreSQL and leverage its support for user-defined types and object-relational features.

#### Step 1: Create a User-Defined Type

```sql
CREATE TYPE address AS (
    street VARCHAR(100),
    city VARCHAR(50),
    zip_code VARCHAR(10)
);
```

This creates a user-defined type named `address` representing an address.

#### Step 2: Create Tables Using User-Defined Type

```sql
CREATE TABLE authors (
    author_id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    bio TEXT,
    contact_address address
);

CREATE TABLE books (
    book_id SERIAL PRIMARY KEY,
    title VARCHAR(100),
    genre VARCHAR(50),
    author_id INT REFERENCES authors(author_id),
    publish_date DATE
);
```

These tables (`authors` and `books`) use the `address` type for the author's contact address.

#### Step 3: Insert Data

```sql
-- Inserting an author with an address
INSERT INTO authors (name, bio, contact_address)
VALUES ('Jane Doe', 'A renowned author.', ROW('123 Main St', 'Cityville', '12345'));

-- Inserting a book
INSERT INTO books (title, genre, author_id, publish_date)
VALUES ('Sample Book', 'Fiction', 1, '2022-01-01');
```

#### Step 4: Querying Data

```sql
-- Retrieving information about books and authors
SELECT
    books.title AS book_title,
    books.genre,
    authors.name AS author_name,
    authors.bio AS author_bio,
    authors.contact_address
FROM books
JOIN authors ON books.author_id = authors.author_id;
```

In this example:

- We define a user-defined type `address` for the contact address.
- Two tables (`authors` and `books`) use the `address` type for the contact address of authors.
- Data is inserted into these tables, demonstrating the use of complex data types.
- A query retrieves information about books and authors, including the contact address.

PostgreSQL is known for its support for object-relational features, making it suitable for scenarios where both relational and object-oriented concepts are needed in a database. Other ORDBMS systems may have similar features, but PostgreSQL serves as a widely used and well-documented example.

### Example of RDBMS
A Pure Relational Database Management System (RDBMS) adheres strictly to the principles of the relational model without incorporating object-oriented or complex data types. MySQL is a popular open-source RDBMS that follows the relational model closely. Here's a simple example using MySQL:

### MySQL Example:

Consider a scenario where you want to model a database for a simple online store with products and categories.

#### Step 1: Create Tables

```sql
-- Creating a table for product categories
CREATE TABLE categories (
    category_id INT PRIMARY KEY,
    category_name VARCHAR(50) NOT NULL
);

-- Creating a table for products
CREATE TABLE products (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(100) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    category_id INT,
    FOREIGN KEY (category_id) REFERENCES categories(category_id)
);
```

In this example, the `categories` table represents different product categories, and the `products` table represents individual products. The `category_id` in the `products` table is a foreign key referencing the `categories` table.

#### Step 2: Insert Data

```sql
-- Inserting data into the categories table
INSERT INTO categories (category_id, category_name) VALUES
(1, 'Electronics'),
(2, 'Clothing'),
(3, 'Books');

-- Inserting data into the products table
INSERT INTO products (product_id, product_name, price, category_id) VALUES
(101, 'Smartphone', 499.99, 1),
(102, 'Laptop', 999.99, 1),
(201, 'T-Shirt', 19.99, 2),
(202, 'Jeans', 39.99, 2),
(301, 'Programming Book', 29.99, 3),
(302, 'Novel', 14.99, 3);
```

#### Step 3: Querying Data

```sql
-- Retrieving information about products and their categories
SELECT
    products.product_id,
    products.product_name,
    products.price,
    categories.category_name
FROM products
JOIN categories ON products.category_id = categories.category_id;
```

In this MySQL example:

- We create two tables (`categories` and `products`) following the relational model.
- Data is inserted into these tables, demonstrating the use of simple data types.
- A query retrieves information about products and their categories using a JOIN operation.

MySQL, as a pure RDBMS, follows the relational model principles, using tables, relationships, and standard SQL for data management. This example demonstrates a simple schema with two related tables, showcasing the core principles of a pure RDBMS.
