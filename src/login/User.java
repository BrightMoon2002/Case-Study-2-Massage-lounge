package login;

import java.io.Serializable;

public class User extends BaseUser implements Serializable {
    private String password;
    private String username;
    private String id;

    public User(String username, String password, String id) {
        this.password = password;
        this.username = username;
        this.id = id;
    }

    public User() {
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id =  id;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", id='" + id + '\'' +
                "} " + super.toString();
    }
}
