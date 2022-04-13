package Fussball;

public class Team {
	protected Player[] player;

	public Team(Player[] player) {
		this.player = player;
	}

	public Player[] getPlayer() {
		return player;
	}
}