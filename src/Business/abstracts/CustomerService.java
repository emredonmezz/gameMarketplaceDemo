package Business.abstracts;

import Entities.concretes.Customer;
import Entities.concretes.Game;

import java.util.List;

public interface CustomerService {
    void add(Customer customer) throws Exception;
    void delete(Customer customer);
    void update(Customer customer);
}
