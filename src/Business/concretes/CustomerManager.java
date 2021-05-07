package Business.concretes;

import Business.abstracts.CustomerService;
import Core.IMernisService;
import Entities.concretes.Customer;

public class CustomerManager implements CustomerService{
    private IMernisService mernisService;

    public CustomerManager (IMernisService mernisService){
        this.mernisService= mernisService;
    }

    @Override
    public void add(Customer customer) {
        if (this.mernisService.checkIfRealPerson(customer)) {
            System.out.println(" Customer has been added to the database  : "
                    + customer.getFirstName() + " " + customer.getLastName());
            return;
        }else{
            System.out.println("Given information is not valid");
        }
    }

    @Override
    public void delete(Customer customer) {

    }

    @Override
    public void update(Customer customer) {

    }
}
