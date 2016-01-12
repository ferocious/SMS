
package pjatk.byt.sms.authentication;

import pjatk.byt.sms.db.repository.User;

/*
Klasa pomocnicza, przechowuje dane zalogowanegho użytkownika.
*/
public class AuthenticationManager {
    
    private static User user;

    public static User getUser() {
        return user;
    }

    public static void setUser(User user) {
        AuthenticationManager.user = user;
    }
    
}
