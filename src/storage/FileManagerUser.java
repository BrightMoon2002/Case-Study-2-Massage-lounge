package storage;

import login.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManagerUser extends BaseFileManager<User> {

    private static FileManagerUser fileManagerUser;
    private FileManagerUser() {}
    public static FileManagerUser getInstance() {
        if (fileManagerUser == null) {
            fileManagerUser = new FileManagerUser();
        }
        return fileManagerUser;
    }
    @Override
   public void writeList(List<User> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        File file = new File("listUser.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
   public List<User> readList() {
        List<User> userList = new ArrayList<>();
        File file = new File("listUser.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (file.length() == 0) {
            return new ArrayList<>();
        }
        try {
            FileInputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            userList = (List<User>) ois.readObject();
            ois.close();
            is.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return userList;
    }
}
