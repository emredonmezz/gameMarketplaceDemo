package Core;

import Entities.concretes.Customer;
import MernisService.QLOKPSPublicSoap;

import java.util.Locale;

public class MernisManagerAdapter implements IMernisService{
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        QLOKPSPublicSoap publicSoap = new QLOKPSPublicSoap();
        try {
            return publicSoap.TCKimlikNoDogrula((Long.valueOf(customer.nationalityId)),
            customer.firstName.toUpperCase(Locale.ROOT),customer.lastName.toUpperCase(Locale.ROOT),
            customer.dateOfBirth.getYear());
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
