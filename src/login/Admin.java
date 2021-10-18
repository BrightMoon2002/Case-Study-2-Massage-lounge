package login;

import java.io.Serializable;

public class Admin extends User implements Serializable {


    public Admin() {
    }

    public Admin(String username, String password, String id) {
        super(username, password, id);
    }


    @Override
    public String toString() {
        return "Admin{} " + super.toString();
    }
}
