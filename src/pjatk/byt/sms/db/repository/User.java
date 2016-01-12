
package pjatk.byt.sms.db.repository;


public class User {
    private Long userID;
    private String user;
    private String name;
    private String role;
    private Boolean loginFlag;
    private String password;

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public void setLoginFlag(boolean loginFlag) {
        this.loginFlag = loginFlag;
    }
    
    public Boolean getLoginFLag() {
        return loginFlag;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
    
}
