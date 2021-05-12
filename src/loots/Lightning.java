package loots;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;
import menu.Wizard;

/** Classe Lightning qui permet de créer un Objet Lightning qui hérite de la classe abstraite Item
 * @see Item
 */

public class Lightning extends Item {

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    /**
     * Constructeur de l'Objet Lightning qui hérite de la classe abstraite Item
     */

    public Lightning() {
        super("Little Lightning", 2, 0, 0);
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
        // add points attack
        if (player instanceof Wizard) {
            player.setAttackHand(this);
        }

    }

    //-----------------------------------  END ----------------------------------
}
