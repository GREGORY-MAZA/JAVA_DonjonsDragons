package cases;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import loots.Item;
import menu.Character;
import mobs.Enemy;


/** Classe ChestCase qui permet de créer un Objet ChestCase qui hérite de la classe abstraite Case
 * @see Case
 */

public class ChestCase extends Case {

    private Item item;

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public ChestCase (Item item){
        super ("                       = = = = = = = = = = =| NEW ITEM " + item.getName() + " |= = = = = = = = = = = = ");
        this.item =item;
    }

    /**
     * Fonction action qui permet de renvoyer un System.out.println avec le texte souhaité
     * @param player
     * prend en parametre player
     */
    @Override
    public void action(Character player) {
        System.out.println("<<<<| NEW ITEM " + item.getName() + ">>>>>");
        item.action(player);
    }

//---------------------------END--------------------------------------
}
