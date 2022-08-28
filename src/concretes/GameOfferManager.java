package concretes;

import abstracts.IGameOfferService;
import entities.Game;
import entities.GameOffer;

public class GameOfferManager implements IGameOfferService{

	@Override
	public void add(GameOffer gameOffer,Game game) {
		System.out.println("Kampanya Oluşturuldu " + (game.getGamePrice()*gameOffer.getOfferRate())/100 );
		
	}

	@Override
	public void delete(GameOffer gameOffer) {
		System.out.println("Kampanya Silindi");
		
	}

}
