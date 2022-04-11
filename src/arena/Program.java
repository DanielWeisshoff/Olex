
public class Program {

	public static void main(String[] args) {
		Hero[] hero = new Hero[4];
		hero[0] = new Hero(100, "Ralf");
		hero[1] = new Hero(100, "Bjorn");
		hero[2] = new Hero(100, "Jan");
		hero[3] = new Hero(69, "Olex");
		Arena arena = new Arena(hero);

		for (Hero h : arena.getHero())
			System.out.println(h.getName() + ", " + h.getHealth());

		//Objekt -> Instanz einer Klasse (new)
		//primitive Datentypen
		//call by Value, Call by Reference
		//Warum Attribute?
	}
}

// STRG + SHIFT + P	 VS Code Terminal
// STR + P		
// STRG + B		Explorer