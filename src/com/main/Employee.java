package com.main;

import java.math.BigDecimal;
import java.sql.Date;

public class Employee {

    private int employeeId;
    private String firstName;
    private String lastName;
    private String gender;
    private Date dateOfBirth;
    private Date hireDate;
    private String jobTitle;
    private BigDecimal salary;
    private String email;
    private String phoneNumber;

    // Constructors
    public Employee() {
    }

    public Employee(String firstName, String lastName, String gender, Date dateOfBirth, Date hireDate, String jobTitle, BigDecimal salary, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.hireDate = hireDate;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Employee(int employeeId, String firstName, String lastName, String gender, Date dateOfBirth, Date hireDate, String jobTitle, BigDecimal salary, String email, String phoneNumber) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.hireDate = hireDate;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Override toString method for debugging purposes
    @Override
    public String toString() {
        return "Employee{"
                + "employeeId=" + employeeId
                + ", firstName='" + firstName + '\''
                + ", lastName='" + lastName + '\''
                + ", gender='" + gender + '\''
                + ", dateOfBirth=" + dateOfBirth
                + ", hireDate=" + hireDate
                + ", jobTitle='" + jobTitle + '\''
                + ", salary=" + salary
                + ", email='" + email + '\''
                + ", phoneNumber='" + phoneNumber + '\''
                + '}';
    }
}
