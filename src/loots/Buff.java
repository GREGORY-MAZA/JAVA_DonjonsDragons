package loots;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;
import menu.Wizard;

/** Classe Buff qui permet de créer un Objet Buff qui hérite de la classe abstraite Item
 * @see Item
 */
public class Buff extends Item {

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    /**
     * Constructeur de l'Objet Buff qui hérite de la classe abstraite Item
     */

    public Buff() {
        super("Buff of Spirit", 0, 0, 3,18);
    }


    //------------------------------------ GETTERS & SETTERS  ------------------------------------------


    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    /**
     * Fonction action qui permet de changer la valeur de l'attribut AttackHand du joueur de type Wizard
     * @param player
     * Prend en parametre player
     * player instanceof permet de savoir si le joueur est de type Warrior ou Wizard
     */

    public void action(Character player) {
        // add points protect
        if (player instanceof Wizard) {
            player.setDefenseHand(this);
        }

    }

    //-----------------------------------  END ----------------------------------
}
