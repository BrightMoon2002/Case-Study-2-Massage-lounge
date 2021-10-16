package control;

import model.Bill;

import java.util.ArrayList;
import java.util.List;

public class BillManager implements IGeneralManager<Bill> {
private List<Bill> billList = new ArrayList<>();

    @Override
    public List<Bill> findAll() {
        return billList;
    }

    @Override
    public void saveList(Bill bill) {
        billList.add(bill);
    }

    @Override
    public void removeByIndex(int index) {
        billList.remove(index);
    }

    @Override
    public void updateByIndex(int index, Bill bill) {
        billList.set(index, bill);
    }

    @Override
    public Bill searchById(String id) {
        Bill bill = null;
        for (int i = 0; i < billList.size(); i++) {
            if (billList.get(i).getCode().equalsIgnoreCase(id)) {
                bill = billList.get(i);
                break;
            }
        }
        return bill;
    }

    @Override
    public Bill searchByName(String name) {
        Bill bill = null;
        for (int i = billList.size() -1; i >= 0; i--) {
            if (billList.get(i).getCustomer().getFullName().equalsIgnoreCase(name)) {
                bill = billList.get(i);
                break;
            }
        }
        return bill;
    }

    @Override
    public void showAllList() {
        for (Bill bill: billList
             ) {
            System.out.println(bill);
        }
    }
}
