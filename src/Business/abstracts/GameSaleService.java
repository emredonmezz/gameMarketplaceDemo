package Business.abstracts;

import Entities.concretes.Campaign;
import Entities.concretes.Game;
import Entities.concretes.Customer;

public interface GameSaleService {
    void purchase(Game game, Customer customer, Campaign campaign);
    void refund(Game game,Customer customer, Campaign campaign);

}
