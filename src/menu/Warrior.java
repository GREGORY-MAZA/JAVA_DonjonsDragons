package menu;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

public class Warrior extends Character{

    private String weapon;
    private String defense;

//------------------------------------ CONSTRUCTORS ---------------------------------------

    public Warrior() { super("Greg",5,8); }

    public Warrior(String name) {
        super(name,5,8);
    }

    public Warrior(String name,int health,int attack){
        super(name,health, attack);
    }

    public Warrior(String name, int health, int attack, String weapon, String defense) {
        super(name,health, attack);
        this.weapon = weapon;
        this.defense = defense;
    }

//------------------------------------ GETTERS & SETTERS  ------------------------------------------


    public String getWeapon() { return weapon;}
    public void setWeapon (String weapon) { this.weapon = weapon;}

    public String getDefense() { return defense;}
    public void setDefense (String spell) { this.defense = defense;}


//------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    @Override
    public String toString() {
        return

                "     NICKNAME : " + getName() +
                "     HEALTH POINT : " + getHealth() +
                "     STRENGTH : " + getAttack() +
                "     ATTACK ITEM : " + weapon +
                "     SHIELD ITEM : " + defense;
    }
}
