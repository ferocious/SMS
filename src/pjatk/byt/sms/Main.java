
package pjatk.byt.sms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import pjatk.byt.sms.db.DBManager;
import pjatk.byt.sms.frame.LoginFrame;


public class Main {
    
    public static void main(String[] args) throws SQLException {
        Connection connection = DBManager.getInstance().getConnection();
        ResultSet result = connection.prepareStatement("select * from users").executeQuery();
        result.next();
        System.out.println("User: " + result.getString(2));
        
        System.out.println("No to działamy...");
        new LoginFrame().setVisible(true);
    }
}
