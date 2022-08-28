package concretes;

import abstracts.IGamerCheckService;
import entities.Gamer;

public class GamerCheckManager implements IGamerCheckService{

	@Override
	public boolean CheckGamerReal(Gamer gamer) {
		
		
		return true;
		
	}

}
