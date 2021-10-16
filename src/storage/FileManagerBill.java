package storage;

import model.Bill;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManagerBill extends BaseFileManager<Bill>{
    private static FileManagerBill fileManagerBill;
private FileManagerBill() {}
    public static FileManagerBill getInstance() {
    if (fileManagerBill == null) {
        fileManagerBill = new FileManagerBill();
    }
    return fileManagerBill;
    }

    @Override
    public void writeList(List<Bill> list) {

        if (list == null) {
            list = new ArrayList<>();
        }
        File file = new File("BillList.txt");
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream ois = new ObjectOutputStream(os);
            ois.writeObject(list);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Bill> readList() {
        List<Bill> billList = null;
        File file = new File("BillList.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (file.length() == 0) {
            return billList;
        }
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            billList = (List<Bill>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return billList;
    }
}
