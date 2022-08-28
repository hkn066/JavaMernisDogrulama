package concretes;

import abstracts.IGameSalesService;

import entities.GameSales;

public class GameSalesManager implements IGameSalesService {

	@Override
	public void add(GameSales gameSales) {
		System.out.println("Satış yapıldı : " + gameSales.getGame().getGameName() +" "+ gameSales.getGamer().getFirstName());

	}

}
