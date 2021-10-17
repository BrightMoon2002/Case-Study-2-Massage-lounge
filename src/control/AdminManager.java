package control;

import login.Admin;

import java.io.IOException;
import java.util.List;

public class AdminManager implements IGeneralManager<Admin> {
    private List<Admin> adminList;
    private

    @Override
    public List<Admin> findAll() {
        return null;
    }

    @Override
    public void saveList(Admin admin) throws IOException {

    }

    @Override
    public void removeByIndex(int index) throws IOException {

    }

    @Override
    public void updateByIndex(int index, Admin admin) throws IOException {

    }

    @Override
    public Admin searchById(String id) {
        return null;
    }

    @Override
    public Admin searchByName(String name) {
        return null;
    }

    @Override
    public void showAllList() {

    }


}
