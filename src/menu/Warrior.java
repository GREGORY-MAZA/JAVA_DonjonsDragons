package menu;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

public class Warrior extends Character {

    public WeaponSpell weapon;
    public DefenseBuff defense;

//------------------------------------ CONSTRUCTORS ---------------------------------------

    public Warrior() { super("Greg",5,8,10,10); }

    public Warrior(String name) {
        super(name,5,8,10,10);
        this.weapon = null;
        this.defense = null;
    }

    public Warrior(String name,int health,int attack,int healthMax, int attackMax){ super(name,health,attack,healthMax,attackMax);}

    public Warrior(String name, int health, int attack,int healthMax, int attackMax, WeaponSpell weapon, DefenseBuff defense) {
        super(name,health, attack,healthMax,attackMax);
        this.weapon = weapon;
        this.defense = defense;
    }

//------------------------------------ GETTERS & SETTERS  ------------------------------------------


    public WeaponSpell getWeapon() { return weapon;}
    public void setWeapon (WeaponSpell weapon) { this.weapon = weapon;}

    public DefenseBuff getDefense() { return defense;}
    public void setDefense (DefenseBuff defense) { this.defense = defense;}


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

    //------------------------------------ END  ------------------------------------------
}
