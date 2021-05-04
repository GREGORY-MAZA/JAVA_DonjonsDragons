package menu;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

public class Wizard extends Character{

    private String spell;
    private String buff;

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public Wizard() {
        super("Greg",3,8);
    }
     public Wizard(String name) {
        super(name,5,8);

     }
     public Wizard(String name, int health, int attack) {
         super(name,health,attack);
     }


    public Wizard(String name, int health, int attack, String spell, String buff) {
        super(name,health,attack);
        this.spell = spell;
        this.buff = buff;
    }

//------------------------------------ GETTERS & SETTERS  ------------------------------------------


    public String getSpell() { return spell;}
    public void setSpell (String weapon) { this.spell = weapon;}

    public String getBuff() { return buff;}
    public void setBuff (String buff) { this.buff = buff;}

    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    public String toString() {
        return

                "     NICKNAME : " + getName() +
                        "     HEALTH POINT : " + getHealth() +
                        "     STRENGTH : " + getAttack() +
                        "     SPELL ATTACK : " + spell +
                        "     BUFF ARMOR : " + buff;
    }
}

