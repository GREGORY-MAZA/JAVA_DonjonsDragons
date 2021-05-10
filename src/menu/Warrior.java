package menu;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import loots.Item;

public class Warrior extends Character {

    private Item itemWeapon;
    private Item itemDefense;

//------------------------------------ CONSTRUCTORS ---------------------------------------

    public Warrior() { super("Greg",5,8,0,10,10); }

    public Warrior(String name) {
        super(name,5,8,0,10,10);
        this.itemWeapon = null;
        this.itemDefense = null;
    }

    public Warrior(String name,int health,int attack,int protect ,int healthMax, int attackMax){ super(name,health,attack,protect,healthMax,attackMax);}

    public Warrior(String name, int health, int attack, int protect, int healthMax, int attackMax, Item itemWeapon, Item itemDefense) {
        super(name,health, attack,protect,healthMax,attackMax);
        this.itemWeapon = itemWeapon;
        this.itemDefense = itemDefense;
    }

//------------------------------------ GETTERS & SETTERS  ------------------------------------------


    public Item getItemWeapon() { return itemWeapon;}
    public void setItemWeapon(Item itemWeapon) { this.itemWeapon = itemWeapon;}

    public Item getItemDefense() { return itemDefense;}
    public void setItemDefense(Item itemDefense) { this.itemDefense = itemDefense;}


//------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    @Override
    public String toString() {
        return

                "                 NICKNAME : " + getName() +
                "                 HEALTH POINT : " + getHealth() +
                "                 STRENGTH : " + getAttack() +
                "                 ARMOR : " + getProtect();
    }

    //------------------------------------ END  ------------------------------------------
}
