package Fussball;

public class Player {

    protected int hight;
    protected String name;
    protected String vorname;
    protected int skill;

    public Player(int hight, String name, String vorname, int skill) {
        this.hight = hight;
        this.name = name;
        this.vorname = vorname;
        this.skill = skill;
    }

    public int getHight() {
        return hight;
    }

    public String getName() {
        return name;
    }

    public int getSkill() {
        return skill;
    }

    public String getVorname() {
        return vorname;
    }
}