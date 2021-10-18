package control;

import login.User;
import storage.FileManagerLogin;

public class LoginManager {
    private User user;
    private FileManagerLogin fileManagerLogin;

    public LoginManager() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public FileManagerLogin getFileManagerLogin() {
        return fileManagerLogin;
    }

    public void setFileManagerLogin(FileManagerLogin fileManagerLogin) {
        this.fileManagerLogin = fileManagerLogin;
    }
}
