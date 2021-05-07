package DataAccess.abstracts;

import Entities.concretes.Game;

import java.util.List;

public interface GameDao {
    void add(Game game);
    void delete(Game game);
    void update(Game game);
    Game get(int gameId);
    List<Game> getAll();
}
