/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.*;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Alex
 */
public class Ex1 {
    
    static Context getFileSystemContext(String directoryName)
                                            throws javax.naming.NamingException {
        //
        // Set up environment for creating initial context
        //
        Hashtable env = new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY,
                "com.sun.jndi.fscontext.RefFSContextFactory");
        env.put(Context.PROVIDER_URL, "file:" + directoryName);
        Context context = new InitialContext(env);
        return context;
    }
    
    static void showDrivers() {
        Driver dr = null;
        Enumeration<Driver> en = DriverManager.getDrivers();
        while(en.hasMoreElements()){
            dr = en.nextElement();
            System.out.println(dr.toString() + " " + dr.jdbcCompliant());
        }            
    }
    
    static void registerDataSource(
            String regName,
            String vendor,
            String user,
            String password,
            String databaseName,
            String driverType,
            String networkProtocol,
            int portNumber,
            String serverName
    )throws SQLException, NamingException {
      
        if (vendor.equals("mysql")) {
            // create mysql's DataSource
            MysqlDataSource ds = new MysqlDataSource();
            ds.setUser(user);
            ds.setPassword(password);
            ds.setDatabaseName(databaseName);
            ds.setServerName(serverName);
            ds.setPortNumber(portNumber);
            Context ctx = getFileSystemContext("C:\\");
            ctx.bind(regName, ds);
        }
        else if (vendor.equals("mssql")) {
            // create MSSQL's DataSource
            SQLServerDataSource ds = new SQLServerDataSource();
            ds.setUser(user);
            ds.setPassword(password);
            ds.setDatabaseName(databaseName);
            ds.setServerName(serverName);
            ds.setPortNumber(portNumber);
            Context ctx = getFileSystemContext("C:\\");
            ctx.bind(regName, ds);
        }
        else {    
        
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        try{
             Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
             System.out.println("Connection succesfull!");
         }
         catch(Exception ex){
             System.out.println("Connection failed...");
              
             System.out.println(ex);
         }

        showDrivers();
        
        try {
            //registerDataSource("jdbc/AW", "mysql", "root", "", "city", "", "", 3306, "127.0.0.1");
            //Connection conn = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433", "sa", "1234");
            //Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/city?useSSL=false", "root", "");
            
            Context context = getFileSystemContext("C:\\");
            MysqlDataSource myDS = (MysqlDataSource) context.lookup("jdbc/AW");
            Connection con  = myDS.getConnection();
            
            System.out.println(con.getCatalog());

            DatabaseMetaData meta = con.getMetaData();
            System.out.println("Driver name: "
              + meta.getDriverName());
            System.out.println("Driver version: "
              + meta.getDriverVersion());
            System.out.println("Server name: "
              + meta.getDatabaseProductName());
            System.out.println("Server version: "
              + meta.getDatabaseProductVersion());
            System.out.println("Connection URL: "
              + meta.getURL());
            System.out.println("Login name: "
              + meta.getUserName());
            
            ResultSet rs = meta.getTables("city", null, null, new String[]{"TABLE"});
            while(rs.next()) {
                System.out.println(rs.getString("TABLE_NAME"));
            }
            /*
            con.setCatalog("geoip");
            
            SQLWarning sw = con.getWarnings();
            if (sw != null) {
                for(Throwable i : sw)
                    System.out.println(i.getMessage());
            }
            System.out.println(con.getCatalog());
*/

            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ex1.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
