package Business.concretes;

import Business.abstracts.GameService;
import DataAccess.concretes.HibernateGameDao;
import Entities.concretes.Game;

import java.util.LinkedList;

public class GameManager implements GameService {
    public GameManager(HibernateGameDao hibernateGameDao) {

    }

    @Override
    public void add(Game game) {
        System.out.println("The game has been added to the system : " + game.getGameName());
        System.out.println("Price  : " + game.getPrice());
        System.out.println("Campaign price  : " + game.getCampaignPrice());
        System.out.println("Game category  : " + game.getCategoryName());
        System.out.println("Description  : " + game.getDescription());
        System.out.println("Developer  : " + game.getDeveloperName());
        System.out.println("Publisher  : " + game.getPublisherName());
        System.out.println("Release Date  : " + game.getReleaseDate());
    }

    @Override
    public void delete(Game game) {
        System.out.println("Game has been deleted from the system  : " + game.getGameName());
    }

    @Override
    public void update(Game game) {
        System.out.println("Game has been updated  : " + game.getGameName());
    }
}
