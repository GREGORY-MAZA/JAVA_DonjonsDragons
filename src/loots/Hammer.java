package loots;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;
import menu.Warrior;
import menu.Wizard;

/** Classe Hammer qui permet de créer un Objet Hammer qui hérite de la classe abstraite Item
 * @see Item
 */
public class Hammer extends Item {

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    /**
     * Constructeur de l'Objet Hammer qui hérite de la classe abstraite Item
     */

    public Hammer() {
        super("Hammer", 5, 0, 0);
    }


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
            if (player instanceof Warrior) {
                player.setAttackHand(this);
            }

        }

        //-----------------------------------  END ----------------------------------
    }
}
