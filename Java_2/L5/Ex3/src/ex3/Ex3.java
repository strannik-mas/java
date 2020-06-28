/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.io.*;
import java.sql.*;
import javax.swing.*;
//
//  create  TABLE  pictures (
//          id      nchar(10)       not null,
//          name    varchar(MAX)    not null,
//          photo   image           not null );
//
public class Ex3 extends JFrame {
    
static Connection conn = null;
    
public static void processIN(String id, String binaryFileName)
                                                throws Exception {
  File file = null;
  InputStream fin = null;
  PreparedStatement ps = null;

  try {
      file = new File (binaryFileName);
      fin  = new FileInputStream(file);
      int len = fin.available();

      ps=conn.prepareStatement
              ("INSERT INTO pictures (id,photo) VALUES (?,?)");
      ps.setString(1, id);
       ps.setString(2, binaryFileName);
//      ps.setBinaryStream(2, fin, len);

      ps.executeUpdate();
    }
    finally {
      if (fin!=null)  fin.close();
      if (ps !=null)  ps.close();
    }
}   
public static InputStream processOUT(String id)    throws SQLException {
    Statement stmt = null;
    ResultSet rs = null;
    InputStream in = null;

    try {
        stmt = conn.createStatement();
        rs = stmt.executeQuery
                ("SELECT * from pictures where id= '" +id+ "'");

        while (rs.next()) {
          System.out.println(rs.getString(1));
          in = rs.getBinaryStream(2);
        }
    }
    finally {
        if (stmt!=null)  stmt.close();
        if (rs != null)    rs.close();
    }
    return in;
}

public Ex3() throws SQLException {
      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setSize(500, 400);
      
      this.getContentPane().add(new MyComponent(processOUT("1")));
}
public static void main(String [] args) {
    try {

        Class.forName("com.mysql.jdbc.Driver");

        conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/city?useSSL=false", "root", "");

      //processIN("1","d:\\фото\\avatar_3.png");
      //processOUT("1");
      
        new Ex3().setVisible(true);

        conn.close();
    }
    catch (Exception e) {
        System.err.println("Exception1: "+e.getMessage());
    }
  }
}