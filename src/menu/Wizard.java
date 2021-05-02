package menu;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

public class Wizard {

    private String name;
    private int health;
    private int attack;
    private String spell;
    private String buff;

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public Wizard() {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.spell = spell;
        this.buff = buff;
    }
     public Wizard(String name) {
         this.name = name;
         this.health = health;
         this.attack = attack;
         this.spell = spell;
         this.buff = buff;
     }
     public Wizard(String name, int health, int attack) {
         this.name = name;
         this.health = health;
         this.attack = attack;
         this.spell = spell;
         this.buff = buff;
     }


    public Wizard(String name, int health, int attack, String spell, String buff) {
        this.name = name;
        this.health = health;
        this.attack = attack;
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

    public String getSpell() { return spell;}
    public void setSpell (String weapon) { this.spell = weapon;}

    public String getBuff() { return buff;}
    public void setBuff (String buff) { this.buff = buff;}

    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    public String toString() {
        return

                "     NICKNAME : " + name +
                        "     HEALTH POINT : " + health +
                        "     STRENGTH : " + attack +
                        "     SPELL ATTACK : " + spell +
                        "     BUFF ARMOR : " + buff;
    }
}

