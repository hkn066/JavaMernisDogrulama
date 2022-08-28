package concretes;

import abstracts.IGameService;
import entities.Game;

public class GameManager implements IGameService {

	

	@Override
	public void delete(Game game) {
		System.out.println("oyun silindi :" + game.getGameName());
		
	}

	@Override
	public void add(Game... games) {
		for (Game game : games) {
			System.out.println("oyun eklendi :" + game.getGameName() + "  fiyat :" + game.getGamePrice());
		}
		
		
	}

}
