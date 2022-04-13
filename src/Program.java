import Fussball.Player;
import Fussball.Team;

public class Program {

	public static void main(String[] args) {
		Player[] player = new Player[11];
		player[0] = new Player(190, "Ralf", "Hansa", 90);
		player[1] = new Player(194, "Schwanz", "Fotze", 96);
		player[2] = new Player(195, "Kevin", "Lustig", 97);
		player[3] = new Player(167, "Lucifer", "Horn", 92);
		player[4] = new Player(189, "Jesus", "Christus", 70);
		player[5] = new Player(178, "Barak", "Kadaffi", 98);
		player[6] = new Player(187, "Wladimir", "Putin", 80);
		player[7] = new Player(154, "Stefan", "King", 40);
		player[8] = new Player(182, "Leon", "Sperminator", 60);
		player[9] = new Player(167, "Sex", "King", 80);
		player[10] = new Player(178, "Bumaje", "Abu", 50);
		Team team = new Team(player);

		for (Player p : team.getPlayer())
			System.out.println(p.getName() + ", " + p.getVorname() + ", " + p.getHight() + ", " + p.getSkill());
	}
}
