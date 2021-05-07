package DataAccess.concretes;

import DataAccess.abstracts.GameDao;
import Entities.concretes.Game;

import java.util.List;

public class HibernateGameDao implements GameDao {
    @Override
    public void add(Game game) {
        System.out.println("Campaign has been added : " + game.getGameName());
    }

    @Override
    public void delete(Game game) {
        System.out.println("Campaign has been deleted : " + game.getGameName());
    }

    @Override
    public void update(Game game) {
        System.out.println("Campaign has been updated : " + game.getGameName());
    }

    @Override
    public Game get(int gameId) {
        return null;
    }

    @Override
    public List<Game> getAll() {
        return null;
    }
}
