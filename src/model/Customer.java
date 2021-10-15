package model;

public class Customer {
    private String fullName;
    private String id;
    private String mobile;

    public Customer() {
    }

    public Customer(String fullName, String id, String mobile) {
        this.fullName = fullName;
        this.id = id;
        this.mobile = mobile;
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

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", id='" + id + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
