package Model;






public class Account {
    private String username;
    private String password;
    private String isAdmin;

    public Account(){
    
    }
    
    public Account(String username, String password, String isAdmin) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" + "username=" + username + ", password=" + password + ", isAdmin=" + isAdmin + '}';
    }

   
    
    
}
