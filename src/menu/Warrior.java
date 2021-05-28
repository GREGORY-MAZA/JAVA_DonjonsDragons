package menu;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import loots.Hand;
import loots.Item;

/** Classe Warrior qui permet de créer un Objet Warrior qui hérite de la classe abstraite Character
 * @see Character
 */

public class Warrior extends Character {

    //private Item itemWeapon;
    //private Item itemDefense;


//------------------------------------ CONSTRUCTORS ---------------------------------------


    //public Warrior() { super("Greg",5,8,0,10,10); }

    /**
     *Constructeur de l'objet Warrior qui hérite de Character
     * @param name
     * Prend en parametre le choix du nom que l'utilisateur aura choisi
     */

    public Warrior(String name) {
        super(name,8,6,0,15,15,new Hand(),new Hand(),7,8,0,0,1);
        //this.itemWeapon = null;
        //this.itemDefense = null;
    }

   // public Warrior(String name,int health,int attack,int protect ,int healthMax, int attackMax){ super(name,health,attack,protect,healthMax,attackMax);}

    //public Warrior(String name, int health, int attack, int protect, int healthMax, int attackMax, Item itemWeapon, Item itemDefense) {
      //  super(name,health, attack,protect,healthMax,attackMax);
        //this.itemWeapon = itemWeapon;
        //this.itemDefense = itemDefense;
    //}

//------------------------------------ GETTERS & SETTERS  ------------------------------------------


    //public Item getItemWeapon() { return itemWeapon;}
    //public void setItemWeapon(Item itemWeapon) { this.itemWeapon = itemWeapon;}

    //public Item getItemDefense() { return itemDefense;}
    //public void setItemDefense(Item itemDefense) { this.itemDefense = itemDefense;}


//------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    /**
     * Fonction toString qui permet de renvoyer les informations de l'objet Warrior sous forme de texte
     * @return
     * Retourne le nom,les points vie, les points d'attaque et les points de protection du personnage
     */
    @Override
    public String toString() {
        return

                " NICKNAME : " + getName() +
                        "                 LEVEL : " + getLevel() +
                        "                 XP : " + getExperience() +
                "                 HEALTH POINT : " + getHealth() +
                "                 STRENGTH : " + getAttack() +
                "                 ARMOR : " + getProtect();
    }

    //------------------------------------ END  ------------------------------------------
}
