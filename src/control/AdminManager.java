package control;

import login.Admin;
import storage.FileManagerAdmin;

import java.io.IOException;
import java.util.List;

public class AdminManager implements IGeneralManager<Admin> {
    private List<Admin> adminList;
    private FileManagerAdmin fileManagerAdmin;

    public List<Admin> getAdminList() {
        return adminList;
    }

    public void setAdminList(List<Admin> adminList) {
        this.adminList = adminList;
    }

    public FileManagerAdmin getFileManagerAdmin() {
        return fileManagerAdmin;
    }

    public void setFileManagerAdmin(FileManagerAdmin fileManagerAdmin) {
        this.fileManagerAdmin = fileManagerAdmin;
    }

    @Override
    public List<Admin> findAll() {
        return adminList;
    }

    @Override
    public void saveList(Admin admin) {
        adminList.add(admin);
        fileManagerAdmin.writeList(adminList);
    }

    @Override
    public void removeByIndex(int index)  {
        adminList.remove(index);
        fileManagerAdmin.writeList(adminList);
    }

    @Override
    public void updateByIndex(int index, Admin admin) {
        adminList.set(index, admin);
        fileManagerAdmin.writeList(adminList);
    }

    @Override
    public Admin searchById(String id) {
        Admin admin = null;
        for (int i = 0; i < adminList.size(); i++) {
            if (adminList.get(i).getId().equalsIgnoreCase(id)) {
                admin = adminList.get(i);
                break;
            }
        }
        return admin;
    }

    @Override
    public Admin searchByName(String name) {
        Admin admin = null;
        for (int i = 0; i < adminList.size(); i++) {
            if (adminList.get(i).getId().equalsIgnoreCase(name)) {
                admin = adminList.get(i);
                break;
            }
        }
        return admin;
    }

    @Override
    public void showAllList() {
        for (Admin admin: adminList
             ) {
            System.out.println(admin);
        }
    }


}
