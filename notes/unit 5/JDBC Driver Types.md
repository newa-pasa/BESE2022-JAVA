## ****JDBC Drivers****

****JDBC drivers**** are client-side adapters (installed on the client machine, not on the server) that convert requests from Java programs to a protocol that the DBMS can understand. ****JDBC drivers**** are the software components which implements interfaces in JDBC APIs to enable java application to interact with the database. Now we will learn how many JDBC driver types does Sun defines? There are four types of JDBC drivers defined by Sun Microsystem that are mentioned below:

1. Type-1 driver or JDBC-ODBC bridge driver
2. Type-2 driver or Native-API driver
3. Type-3 driver or Network Protocol driver
4. Type-4 driver or Thin driver

### 1. JDBC-ODBC bridge driver – Type 1 driver

Type-1 driver or JDBC-ODBC bridge driver uses ODBC driver to connect to the database. The JDBC-ODBC bridge driver converts JDBC method calls into the ODBC function calls. Type-1 driver is also called Universal driver because it can be used to connect to any of the databases.

![[JDBC-ODBC bridge driver.png]]
### Advantages

- This driver software is built-in with JDK so no need to install separately.
- It is a database independent driver.

### Disadvantages

- As a common driver is used in order to interact with different databases, the data transferred through this driver is not so secured.
- The ODBC bridge driver is needed to be installed in individual client machines.
- Type-1 driver isn’t written in java, that’s why it isn’t a portable driver.

### ****2.**** Native-API driver – Type 2 driver ( Partially Java driver)

The Native API driver uses the client -side libraries of the database. This driver converts JDBC method calls into native calls of the database API. In order to interact with different database, this driver needs their local API, that’s why data transfer is much more secure as compared to type-1 driver. This driver is not fully written in Java that is why it is also called Partially Java driver.

![[Native-API driver.png]]
### Advantage

- Native-API driver gives better performance than JDBC-ODBC bridge driver.

### Disadvantages

- Driver needs to be installed separately in individual client machines
- The Vendor client library needs to be installed on client machine.
- Type-2 driver isn’t written in java, that’s why it isn’t a portable driver
- It is a database dependent driver.

### 3. Network Protocol driver – Type 3 driver (fully Java driver)

The Network Protocol driver uses middleware (application server) that converts JDBC calls directly or indirectly into the vendor-specific database protocol. Here all the database connectivity drivers are present in a single server, hence no need of individual client-side installation.

![[Network Protocol driver.png]]

### Advantages

- Type-3 drivers are fully written in Java, hence they are portable drivers.
- No client side library is required because of application server that can perform many tasks like auditing, load balancing, logging etc.
- Switch facility to switch over from one database to another database.

### Disadvantages

- Network support is required on client machine.
- Maintenance of Network Protocol driver becomes costly because it requires database-specific coding to be done in the middle tier.

### 4. Thin driver – Type 4 driver (fully Java driver)

Type-4 driver is also called native protocol driver. This driver interact directly with database. It does not require any native database library, that is why it is also known as Thin Driver.

![[Thin driver.png]]

### Advantages

- Does not require any native library and Middleware server, so no client-side or server-side installation.
- It is fully written in Java language, hence they are portable drivers.

### Disadvantage

- If the database varies, then the driver will carry because it is database dependent.

### Which Driver to use When?

- If you are accessing one type of database, such as Oracle, Sybase, or IBM, the preferred driver type is type-4.
- If your Java application is accessing multiple types of databases at the same time, type 3 is the preferred driver.
- Type 2 drivers are useful in situations, where a type 3 or type 4 driver is not available yet for your database.
- The type 1 driver is not considered a deployment-level driver, and is typically used for development and testing purposes only.

Source: [JDBC Drivers - GeeksforGeeks](https://www.geeksforgeeks.org/jdbc-drivers/)