package entities;

public class GameOffer {

	private int id;
	private String gameOfferName;
	private int offerRate;

	public GameOffer() {

	}

	public GameOffer(int id, String gameOfferName, int offerRate) {

		this.id = id;
		this.gameOfferName = gameOfferName;
		this.offerRate = offerRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameOfferName() {
		return gameOfferName;
	}

	public void setGameOfferName(String gameOfferName) {
		this.gameOfferName = gameOfferName;
	}

	public int getOfferRate() {
		return offerRate;
	}

	public void setOfferRate(int offerRate) {
		this.offerRate = offerRate;
	}

}
