package loots;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;
import menu.Wizard;

/** Classe MegaPotion qui permet de créer un Objet MegaPotion qui hérite de la classe abstraite Item
 * @see Item
 */

public class MegaPotion extends Item {

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    /**
     * Constructeur de l'Objet MegaPotion qui hérite de la classe abstraite Item
     */

    public MegaPotion() { super("Mega Potion Heal ! ",0,5,0,100); }


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
