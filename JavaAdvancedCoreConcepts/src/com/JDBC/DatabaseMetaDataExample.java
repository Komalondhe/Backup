package com.JDBC;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
 
public class DatabaseMetaDataExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/wipro_test";
        String username = "root";
        String password = "rps@2345";
 
        try {
            // Load the JDBC driver (for MySQL)
            Class.forName("com.mysql.cj.jdbc.Driver");
 
            // Establish the connection
            Connection connection = DriverManager.getConnection(url, username, password);
 
            // Get DatabaseMetaData
            DatabaseMetaData dbMetaData = connection.getMetaData();
 
            // Retrieve database information
            String databaseProductName = dbMetaData.getDatabaseProductName();
            String databaseProductVersion = dbMetaData.getDatabaseProductVersion();
            String driverName = dbMetaData.getDriverName();
            String driverVersion = dbMetaData.getDriverVersion();
 
            System.out.println("Database Product Name: " + databaseProductName);
            System.out.println("Database Product Version: " + databaseProductVersion);
            System.out.println("Driver Name: " + driverName);
            System.out.println("Driver Version: " + driverVersion);
 
            // List tables in the database
            ResultSet tables = dbMetaData.getTables(null, null, "%", new String[]{"TABLE"});
            System.out.println("\nTables in the database:");
            while (tables.next()) {
                String tableName = tables.getString("TABLE_NAME");
                System.out.println("Table: " + tableName);
            }
 
            // Close the resources
            tables.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
