package Core;

import Entities.concretes.Customer;

public interface IMernisService {
    boolean checkIfRealPerson(Customer customer);
}
