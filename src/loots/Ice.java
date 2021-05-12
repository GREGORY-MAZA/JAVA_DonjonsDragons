package loots;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;
import menu.Warrior;
import menu.Wizard;

/** Classe Ice qui permet de créer un Objet Ice qui hérite de la classe abstraite Item
 * @see Item
 */

public class Ice extends Item {

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    /**
     * Constructeur de l'Objet Ice qui hérite de la classe abstraite Item
     */

    public Ice() {
        super("Ice Blaster", 3, 0, 0);
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
