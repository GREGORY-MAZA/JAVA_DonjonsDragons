package loots;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;

/** Class Item est la classe Parent abstraite de tout le package loots.
 * Elle contient les attributs :
 * nom (String)  ,les points Bonus d'attaque ,les points Bonus de vie ,les points Bonus de protection
 */

public abstract class Item {

    private String name;
    private int attackBonus;
    private int healthBonus;
    private int protectBonus;

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    /**
     *
     * @param name = nom de l'item (String)
     * @param attackBonus = points Bonus d'attaque (int)
     * @param healthBonus = points Bonus de vie (int)
     * @param protectBonus = points Bonus de protection (int)
     */

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

    /**
     * Fonction equals qui permet de comparer les noms des Item(Objet)
     * @param a
     * @return
     */

    public boolean equals(Object a){
        return getName().equals(((Item)a).getName());
    }

    /**
     * Fonction toString qui permet de renvoyer les informations de l'objet Item sous forme de texte
     * @return
     * Retourne le nom,les points Bonus d'attaque, Bonus de protection  et Bonus de vie du personnage
     */
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
