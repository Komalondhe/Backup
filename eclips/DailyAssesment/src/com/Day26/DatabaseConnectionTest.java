package com.Day26;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnectionTest {
public static void main(String[] args) {
// Database connection parameters
String url = "jdbc:mysql://localhost:3306/wipro_test";
String username = "root";
String password = "rps@2345";
// Attempt to establish the connection
try {
// Load the MySQL JDBC driver
Class.forName("com.mysql.cj.jdbc.Driver");
// Establish the connection
Connection connection = DriverManager.getConnection(url, username, password);
// Print out the connection object
System.out.println("Connection successful: " + connection);
// Close the connection
connection.close();
} catch (ClassNotFoundException e) {
System.out.println("MySQL JDBC driver not found");
e.printStackTrace();
} catch (SQLException e) {
System.out.println("Connection failed");
e.printStackTrace();
}
}
}
