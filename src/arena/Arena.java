public class Arena {
	protected Hero[] hero;
	//<Access Modifier> <Typ> <Name>

	public Arena(Hero[] hero) {
		this.hero = hero;
	}

	public Hero[] getHero() {
		return hero;
	}
}
