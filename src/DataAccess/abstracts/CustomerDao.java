package DataAccess.abstracts;

import Entities.concretes.Customer;

import java.util.List;

public interface CustomerDao {
    void add(Customer customer);
    void delete(Customer customer);
    void update(Customer customer);
    Customer get(int id);
    List<Customer> getAll();
}
