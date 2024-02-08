// import java.sql.*;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class StudentProfile {
    public static void main(String args[])
            throws SQLException, ClassNotFoundException {
        // String driverClassName = "com.mysql.cj.jdbc.Driver";
        // String url = "jdbc:mysql://localhost:3306/school";

        String driverClassName = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/school";

        String username = "postgres";
        String password = "postgres";

        String newName = "Dilip";
        // String id = "109";
        String id = "109; drop table students";
        String insertQuery = "insert into students values(109, 'bhatta');";
        String updateQuery = "update students set name='" + newName + "' where id=" + id;

        // Load driver class
        Class.forName(driverClassName);

        // Obtain a connection
        Connection con = DriverManager.getConnection(
                url, username, password);

        // Obtain a statement
        Statement st = con.createStatement();

        // Execute the insert query
        int count = st.executeUpdate(insertQuery);
        System.out.println(
            "number of rows affected by insert query= "
                    + count);
        // Execute the insert query
        count = st.executeUpdate(updateQuery);

        System.out.println(
                "number of rows affected by update query= "
                        + count);

        // Closing the connection as per the
        // requirement with connection is completed
        con.close();
    }
}


// create table students(
// 	id integer,
// 	name varchar(100)
// )