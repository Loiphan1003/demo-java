package Model;






public class Account {
    private String username;
    private String password;
    private String isAdmin;
    private String email;

    public Account(){
    
    }
    
    public Account(String username){
    
    }
    
    
    public Account(String username, String password, String isAdmin, String email) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Account{" + "username=" + username + ", password=" + password + ", isAdmin=" + isAdmin + ", email=" + email + '}';
    }
    
    
    
    
   

   
    
    
}
