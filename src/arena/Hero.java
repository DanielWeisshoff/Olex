public class Hero {

	protected int health;
	protected String name;

	public Hero(int health, String name) {
		this.health = health;
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public String getName() {
		return name;
	}
}