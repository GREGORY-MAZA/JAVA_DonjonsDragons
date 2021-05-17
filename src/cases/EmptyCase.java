package cases;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;
import mobs.Enemy;

/**
 * Classe EmptyCase qui permet de créer un Objet EmptyCase qui hérite de la classe abstraite Case
 *
 * @see Case
 */

public class EmptyCase extends Case {

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public EmptyCase() {
        super("       This is a Empty case !");
    }

    /**
     * Fonction action qui permet de renvoyer un System.out.println avec le texte souhaité
     *
     * @param player prend en parametre player
     */

    @Override
    public void action(Character player) {

        System.out.println("<<<<<< You enter an emptu Room ...... So dark Here ! You must walk in the dust >>>>>>> ");
    }


    //------------------------------------ END ---------------------------------------
}
