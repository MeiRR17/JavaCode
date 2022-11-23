package src.librarySystem;

public class User extends Library{
        private String fullName;
        private String username;
        private String password;

    public User(String name, String um, String pass){
        fullName = name;
        username = um;
        password = pass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
