package pjatk.byt.sms.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBManager {

    private static DBManager instance;

    private DBManager() {
        try {
            // rejestruje sterownik mysql
           

            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            System.out.println("Unable to register driver");
            ex.printStackTrace();
        }
    }

    public static DBManager getInstance() {
        if (instance == null) {
            instance = new DBManager();
        }
        return instance;
    }

    //metoda zwracajaca połączenie do bazy danych
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/sys?"
                    + "user=root&password=root123");
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return null;
    }
}
