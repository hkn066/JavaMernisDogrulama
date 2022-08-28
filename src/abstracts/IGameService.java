package abstracts;

import entities.Game;


public interface IGameService {
	void add(Game... game);
	void delete(Game game);

}
