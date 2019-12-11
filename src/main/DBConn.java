/*
 * Copyright (c) Cocacola Kwanza limited. All rights reserved.
 * Technologies  * 
 * Language - JAVA  * 
 * Database - MySQL  * 
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author wickr
 */
public class DBConn {

    public static Connection myConn() {
        /*
        *
        * define the db url (test_database is the database which is going to be connected)
        * define the db user name
        * define the db user password
        * declare the connection string and define it as null so you can define the correct value later 
        *
         */
//        String databaseURL = "jdbc:mysql://localhost:3306/red_db";
//        String user = "root";
//        String password = "";
//String databaseURL = "jdbc:mysql://remotemysql.com/tgTI7MFQCi";
//        String user = "tgTI7MFQCi";
//        String password = "oXdMgUf7YU";
String databaseURL = "jdbc:mysql://mysql5015.site4now.net/db_a50947_cdc";
        String user = "a50947_cdc";
        String password = "ramantila65";



        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(databaseURL, user, password);
            if (conn != null) {
                //System.out.println("Connected to the database");
                return conn;
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Could not find database driver class");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        } 
//        finally {
//            if (conn != null) {
//                try {
//                    conn.close();
//                } catch (SQLException ex) {
//                    ex.printStackTrace();
//                }
//            }
//        }
        return null;
    }
}
