package Business.concretes;

import Business.abstracts.GameSaleService;
import DataAccess.concretes.HibernateCampaignDao;
import DataAccess.concretes.HibernateCustomerDao;
import DataAccess.concretes.HibernateGameDao;
import Entities.concretes.Campaign;
import Entities.concretes.Game;
import Entities.concretes.Customer;

public class GameSaleManager implements GameSaleService {


    public GameSaleManager(HibernateGameDao hibernateGameDao, HibernateCustomerDao hibernateCustomerDao,
                           HibernateCampaignDao hibernateCampaignDao) {

    }


    @Override
    public void purchase(Game game, Customer customer, Campaign campaign) {
        System.out.println("The game has been purchased   : " + game.getGameName());
        System.out.println("By this user   :"  + customer.getFirstName());
        System.out.println("Used this campaign:" + campaign.getCampaignName());
    }

    @Override
    public void refund(Game game, Customer customer, Campaign campaign) {
        System.out.println("The game has been refunded   : " + game.getGameName());
        System.out.println("By this user   :"  + customer.getFirstName());
        System.out.println("Used this campaign:" + campaign.getCampaignName());
    }
}



