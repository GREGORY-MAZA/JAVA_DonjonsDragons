package loots;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;
import menu.Warrior;

/** Classe Sword qui permet de créer un Objet Sword qui hérite de la classe abstraite Item
 * @see Item
 */

public class Sword extends Item {

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    /**
     * Constructeur de l'Objet Sword qui hérite de la classe abstraite Item
     */

    public Sword() { super("Sword",1,0,0,11); }


    //------------------------------------ GETTERS & SETTERS  ------------------------------------------


    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    /**
     * Fonction action qui permet de changer la valeur de l'attribut AttackHand du joueur
     * @param player
     * Prend en parametre player
     * player instanceof permet de savoir si le joueur est de type Warrior ou Wizard
     */

    public void action(Character player) {
        // add points attack
        if (player instanceof Warrior) {
            player.setAttackHand(this);
        }

    }

    //-----------------------------------  END ----------------------------------
}
