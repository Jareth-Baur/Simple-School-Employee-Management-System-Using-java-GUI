package com.main;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class EmployeeDAO {

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/school_employee_management";
    private static final String USERNAME = "user";
    private static final String PASSWORD = "user";

    // JDBC variables for opening, closing, and managing connection
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    // Method to establish database connection
    private static void connect() throws SQLException {
        connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }

    // Method to close database connection
    private static void close() throws SQLException {
        if (resultSet != null) {
            resultSet.close();
        }
        if (preparedStatement != null) {
            preparedStatement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }

    public static void insertEmployee(Employee employee) {
        try {
            connect();
            String query = "INSERT INTO employees (first_name, last_name, gender, date_of_birth, hire_date, job_title, salary, email, phone_number) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setString(3, employee.getGender());
            preparedStatement.setDate(4, employee.getDateOfBirth());
            preparedStatement.setDate(5, employee.getHireDate());
            preparedStatement.setString(6, employee.getJobTitle());
            preparedStatement.setBigDecimal(7, employee.getSalary());
            preparedStatement.setString(8, employee.getEmail());
            preparedStatement.setString(9, employee.getPhoneNumber());
            preparedStatement.executeUpdate();
            close();
            JOptionPane.showMessageDialog(null, "Employee added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Employee added successfully.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed to add employee: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Failed to add employee: " + e.getMessage());
        }
    }

    // Method to retrieve all employees from the database
    public static Employee[] getAllEmployees() throws SQLException {
        connect();
        String query = "SELECT * FROM employees";
        preparedStatement = connection.prepareStatement(query);
        resultSet = preparedStatement.executeQuery();
        List<Employee> employees = new ArrayList<>();
        while (resultSet.next()) {
            Employee employee = new Employee(
                    resultSet.getInt("employee_id"), // Set the employee ID
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("gender"),
                    resultSet.getDate("date_of_birth"),
                    resultSet.getDate("hire_date"),
                    resultSet.getString("job_title"),
                    resultSet.getBigDecimal("salary"),
                    resultSet.getString("email"),
                    resultSet.getString("phone_number")
            );
            employees.add(employee);
        }
        close();
        return employees.toArray(Employee[]::new);
    }

    public static Employee getEmployee(int employeeId) throws SQLException {
        connect();
        String query = "SELECT * FROM employees WHERE employee_id = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, employeeId);
        resultSet = preparedStatement.executeQuery();
        Employee employee = null;
        if (resultSet.next()) {
            employee = new Employee(
                    resultSet.getInt("employee_id"),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("gender"),
                    resultSet.getDate("date_of_birth"),
                    resultSet.getDate("hire_date"),
                    resultSet.getString("job_title"),
                    resultSet.getBigDecimal("salary"),
                    resultSet.getString("email"),
                    resultSet.getString("phone_number")
            );
        }
        close();
        return employee;
    }

    public static void updateEmployee(Employee employee) throws SQLException {
        connect();
        String query = "UPDATE employees SET first_name = ?, last_name = ?, gender = ?, date_of_birth = ?, hire_date = ?, job_title = ?, salary = ?, email = ?, phone_number = ? WHERE employee_id = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, employee.getFirstName());
        preparedStatement.setString(2, employee.getLastName());
        preparedStatement.setString(3, employee.getGender());
        preparedStatement.setDate(4, employee.getDateOfBirth());
        preparedStatement.setDate(5, employee.getHireDate());
        preparedStatement.setString(6, employee.getJobTitle());
        preparedStatement.setBigDecimal(7, employee.getSalary());
        preparedStatement.setString(8, employee.getEmail());
        preparedStatement.setString(9, employee.getPhoneNumber());
        preparedStatement.setInt(10, employee.getEmployeeId());

        int rowsUpdated = preparedStatement.executeUpdate();
        close();

        // Check if update was successful
        if (rowsUpdated > 0) {
            // Show success message dialog
            JOptionPane.showMessageDialog(null, "Employee information updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Show error message dialog
            JOptionPane.showMessageDialog(null, "Failed to update employee information.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to search for an employee by employee_id and display all details in text area
    public static void searchEmployee(String employeeId, JTextArea forDeletionTextArea) {
        try {
            // Parse the employeeId to an integer
            int id = Integer.parseInt(employeeId);

            connect();
            String query = "SELECT * FROM employees WHERE employee_id = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String gender = resultSet.getString("gender");
                String dateOfBirth = resultSet.getString("date_of_birth");
                String hireDate = resultSet.getString("hire_date");
                String jobTitle = resultSet.getString("job_title");
                BigDecimal salary = resultSet.getBigDecimal("salary");
                String email = resultSet.getString("email");
                String phoneNumber = resultSet.getString("phone_number");

                // Format the output with all details
                String output = "Employee ID: " + employeeId + "\n"
                        + "First Name: " + firstName + "\n"
                        + "Last Name: " + lastName + "\n"
                        + "Gender: " + gender + "\n"
                        + "Date of Birth: " + dateOfBirth + "\n"
                        + "Hire Date: " + hireDate + "\n"
                        + "Job Title: " + jobTitle + "\n"
                        + "Salary: " + salary + "\n"
                        + "Email: " + email + "\n"
                        + "Phone Number: " + phoneNumber;
                forDeletionTextArea.setText(output);
            } else {
                // Display a message dialog if employee not found
                JOptionPane.showMessageDialog(null, "Employee not found.", "Error", JOptionPane.ERROR_MESSAGE);
                forDeletionTextArea.setText(""); // Clear the text area
            }
            close();
        } catch (NumberFormatException e) {
            // Display a message dialog for invalid employee ID format
            JOptionPane.showMessageDialog(null, "Invalid Employee ID format. Please enter a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
            forDeletionTextArea.setText(""); // Clear the text area
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to delete an employee from the database by employee_id
    public static void deleteEmployee(int employeeId) throws SQLException {
        try {
            connect();
            String query = "DELETE FROM employees WHERE employee_id = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, employeeId);
            int rowsDeleted = preparedStatement.executeUpdate();
            close();

            if (rowsDeleted > 0) {
                // Show success message dialog if employee is deleted
                JOptionPane.showMessageDialog(null, "Employee deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Show error message dialog if employee is not found
                JOptionPane.showMessageDialog(null, "Employee not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            // Show error message dialog for SQL exception
            JOptionPane.showMessageDialog(null, "Failed to delete employee.", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to retrieve the latest hired employee from the database
    public static Employee getLatestHiredEmployee() throws SQLException {
        connect();

        String query = "SELECT * FROM employees WHERE hire_date = (SELECT MAX(hire_date) FROM employees)";
        preparedStatement = connection.prepareStatement(query);
        resultSet = preparedStatement.executeQuery();

        Employee latestHiredEmployee = null;
        if (resultSet.next()) {
            latestHiredEmployee = new Employee(
                    resultSet.getInt("employee_id"),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("gender"),
                    resultSet.getDate("date_of_birth"),
                    resultSet.getDate("hire_date"),
                    resultSet.getString("job_title"),
                    resultSet.getBigDecimal("salary"),
                    resultSet.getString("email"),
                    resultSet.getString("phone_number")
            );
        }

        close();
        return latestHiredEmployee;
    }

    // Method to retrieve the total count of employees from the database
    public static int getTotalEmployeeCount() throws SQLException {
        connect();

        String query = "SELECT COUNT(*) AS total FROM employees";
        preparedStatement = connection.prepareStatement(query);
        resultSet = preparedStatement.executeQuery();

        int totalCount = 0;
        if (resultSet.next()) {
            totalCount = resultSet.getInt("total");
        }

        close();
        return totalCount;
    }
}
