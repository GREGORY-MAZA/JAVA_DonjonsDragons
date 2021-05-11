package menu;

    //-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import loots.Item;

public abstract class Character {

    private String name;
    private int health;
    private int attack;
    private int protect;
    private int healthMax;
    private int attackMax;
    private Item attackHand;
    private Item defenseHand;



    //------------------------------------ CONSTRUCTORS ---------------------------------------




    public Character(String name, int health, int attack,int protect, int healthMax,int attackMax,Item attackHand, Item defenseHand ) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.protect = protect;
        this.healthMax = healthMax;
        this.attackMax = attackMax;
        this.attackHand = attackHand;
        this.defenseHand = defenseHand;

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
    public void setAttack(int attack) { this.attack = attack;
        // TODO
    }

    public int getProtect() { return protect; }
    public void setProtect(int protect) { this.protect = protect; }

    public int getHealthMax() { return healthMax; }
    public void setHealthMax(int healthMax) { this.healthMax = healthMax; }

    public int getAttackMax() { return attackMax; }
    public void setAttackMax(int attackMax) { this.attackMax = attackMax; }

    public Item getAttackHand() { return attackHand; }

    public void setAttackHand(Item attackHand) {
        this.attackHand = attackHand;
        this.attack += attackHand.getAttackBonus();
        // todo verify max attack
    }

    public Item getDefenseHand() { return defenseHand; }
    public void setDefenseHand(Item defenseHand) { this.defenseHand = defenseHand; }

    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    public String toString() {
        return

                "     toString class Character";
    }
//--------------------------------------- END ---------------------------------------------------
}
