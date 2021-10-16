package control;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager implements IGeneralManager<Customer> {
    private List<Customer> customerList = new ArrayList<>();

    @Override
    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public void saveList(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void removeByIndex(int index) {
        customerList.remove(index);
    }

    @Override
    public void updateByIndex(int index, Customer customer) {
        customerList.set(index, customer);
    }

    @Override
    public Customer searchById(String id) {
        Customer customer = null;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equalsIgnoreCase(id)) {
                customer = customerList.get(i);
                break;
            }
        }

        return customer;
    }

    @Override
    public Customer searchByName(String name) {
        Customer customer = null;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getFullName().equalsIgnoreCase(name)) {
                customer = customerList.get(i);
                break;
            }
        }

        return customer;
    }

    @Override
    public void showAllList() {
        for (Customer c: customerList
             ) {
            System.out.println(c);
        }
    }
}
