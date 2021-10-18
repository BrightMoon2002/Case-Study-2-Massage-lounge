package control;

import login.User;
import storage.FileManagerUser;

import java.util.List;

public class UserManager implements IGeneralManager<User>{

    private List<User> userList;
    private FileManagerUser fileManagerUser;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public FileManagerUser getFileManagerUser() {
        return fileManagerUser;
    }

    public void setFileManagerUser(FileManagerUser fileManagerUser) {
        this.fileManagerUser = fileManagerUser;
    }

    @Override
    public List<User> findAll() {
        return userList;
    }

    @Override
    public void saveList(User user) {
        userList.add(user);
        fileManagerUser.writeList(userList);

    }

    @Override
    public void removeByIndex(int index) {
        userList.remove(index);
        fileManagerUser.writeList(userList);
    }

    @Override
    public void updateByIndex(int index, User user) {
        userList.set(index, user);
        fileManagerUser.writeList(userList);
    }

    @Override
    public User searchById(String id) {
        User user = null;
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId().equals(id)) {
                user = userList.get(i);
                break;
            }
        }
        return user;
    }

    @Override
    public User searchByName(String name) {
        User user = null;
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUsername().equals(name)) {
                user = userList.get(i);
                break;
            }
        }
        return user;
    }

    @Override
    public void showAllList() {
        for (User user : userList
        ) {
            System.out.println(user);
        }
    }
}
