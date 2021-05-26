package loots;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;
//import menu.ItemSkill;
import menu.Warrior;
import loots.Item;

/** Classe Hand qui permet de créer un Objet Hand qui hérite de la classe abstraite Item
 * @see Item
 */
public class Hand extends Item {

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public Hand() { super("Hand",0,0,0,0); }


    //------------------------------------ GETTERS & SETTERS  ------------------------------------------


    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    /**
     * Fonction action qui permet de changer la valeur de l'attribut AttackHand du joueur
     * @param player
     * Prend en parametre player
     */

    public void action(Character player) {
    }

    //-----------------------------------  END ----------------------------------
}