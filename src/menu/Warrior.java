package menu;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

public class Warrior extends Character {

    private Weapon weapon;
    private Defense defense;

//------------------------------------ CONSTRUCTORS ---------------------------------------

    public Warrior() { super("Greg",5,8,10,10); }

    public Warrior(String name) {
        super(name,5,8,10,10);
        this.weapon = null;
        this.defense = null;
    }

    public Warrior(String name,int health,int attack,int healthMax, int attackMax){ super(name,health,attack,healthMax,attackMax);}

    public Warrior(String name, int health, int attack, int healthMax, int attackMax, Weapon weapon, Defense defense) {
        super(name,health, attack,healthMax,attackMax);
        this.weapon = weapon;
        this.defense = defense;
    }

//------------------------------------ GETTERS & SETTERS  ------------------------------------------


    public Weapon getWeapon() { return weapon;}
    public void setWeapon (Weapon weapon) { this.weapon = weapon;}

    public Defense getDefense() { return defense;}
    public void setDefense (Defense defense) { this.defense = defense;}


//------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    @Override
    public String toString() {
        return

                "                 NICKNAME : " + getName() +
                "                 HEALTH POINT : " + getHealth() +
                "                 STRENGTH : " + getAttack();
    }

    //------------------------------------ END  ------------------------------------------
}
