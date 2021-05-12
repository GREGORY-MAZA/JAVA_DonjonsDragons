package loots;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;
import menu.Warrior;


/** Classe Axe qui permet de créer un Objet Axe qui hérite de la classe abstraite Item
 * @see Item
 */
public class Axe extends Item {

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    /**
     * Constructeur de l'Objet Axe qui hérite de la classe abstraite Item
     */

    public Axe() { super("Axe",3,0,0); }


    //------------------------------------ GETTERS & SETTERS  ------------------------------------------


    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    /**
     * Fonction action qui permet de changer la valeur de l'attribut AttackHand du joueur de type Warrior
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