package loots;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;

/** Classe Potion qui permet de créer un Objet Potion qui hérite de la classe abstraite Item
 * @see Item
 */

public class Potion extends Item {

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    /**
     * Constructeur de l'Objet Potion qui hérite de la classe abstraite Item
     */

    public Potion() { super("Little Potion of health",0,2,0,50); }


    //------------------------------------ GETTERS & SETTERS  ------------------------------------------


    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    /**
     * Fonction action qui permet de changer la valeur de l'attribut Health du joueur de type Warrior ou Wizard
     * @param player
     * Prend en parametre player
     */

    public void action(Character player){
        // add points Health

        int health = (getHealthBonus() + player.getHealth());
        player.setHealth(health);
    }

    //-----------------------------------  END ----------------------------------
}
