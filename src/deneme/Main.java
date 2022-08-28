package deneme;



import adapter.MernisAdapter;
import concretes.GameManager;
import concretes.GameSalesManager;
import concretes.GamerManager;
import entities.Game;
import entities.GameSales;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
		

		Gamer gamer1 = new Gamer(1,"hakan","çakır",1990,"69898109998");
		GamerManager gamerManager = new GamerManager(new MernisAdapter());
		gamerManager.add(gamer1);
		
		Game game1= new Game(1, "Asphalt", 120);
		Game game2= new Game(2,"NeedForSpeed",200);
		GameManager gameManager= new GameManager();
		gameManager.add(game1,game2);
		
		GameSales gameSales1= new GameSales(1, game1, gamer1);
		GameSales gameSales2= new GameSales(2, game2, gamer1);
		GameSalesManager gameSalesManager = new GameSalesManager();
		gameSalesManager.add(gameSales1);
		gameSalesManager.add(gameSales2);
		
	}

}
