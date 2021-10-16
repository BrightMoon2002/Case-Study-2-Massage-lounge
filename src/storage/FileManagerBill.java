package storage;

import model.Bill;

import java.util.List;

public class FileManagerBill extends BaseFileManager<Bill>{
    @Override
    void writeList(List<Bill> list) {

    }

    @Override
    List<Bill> readList() {
        return null;
    }
}
