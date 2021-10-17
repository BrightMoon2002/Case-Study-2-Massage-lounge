package login;

import java.io.Serializable;

public class Customer implements Serializable {
    private String fullName;
    private String id;
    private String mobile;
    private String password;

    public Customer() {
    }

    public Customer(String fullName, String id, String mobile) {
        this.fullName = fullName;
        this.id = id;
        this.mobile = mobile;
    }

    public Customer(String fullName, String id, String mobile, String password) {
        this.fullName = fullName;
        this.id = id;
        this.mobile = mobile;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public void searchCustomerById(String id) {
        Customer customer = null;

    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", id='" + id + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
