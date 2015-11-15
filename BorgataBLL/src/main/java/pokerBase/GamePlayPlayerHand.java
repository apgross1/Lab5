package pokerBase;

public class GamePlayPlayerHand {

	private GamePlay game1 = null;
	private Player player = null;
	private Hand hand = null;
	private Player WinningPlayer = null;
	
	public GamePlayPlayerHand() {
	
	}

	public GamePlay getGame() {
		return game1;
	}

	public void setGame(GamePlay game) {
		this.game1 = game;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public void addCardToHand( Card c)
	{
		getHand().AddCardToHand(c);
	}
	
	public Player getWinningPlayer() {
		return WinningPlayer;
	}

	public void setWinningPlayer(Player winningPlayer) {
		WinningPlayer = winningPlayer;
	}

	
}
