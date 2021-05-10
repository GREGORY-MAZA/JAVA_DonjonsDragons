package menu;

    //-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

public abstract class Character {

    private String name;
    private int health;
    private int attack;
    private int protect;
    private int healthMax;
    private int attackMax;



    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public Character(String name, int health, int attack,int protect, int healthMax,int attackMax) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.protect = protect;
        this.healthMax = healthMax;
        this.attackMax = attackMax;

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

    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    public String toString() {
        return

                "     toString class Character";
    }
//--------------------------------------- END ---------------------------------------------------
}
