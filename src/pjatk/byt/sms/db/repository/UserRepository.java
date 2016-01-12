
package pjatk.byt.sms.db.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pjatk.byt.sms.db.DBManager;

//
public class UserRepository {
    
    private static final String FIND_USER_BY_USER_AND_PASSWORD = 
            "SELECT USER_ID, NAME, ROLE, USER, LOGIN_FLAG, PASSWORD "
            + "FROM USERS WHERE USER = ? AND PASSWORD = ?";
    
    private static final String UPDATE_PASSWORD = 
            "UPDATE USERS SET PASSWORD = ?, LOGIN_FLAG = 1 WHERE USER_ID = ? ";
    
    
  //metoda wyszukuje w bazie żytkownika po User i Password oraz zwraca go
    public User findByUserAndPassword(String user, String password) {
        Connection connection = null;
        try {
            connection = DBManager.getInstance().getConnection();
            
            PreparedStatement statement = connection.prepareStatement(
                    FIND_USER_BY_USER_AND_PASSWORD);
            
            statement.setString(1, user);
            statement.setString(2, password);
            
            ResultSet result = statement.executeQuery();
            
            if (result.next()) {
                User u = new User();
                u.setUserID(result.getLong("USER_ID"));
                u.setName(result.getString("NAME"));
                u.setRole(result.getString("ROLE"));
                u.setUser(result.getString("USER"));
                u.setLoginFlag(result.getBoolean("LOGIN_FLAG"));
                u.setPassword(result.getString("PASSWORD"));
                
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
    
    //metoda, która update'uje haslo uzytkownika zmienione po pierwszym zalogowaniu
    public void updatePassword(Long userId, String password) {
        Connection connection = null;
        try {
            connection = DBManager.getInstance().getConnection();
            
            PreparedStatement statement = connection.prepareStatement(
                    UPDATE_PASSWORD);
            
            statement.setString(1, password);
            statement.setLong(2, userId);
            
            int updatedCount = statement.executeUpdate();
            System.out.println("Zaktualizowano rekordow: " + updatedCount);
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
        
    }
}
