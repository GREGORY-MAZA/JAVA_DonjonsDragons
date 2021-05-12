package loots;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;
import menu.Warrior;
import menu.Wizard;

/** Classe Shield qui permet de créer un Objet Shield qui hérite de la classe abstraite Item
 * @see Item
 */

public class Shield extends Item {

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    /**
     * Constructeur de l'Objet Shield qui hérite de la classe abstraite Item
     */

    public Shield() {
        super("Shield  of Rage", 0, 0, 3);
    }


    //------------------------------------ GETTERS & SETTERS  ------------------------------------------


    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    /**
     * Fonction action qui permet de changer la valeur de l'attribut DefenseHand du joueur de type Warrior
     * @param player
     * Prend en parametre player
     * player instanceof permet de savoir si le joueur est de type Warrior ou Wizard
     */

    public void action(Character player) {
        // add points protect

        if (player instanceof Warrior) {
            player.setDefenseHand(this);
        }

    }

    //-----------------------------------  END ----------------------------------
}
