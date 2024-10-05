/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jema;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author CODE
 */
public class Tables {
    public static void main(String[] args) {
        try {
            Connection Con = ConnectionProvider.getCon();
            Statement st = Con.createStatement();
//         st.executeUpdate("create  table teachers(teachers_pk int AUTO_INCREMENT primary key, Role Varchar(200),name Varchar(200),DOB Varchar(50),mobileNumber Varchar(50),email Varchar (200),password Varchar(50),username Varchar(200),class Varchar(200))");
//           st.executeUpdate("create  table students(students_pk int AUTO_INCREMENT primary key, studentName Varchar(200),fatherName Varchar(200),DOB Varchar(50), mobileNumber Varchar(50), motherName Varchar(200), class Varchar(200))");
//         st.executeUpdate("insert into teachers(Role,name,DOB,mobileNumber,email,password,username,class)values ('HeadMaster','Admin','30-11-2003','0241385701','shadrackappiah250@gmail.com','Admin','Shady','2')");
//          st.executeUpdate("Create table medicine(medicine_pk int AUTO_INCREMENT primary key,uniqueId varchar(200),name varchar(200),companyName varchar(200),quantity bigint,price bigint)");
//          st.executeUpdate("Create table bill(bill_pk int AUTO_INCREMENT primary key,billId varchar(200),billDate varchar(200),totalPaid bigint,generatedBy varchar(50))");
            st.executeUpdate("create  table results(results_pk int AUTO_INCREMENT primary key, StudentName Varchar(200),Class Varchar(200),Term Varchar(50),Position Varchar(50),Subject Varchar (200),Classscore Varchar(50),Examscore Varchar(200),Total Varchar(200))");


            JOptionPane.showMessageDialog(null, "Table Created Successfuly");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
