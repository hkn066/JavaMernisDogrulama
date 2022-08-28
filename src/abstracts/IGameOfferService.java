package abstracts;

import entities.Game;
import entities.GameOffer;

public interface IGameOfferService {
	void add(GameOffer gameOffer,Game game);
	void delete(GameOffer gameOffer);
	

}
