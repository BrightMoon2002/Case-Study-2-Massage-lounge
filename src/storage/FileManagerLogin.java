package storage;

import login.User;
import model.room.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class FileManagerLogin extends BaseFileManager<User>{
    private static FileManagerLogin fileManagerLogin;
    private FileManagerLogin() {}
    public static FileManagerLogin getInstance() {
        if (fileManagerLogin== null) {
            fileManagerLogin = new FileManagerLogin();
        }
        return fileManagerLogin;
    }


    @Override
    public void writeList(List<User> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        File file = new File("listLogin.txt");
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
        List<User> loginList = new ArrayList<>();
        File file = new File("listLogin.txt");
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
            loginList = (List<User>) ois.readObject();
            ois.close();
            is.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return loginList;
    }
}
