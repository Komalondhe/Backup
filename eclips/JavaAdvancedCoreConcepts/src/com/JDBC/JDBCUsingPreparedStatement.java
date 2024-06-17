package com.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
public class JDBCUsingPreparedStatement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/wipro_test";
        String username = "root";
        String password = "rps@2345";
 
        try {
            // Load the JDBC driver (for MySQL)
            Class.forName("com.mysql.cj.jdbc.Driver");
 
            // Establish the connection
            Connection connection = DriverManager.getConnection(url, username, password);
 
            // Use PreparedStatement
            usePreparedStatement(connection);
 
            // Close the connection
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
 
    private static void usePreparedStatement(Connection connection) throws SQLException {
        String sql = "SELECT * FROM user WHERE username = ? AND status = ?";
        // Create a PreparedStatement
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        // Set the parameters
        preparedStatement.setString(1, "john_doe"); // Set username
        preparedStatement.setString(2, "active");   // Set status
 
        // Execute the query
        ResultSet resultSet = preparedStatement.executeQuery();
 
        // Process the result set
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String username = resultSet.getString("username");
            String email = resultSet.getString("email");
            String status = resultSet.getString("status");
 
            // Print the data
            System.out.println("ID: " + id + ", Username: " + username + ", Email: " + email + ", Status: " + status);
        }
 
        // Close the ResultSet and PreparedStatement
        resultSet.close();
        preparedStatement.close();
    }
}

