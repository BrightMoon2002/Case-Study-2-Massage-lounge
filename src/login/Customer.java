package login;

import java.io.Serializable;

public class Customer extends User implements Serializable {
    private String fullName;
    private String mobile;

    public Customer() {
    }

    public Customer(String username, String password, String id, String fullName, String mobile) {
        super(password, username, id);
        this.fullName = fullName;
        this.mobile = mobile;
    }




    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
