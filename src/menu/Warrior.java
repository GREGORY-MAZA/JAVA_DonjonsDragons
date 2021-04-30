package menu;

public class Warrior {

    private String name;
    private int health;
    private int attack;
    private String weapon;
    private String defense;

    public Warrior(String name, int health, int attack, String weapon, String defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.weapon = weapon;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() { return attack; }
    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getWeapon() { return weapon;}
    public void setWeapon (String weapon) { this.weapon = weapon;}

    public String getDefense() { return defense;}
    public void setDefense (String spell) { this.defense = defense;}

    @Override
    public String toString() {
        return

                "     NICKNAME : " + name +
                "     HEALTH POINT : " + health +
                "     STRENGTH : " + attack +
                "     ATTACK ITEM : " + weapon +
                "     SHIELD ITEM : " + defense;
    }
}
