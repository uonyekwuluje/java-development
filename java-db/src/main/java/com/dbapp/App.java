package com.dbapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/studentdb?useSSL=false";
        String user = "ucheonyekwuluje";
        String password = "mysqlpassword";

        Connection conn = DriverManager.getConnection(url, user, password);
        if (conn != null) {
             System.out.println("Database Connected successfully");
        } else {
            System.out.println("Database Connection failed");
        }

        // Display Database
        String display_student = "SELECT * FROM student_attendance_tbl";
        PreparedStatement pst = conn.prepareStatement(display_student);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
           System.out.print(rs.getString(1));
           System.out.print(": ");
           System.out.print(rs.getString(2));
           System.out.print(": ");
           System.out.print(rs.getString(3));
           System.out.print(": ");
           System.out.println(rs.getString(4));
       }
    
       // Insert data into MySQL Database
       /*
       String insert_query = "INSERT INTO student_attendance_tbl (student_regnum, student_fname, student_lname, student_grade)"
        + "values (?, ?, ?, ?)";
       PreparedStatement preparedStmt = conn.prepareStatement(insert_query);
       preparedStmt.setString (1, "stud-avng-001");
       preparedStmt.setString (2, "Tony");
       preparedStmt.setString (3, "Stark");
       preparedStmt.setString (4, "Fifth Grade");
       preparedStmt.execute();*/


       // Update data into MySQL Database
       /*
       String grade = "Nineth Grade";
       String ureg_num = "stud-avng-004";
       String update_query = "UPDATE student_attendance_tbl SET student_grade = '"+grade+"' WHERE student_regnum = '"+ureg_num+"'";
       PreparedStatement preparedStmt = conn.prepareStatement(update_query);
       preparedStmt.execute();*/

       // Delete data into MySQL Database 
       /* 
       String reg_num = "stud-avng-001";
       String delete_query = "DELETE FROM student_attendance_tbl WHERE student_regnum = '"+reg_num+"'";
       PreparedStatement preparedStmt = conn.prepareStatement(delete_query);
       preparedStmt.execute();*/
    }
}

