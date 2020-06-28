/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_mysql_query;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;

/**
 *
 * @author Alex
 */
public class Ex2 {
    static void printTable(ResultSet rs) throws SQLException {
        ResultSetMetaData md = rs.getMetaData();
        //распечатка всех столбцов и всех строк
        int n = md.getColumnCount();
        while(rs.next()) {
            System.out.println();
            for(int i=1; i<=n; i++) {
                System.out.print(rs.getString(i) + " ");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/city?useSSL=false", "root", "");
            //Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //ResultSet rs = st.executeQuery("SELECT * FROM users");
            PreparedStatement st = conn.prepareStatement("SELECT * FROM users WHERE id=?");
            st.setInt(1, 22);
            ResultSet rs = st.executeQuery();
            printTable(rs);
            rs.first();
//            printTable(rs);
            //изменение записи
//            rs.updateString(2, "vasya2");
//            rs.updateRow();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ex2.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null && ! conn.isClosed()) {
                conn.close();
            }
        }
    }
    
}
