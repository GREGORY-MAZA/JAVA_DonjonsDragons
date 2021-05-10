package loots;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;

public abstract class Item {

    private String name;
    private int attackBonus;
    private int healthBonus;
    private int protectBonus;

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public Item(String name, int attackBonus, int healthBonus, int protectBonus) {
        this.name = name;
        this.attackBonus = attackBonus;
        this.healthBonus = healthBonus;
        this.protectBonus = protectBonus;
    }

    //------------------------------------ GETTERS & SETTERS  ------------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    public int getHealthBonus() {
        return healthBonus;
    }

    public void setHealthBonus(int healthBonus) {
        this.healthBonus = healthBonus;
    }

    public int getProtectBonus() {
        return protectBonus;
    }

    public void setProtectBonus(int protectBonus) {
        this.protectBonus = protectBonus;
    }

    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    public String toString() {
        return

                        "          -=[ ITEM ]=- : " + getName() +
                        "          -=[ ATTACK BONUS ]=- : " + attackBonus +
                        "          -=[ PROTECT BONUS ]=- : " + protectBonus +
                        "          -=[ HEALTH BONUS ]=- :  " + healthBonus;
    }

    public abstract void action(Character player);

    //-------------------------------------  END  ---------------------------------------------
}
