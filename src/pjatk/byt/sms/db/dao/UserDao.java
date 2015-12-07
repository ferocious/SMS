
package pjatk.byt.sms.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import pjatk.byt.sms.db.DBManager;
import pjatk.byt.sms.db.model.User;


public class UserDao {
    
    private static final String FIND_USER_BY_USER_AND_PASSWORD = 
            "SELECT USER_ID, NAME, ROLE, USER FROM USERS WHERE USER = ?";
    
    public User findByUserAndPassword(String user, String password) {
        Connection connection = null;
        try {
            connection = DBManager.getInstance().getConnection();
            
            PreparedStatement statement = connection.prepareStatement(
                    FIND_USER_BY_USER_AND_PASSWORD);
            
            statement.setString(1, user);
            
            ResultSet result = statement.executeQuery();
            
            if (result.next()) {
                User u = new User();
                u.setUserID(result.getLong("USER_ID"));
                u.setName(result.getString("NAME"));
                u.setRole(result.getString("ROLE"));
                u.setUser(result.getString("USER"));
                
                return u;
            }
            
            
        } catch (SQLException e) {
            System.out.println("Nieudana próba wywołania zapytania SQL.");
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.out.println("Nie udało się zakończyć połączenia.");
                }
            }
        }
        
        return null;
    }
}
