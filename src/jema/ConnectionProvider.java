/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jema;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author CODE
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/methodist_admission?useSSL=TRUE","root","");
            return Con;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
