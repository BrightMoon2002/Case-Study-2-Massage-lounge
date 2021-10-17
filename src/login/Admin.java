package login;

import java.io.Serializable;

public class Admin implements Serializable {
    private String username;
    private String id;
    private String password;

    public Admin() {
    }

    public Admin(String username, String id, String password) {
        this.username = username;
        this.id = id;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "username='" + username + '\'' +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
