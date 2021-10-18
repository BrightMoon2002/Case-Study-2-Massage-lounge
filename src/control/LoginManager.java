package control;

import login.User;
import storage.FileManagerLogin;

import java.util.List;

public class LoginManager {
    private List<User> userList;
    private FileManagerLogin fileManagerLogin;

    public LoginManager() {
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public FileManagerLogin getFileManagerLogin() {
        return fileManagerLogin;
    }

    public void setFileManagerLogin(FileManagerLogin fileManagerLogin) {
        this.fileManagerLogin = fileManagerLogin;
    }

    public void saveUser(User user) {
        userList.set(0, user);
        fileManagerLogin.writeList(userList);
    }
}
