
package com.JDBC;
 
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;
 
public class JDBCConnect {
 
// JDBC URL, username, and password of MySQL server

static final String JDBC_URL ="jdbc:mysql://localhost:3306/wipro_test";

static final String USERNAME = "root";

static final String PASSWORD = "rps@2345";
 
 
public static void main(String[] args) {
 
	try {

		Class.forName("com.mysql.cj.jdbc.Driver");

		} 

	catch (ClassNotFoundException e) {

		e.printStackTrace();

		return;

		}

		// Step 1: Establish a connection

		try (Connection connection =DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) 

		{

		// Step 2: Create a Statement

		try (Statement statement = connection.createStatement())

		{

		// Step 3: Create (Insert)

		insertData(statement, 1, "Komal", "londhe", 20);
		

		// Step 4: Read (Retrieve)

		retrieveData(statement);

		// Step 5: Update (Modify)

		updateData(statement, 1, 22);

		// Step 6: Read (Retrieve) after update

		retrieveData(statement);

		// Step 7: Delete (Remove)

		deleteData(statement, 3);

		// Step 8: Read (Retrieve) after delete

	retrieveData(statement);

		} 

		catch (SQLException e) {

		e.printStackTrace();

		}
 
 
} catch (SQLException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}

		}
 
// Method to insert data into the table

private static void insertData(Statement statement, int id,String firstName, String lastName, int age) throws SQLException {

String insertQuery = "INSERT INTO employees (id, first_name,last_name, age) VALUES (" + id + ", '" + firstName + "', '" + lastName+ "', " + age + ")";

statement.executeUpdate(insertQuery);

System.out.println("Data inserted successfully.");

}
 
 
// Method to retrieve data from the table

private static void retrieveData(Statement statement) throws SQLException {
String selectQuery = "SELECT * FROM employees";
try (ResultSet resultSet = statement.executeQuery(selectQuery)){
System.out.println("Employee data:");
while (resultSet.next()) 
{
System.out.println("ID: " + resultSet.getInt("id")+", Name: " + resultSet.getString("first_name")+ " " + resultSet.getString("last_name") +
", Age: " + resultSet.getInt("age"));

}

System.out.println();

}}
 
 
// Method to update data in the  table

private static void updateData(Statement statement, int id,int newAge) throws SQLException {

	String updateQuery = "UPDATE employees SET age = " + newAge+" WHERE id = " + id;

	statement.executeUpdate(updateQuery);

	System.out.println("Data updated successfully.");

	}

	// Method to delete data from the table

	private static void deleteData(Statement statement, int id) throws SQLException {

	String deleteQuery = "DELETE FROM employees WHERE id = "+id;

	statement.executeUpdate(deleteQuery);

	System.out.println("Data deleted successfully.");

	}}

