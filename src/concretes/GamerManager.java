package concretes;

import abstracts.IGamerCheckService;
import abstracts.IGamerManager;
import entities.Gamer;

public class GamerManager implements IGamerManager {
	
	private IGamerCheckService iGamerCheckService;

	public GamerManager(IGamerCheckService iGamerCheckService) {
	
		this.iGamerCheckService = iGamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		
		if(iGamerCheckService.CheckGamerReal(gamer)) {
			System.out.println("oyuncu kaydedildi :" + gamer.getFirstName());
		}
		else {
			System.out.println("oyuncu bilgileri hatali !!!");
		}
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

}
