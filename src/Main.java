import Business.abstracts.CampaignService;
import Business.abstracts.CustomerService;
import Business.abstracts.GameSaleService;
import Business.abstracts.GameService;
import Business.concretes.CampaignManager;
import Business.concretes.CustomerManager;
import Business.concretes.GameManager;
import Business.concretes.GameSaleManager;
import Core.MernisManagerAdapter;
import DataAccess.concretes.HibernateCampaignDao;
import DataAccess.concretes.HibernateCustomerDao;
import DataAccess.concretes.HibernateGameDao;
import Entities.concretes.Campaign;
import Entities.concretes.Customer;
import Entities.concretes.Game;

import java.time.LocalDate;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomerService customerService = new CustomerManager(new MernisManagerAdapter());
        customerService.add(new Customer(1,"Ali","Ahmet",
                LocalDate.of(1988,8,8),
                "10000000000","aliahmet@emailme.com"));
        System.out.println("--------------------------------");
        GameService gameService = new GameManager(new HibernateGameDao());
        gameService.add(new Game(11,"Forza Horizon 4", 1,"Racing",
                "Dynamic seasons change everything at the world’s greatest automotive festival. " +
                        "Go it alone or team up with others to explore beautiful and historic Britain " +
                        "in a shared open world.","Xbox Game Studios","Playground Games",
                "9 March 2021",92));
        System.out.println("--------------------------------");
        CampaignService campaignService = new CampaignManager(new HibernateCampaignDao());
        campaignService.add(new Campaign(111,"Racing Weekend",10));
        System.out.println("--------------------------------");
        GameSaleService gameSaleService = new GameSaleManager(new HibernateGameDao(),new HibernateCustomerDao(),
                new HibernateCampaignDao(),);
        gameSaleService.purchase(Game,Customer,Campaign);
    }
}