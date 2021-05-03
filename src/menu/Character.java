package menu;

    //-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

public class Character {

    private String name;
    private int health;
    private int attack;
    private String weapon;
    private String defense;
    private String spell;
    private String buff;


    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public Character(String name, int health, int attack) {

        this.name = name;
        this.health = health;
        this.attack = attack;
        this.weapon = weapon;
        this.defense = defense;
        this.spell = spell;
        this.buff = buff;

    }

    public Character(String name, int health, int attack, String defense, String) {

        this.name = name;
        this.health = health;
        this.attack = attack;
        this.weapon = weapon;
        this.defense = defense;
        this.spell = spell;
        this.buff = buff;

    }

    public Character(String name, int health, int attack, String spell, String buff) {

        this.name = name;
        this.health = health;
        this.attack = attack;
        this.weapon = weapon;
        this.defense = defense;
        this.spell = spell;
        this.buff = buff;

    }




    //------------------------------------ GETTERS & SETTERS  ------------------------------------------

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

    public String getSpell() { return spell;}
    public void setSpell (String weapon) { this.spell = weapon;}

    public String getBuff() { return buff;}
    public void setBuff (String buff) { this.buff = buff;}


    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    public String toString() {
        return

                "     NICKNAME : " + name +
                        "     HEALTH POINT : " + health +
                        "     STRENGTH : " + attack;
    }

}
