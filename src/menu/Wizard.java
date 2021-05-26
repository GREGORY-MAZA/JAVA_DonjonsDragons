package menu;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import loots.Hand;
import loots.Item;

/** Classe Wizard qui permet de créer un Objet Warrior qui hérite de la classe abstraite Character
 * @see Character
 */

public class Wizard extends Character{

    //private String itemSpell;
    //private String itemBuff;
    private Item rightHand = new Hand();
    private Item leftHand = new Hand();

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    //public Wizard() {
      //  super("Greg",3,8,0,6,15);
    //}

    /**
     *Constructeur de l'objet Wizard qui hérite de Character
     * @param name
     * Prend en parametre le choix du nom que l'utilisateur aura choisi
     */

     public Wizard(String name) { super(name,5,8,0,6,15,new Hand(),new Hand(),5,8,0,0,1); }

     //public Wizard(String name, int health, int attack,int protect, int healthMax, int attackMax) { super(name,health,attack,protect,healthMax,attackMax); }


    //public Wizard(String name, int health, int attack, int protect, int healthMax, int attackMax, String itemSpell, String itemBuff) {
       // super(name,health,attack,protect,healthMax,attackMax);
        //this.itemSpell = itemSpell;
        //this.itemBuff = itemBuff;
    //}

//------------------------------------ GETTERS & SETTERS  ------------------------------------------


    //public String getItemSpell() { return itemSpell;}
    //public void setItemSpell(String weapon) { this.itemSpell = weapon;}

    //public String getItemBuff() { return itemBuff;}
    //public void setItemBuff(String itemBuff) { this.itemBuff = itemBuff;}

    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    /**
     * Fonction toString qui permet de renvoyer les informations de l'objet Warrior sous forme de texte
     * @return
     * Retourne le nom,les points vie, les points d'attaque et les points de protection du personnage
     */

    public String toString() {
        return

                " NICKNAME : " + getName() +
                        "                 LEVEL : " + getLevel() +
                        "                 XP : " + getExperience() +
                        "                 HEALTH POINT : " + getHealth() +
                        "                 SPIRIT : " + getAttack() +
                        "                 ARMOR : " + getProtect();
    }
}

