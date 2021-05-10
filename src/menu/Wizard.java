package menu;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

public class Wizard extends Character{

    private String itemSpell;
    private String itemBuff;

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public Wizard() {
        super("Greg",3,8,0,6,15);
    }
     public Wizard(String name) { super(name,5,8,0,6,15); }

     public Wizard(String name, int health, int attack,int protect, int healthMax, int attackMax) { super(name,health,attack,protect,healthMax,attackMax); }


    public Wizard(String name, int health, int attack, int protect, int healthMax, int attackMax, String itemSpell, String itemBuff) {
        super(name,health,attack,protect,healthMax,attackMax);
        this.itemSpell = itemSpell;
        this.itemBuff = itemBuff;
    }

//------------------------------------ GETTERS & SETTERS  ------------------------------------------


    public String getItemSpell() { return itemSpell;}
    public void setItemSpell(String weapon) { this.itemSpell = weapon;}

    public String getItemBuff() { return itemBuff;}
    public void setItemBuff(String itemBuff) { this.itemBuff = itemBuff;}

    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    public String toString() {
        return

                "                 NICKNAME : " + getName() +
                        "                 HEALTH POINT : " + getHealth() +
                        "                 SPIRIT : " + getAttack() +
                        "                 ARMOR : " + getProtect();
    }
}

