package com.frames;

import com.main.Employee;
import com.main.EmployeeDAO;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() throws SQLException {
        initComponents();
        populateTable();
        retrieveLatestAddedEmployee(latestHiredEmployeeTextArea);
        totalEmployeeCountLabel.setText(EmployeeDAO.getTotalEmployeeCount() + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        latestHiredEmployeeTextArea = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        totalEmployeeCountLabel = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        addNewRecordButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        genderField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dateOfBirthField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hiredDateField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jobTitleField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        salaryField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        employeeScrollPane = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        firstNameField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lastNameField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        genderField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dateOfBirthField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        hiredDateField1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jobTitleField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        salaryField1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        emailField1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        phoneNumberField1 = new javax.swing.JTextField();
        updateRecordButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        forDeletionTextArea = new javax.swing.JTextArea();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("School Employee Management System - Main Frame");

        rootPanel.setBackground(new java.awt.Color(204, 255, 204));

        latestHiredEmployeeTextArea.setColumns(20);
        latestHiredEmployeeTextArea.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        latestHiredEmployeeTextArea.setRows(5);
        latestHiredEmployeeTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        latestHiredEmployeeTextArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        latestHiredEmployeeTextArea.setEnabled(false);
        jScrollPane2.setViewportView(latestHiredEmployeeTextArea);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setText("Total Employee/s");

        totalEmployeeCountLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        totalEmployeeCountLabel.setText("0");

        jLabel21.setText("Latest Hired Employee");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(70, 70, 70))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(totalEmployeeCountLabel)
                                .addGap(144, 144, 144))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalEmployeeCountLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("  Dash Board  ", jPanel1);

        addNewRecordButton.setText("Add New Record");
        addNewRecordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addNewRecordButtonMouseClicked(evt);
            }
        });

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("Gender");

        jLabel4.setText("Date Of Birth");

        dateOfBirthField.setToolTipText("yyyy-mm-dd");

        jLabel5.setText("Hired Date");

        hiredDateField.setToolTipText("yyyy-mm-dd");

        jLabel6.setText("Job Title");

        jLabel7.setText("Salary");

        jLabel8.setText("Email");

        jLabel9.setText("Phone Number");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addNewRecordButton)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addGap(25, 25, 25)
                            .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(29, 29, 29)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(29, 29, 29)
                            .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(29, 29, 29)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jobTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hiredDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dateOfBirthField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(374, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dateOfBirthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(hiredDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jobTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addNewRecordButton)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("   Create New   ", jPanel2);

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Employee ID", "First Name", "Last Name", "Job Title"
            }
        ));
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        employeeScrollPane.setViewportView(employeeTable);

        jLabel10.setText("First Name");

        jLabel11.setText("Last Name");

        jLabel12.setText("Gender");

        jLabel13.setText("Date Of Birth");

        dateOfBirthField1.setToolTipText("yyyy-mm-dd");

        jLabel14.setText("Hired Date");

        hiredDateField1.setToolTipText("yyyy-mm-dd");

        jLabel15.setText("Job Title");

        jLabel16.setText("Salary");

        jLabel17.setText("Email");

        jLabel18.setText("Phone Number");

        updateRecordButton.setText("Update Record");
        updateRecordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateRecordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateRecordButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hiredDateField1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateOfBirthField1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lastNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(genderField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(emailField1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(salaryField1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jobTitleField1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateRecordButton)
                            .addComponent(phoneNumberField1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(firstNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(lastNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(genderField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(dateOfBirthField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jobTitleField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(salaryField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(emailField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(phoneNumberField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(hiredDateField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(updateRecordButton)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(employeeScrollPane))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(employeeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("   Modify   ", jPanel3);

        forDeletionTextArea.setColumns(20);
        forDeletionTextArea.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        forDeletionTextArea.setRows(5);
        forDeletionTextArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        forDeletionTextArea.setEnabled(false);
        jScrollPane1.setViewportView(forDeletionTextArea);

        searchField.setToolTipText("Search by Employee ID");

        searchButton.setText("Search");
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });

        deleteButton.setText("Delete Record");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 339, Short.MAX_VALUE)
                        .addComponent(deleteButton)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(deleteButton))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("   Remove   ", jPanel4);

        exitButton.setText("Exit");
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(logoutButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );

        getContentPane().add(rootPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addNewRecordButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewRecordButtonMouseClicked
        try {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String gender = genderField.getText();

            // Parse Date of Birth
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date dateOfBirth = null;
            try {
                dateOfBirth = new Date(dateFormat.parse(dateOfBirthField.getText()).getTime());
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Invalid date format for Date of Birth", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method if parsing fails
            }

            // Parse Hire Date
            Date hireDate = null;
            try {
                hireDate = new Date(dateFormat.parse(hiredDateField.getText()).getTime());
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Invalid date format for Hire Date", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method if parsing fails
            }

            String jobTitle = jobTitleField.getText();
            BigDecimal salary = new BigDecimal(salaryField.getText());
            String email = emailField.getText();
            String phoneNumber = phoneNumberField.getText();

            EmployeeDAO.insertEmployee(new Employee(firstName, lastName, gender, dateOfBirth, hireDate, jobTitle, salary, email, phoneNumber));

            populateTable();

            // Clear fields after updating a record
            clearAddFields();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid format for numeric fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addNewRecordButtonMouseClicked

    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked
        // Get the index of the selected row
        int rowIndex = employeeTable.getSelectedRow();
        if (rowIndex != -1) { // If a row is selected
            try {
                // Retrieve the employee ID from the first column (index 0) of the selected row
                int employeeId = (int) employeeTable.getValueAt(rowIndex, 0);

                // Retrieve the employee from the database using the employee ID
                Employee employee = EmployeeDAO.getEmployee(employeeId);

                // Display or use the retrieved employee object
                firstNameField1.setText(employee.getFirstName());
                lastNameField1.setText(employee.getLastName());
                genderField1.setText(employee.getGender());
                dateOfBirthField1.setText(employee.getDateOfBirth() + "");
                hiredDateField1.setText(employee.getHireDate() + "");
                jobTitleField1.setText(employee.getJobTitle());
                salaryField1.setText(employee.getSalary() + "");
                emailField1.setText(employee.getEmail());
                phoneNumberField1.setText(employee.getPhoneNumber());
            } catch (SQLException e) {
                // Handle database error
                System.out.println("Error: " + e.getMessage());
            }
        } else { // If no row is selected
            // Display a message dialog indicating that no row is selected
            JOptionPane.showMessageDialog(null, "Please select a row.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_employeeTableMouseClicked

    private void updateRecordButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateRecordButtonMouseClicked
        try {
            // Retrieve the employee ID from the selected row
            int rowIndex = employeeTable.getSelectedRow();
            if (rowIndex == -1) {
                JOptionPane.showMessageDialog(null, "Please select a row to update.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int employeeId = (int) employeeTable.getValueAt(rowIndex, 0);

            String firstName = firstNameField1.getText();
            String lastName = lastNameField1.getText();
            String gender = genderField1.getText();

            // Parse Date of Birth
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date dateOfBirth = null;
            try {
                dateOfBirth = new Date(dateFormat.parse(dateOfBirthField1.getText()).getTime());
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Invalid date format for Date of Birth", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method if parsing fails
            }

            // Parse Hire Date
            Date hireDate = null;
            try {
                hireDate = new Date(dateFormat.parse(hiredDateField1.getText()).getTime());
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Invalid date format for Hire Date", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method if parsing fails
            }

            String jobTitle = jobTitleField1.getText();
            BigDecimal salary = new BigDecimal(salaryField1.getText());
            String email = emailField1.getText();
            String phoneNumber = phoneNumberField1.getText();

            // Create an Employee object with updated information
            Employee updatedEmployee = new Employee(employeeId, firstName, lastName, gender, dateOfBirth, hireDate, jobTitle, salary, email, phoneNumber);

            // Update the employee in the database
            EmployeeDAO.updateEmployee(updatedEmployee);

            // Refresh the table after updating
            populateTable();

            // Clear fields after updating a record
            clearUpdateFields();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid format for numeric fields", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed to update employee information", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateRecordButtonMouseClicked

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        String id = searchField.getText();
        EmployeeDAO.searchEmployee(id, forDeletionTextArea);
    }//GEN-LAST:event_searchButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        try {
            // Extract the text from the text area
            String text = forDeletionTextArea.getText();

            // Find the index of "Employee ID: "
            int index = text.indexOf("Employee ID: ");

            if (index == -1) {
                JOptionPane.showMessageDialog(null, "Employee ID not found in text area.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Extract the substring after "Employee ID: "
            String idSubstring = text.substring(index + "Employee ID: ".length());

            // Trim any leading or trailing whitespace
            idSubstring = idSubstring.trim();

            // Find the index of the next newline character (to extract only the ID)
            int nextNewlineIndex = idSubstring.indexOf("\n");
            if (nextNewlineIndex != -1) {
                // If there's a newline character, truncate the string to get only the ID part
                idSubstring = idSubstring.substring(0, nextNewlineIndex);
            }

            // Parse the extracted ID to an integer
            int employeeId = Integer.parseInt(idSubstring);

            // Ask for confirmation before deletion
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete Employee ID: " + employeeId + "?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                // Call the deleteEmployee method with the extracted ID
                EmployeeDAO.deleteEmployee(employeeId);
            } else {
                // Do nothing if the user selects No
                return;
            }
        } catch (NumberFormatException e) {
            // Display a message dialog for invalid employee ID format
            JOptionPane.showMessageDialog(null, "Invalid Employee ID format. Please enter a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            // Display a message dialog for SQL exception
            JOptionPane.showMessageDialog(null, "Failed to delete employee.", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error: " + e.getMessage());
        }
        // Clear text areas after deletion
        forDeletionTextArea.setText("");
        searchField.setText("");
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        int confirmLogout = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Confirm Logout", JOptionPane.YES_NO_OPTION);

        if (confirmLogout == JOptionPane.YES_OPTION) {
            new Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        int confirmExit = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);

        if (confirmExit == JOptionPane.YES_OPTION) {
            System.exit(0); // Exit the application
        }
    }//GEN-LAST:event_exitButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewRecordButton;
    private javax.swing.JTextField dateOfBirthField;
    private javax.swing.JTextField dateOfBirthField1;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField emailField1;
    private javax.swing.JScrollPane employeeScrollPane;
    private javax.swing.JTable employeeTable;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JTextField firstNameField1;
    private javax.swing.JTextArea forDeletionTextArea;
    private javax.swing.JTextField genderField;
    private javax.swing.JTextField genderField1;
    private javax.swing.JTextField hiredDateField;
    private javax.swing.JTextField hiredDateField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jobTitleField;
    private javax.swing.JTextField jobTitleField1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextField lastNameField1;
    private javax.swing.JTextArea latestHiredEmployeeTextArea;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JTextField phoneNumberField1;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JTextField salaryField;
    private javax.swing.JTextField salaryField1;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel totalEmployeeCountLabel;
    private javax.swing.JButton updateRecordButton;
    // End of variables declaration//GEN-END:variables
    private void populateTable() {
        try {
            // Retrieve all employees from the database
            Employee[] employees = EmployeeDAO.getAllEmployees();

            // Create a DefaultTableModel with the specified column names and 0 rows
            DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();

            // Remove all existing rows from the table model
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }

            // Add each employee to the table model
            for (Employee employee : employees) {
                Object[] rowData = {employee.getEmployeeId(), employee.getFirstName(), employee.getLastName(), employee.getJobTitle()};
                model.addRow(rowData);
            }

            // Set the model to the employeeTable
            employeeTable.setModel(model);
        } catch (SQLException e) {
            // Handle database error
            System.out.println("Eror: " + e.getMessage());
        }
        System.out.println("Table Rendered.");
    }

    private void clearAddFields() {
        firstNameField.setText("");
        lastNameField.setText("");
        genderField.setText("");
        dateOfBirthField.setText("");
        hiredDateField.setText("");
        jobTitleField.setText("");
        salaryField.setText("");
        emailField.setText("");
        phoneNumberField.setText("");
    }

    private void clearUpdateFields() {
        firstNameField1.setText("");
        lastNameField1.setText("");
        genderField1.setText("");
        dateOfBirthField1.setText("");
        hiredDateField1.setText("");
        jobTitleField1.setText("");
        salaryField1.setText("");
        emailField1.setText("");
        phoneNumberField1.setText("");
    }

    private void retrieveLatestAddedEmployee(JTextArea textArea) {
        try {
            // Retrieve the latest hired employee
            Employee latestEmployee = EmployeeDAO.getLatestHiredEmployee();

            // Check if the latestEmployee is not null
            if (latestEmployee != null) {
                // Construct the employee details string
                String employeeDetails = "Employee ID: " + latestEmployee.getEmployeeId() + "\n"
                        + "First Name: " + latestEmployee.getFirstName() + "\n"
                        + "Last Name: " + latestEmployee.getLastName() + "\n"
                        + "Gender: " + latestEmployee.getGender() + "\n"
                        + "Date of Birth: " + latestEmployee.getDateOfBirth() + "\n"
                        + "Hire Date: " + latestEmployee.getHireDate() + "\n"
                        + "Job Title: " + latestEmployee.getJobTitle() + "\n"
                        + "Salary: " + latestEmployee.getSalary() + "\n"
                        + "Email: " + latestEmployee.getEmail() + "\n"
                        + "Phone Number: " + latestEmployee.getPhoneNumber();

                // Set the employee details string to the text area
                textArea.setText(employeeDetails);
            } else {
                // If no employee found, display a message
                textArea.setText("No employee found.");
            }
        } catch (SQLException e) {
            // Handle SQL exception
            textArea.setText("Error: " + e.getMessage());
        }
    }
}
