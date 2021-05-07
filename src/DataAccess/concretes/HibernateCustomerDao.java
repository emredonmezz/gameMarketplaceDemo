package DataAccess.concretes;

import DataAccess.abstracts.CustomerDao;
import Entities.concretes.Customer;

import java.util.List;

public class HibernateCustomerDao implements CustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println("Campaign has been added : " + customer.getFirstName());
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Campaign has been deleted : " + customer.getFirstName());
    }

    @Override
    public void update(Customer customer) {
        System.out.println("Campaign has been updated : " + customer.getFirstName());
    }

    @Override
    public Customer get(int id) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }
}
