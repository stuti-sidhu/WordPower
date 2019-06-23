package datalayer;

import java.sql.*;

public abstract class DBOperations {

    protected Connection con = null;

    protected void makeConnection() {
        try {
            if (con == null) {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/WordPowerDB","root","");
            }
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
}
