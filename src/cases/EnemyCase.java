package cases;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import mobs.Enemy;
import menu.Character;

/** Classe EnemyCase qui permet de créer un Objet EnemyCase qui hérite de la classe abstraite Case
 * @see Case
 */

public class EnemyCase extends Case {

    private Enemy enemy;

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public EnemyCase (Enemy enemy){
        super ("                       = = = = = = = = = = =| Time to FIGHT ! VERSUS " + enemy.getName() + " |= = = = = = = = = = = = ");
        this.enemy = enemy;
    }

    /**
     * Fonction action qui permet de renvoyer un System.out.println avec le texte souhaité
     * @param player
     * prend en parametre player
     */


    public void action(Character player ,Enemy pnj) {
        System.out.println("Je tombe sur un enemy : " + enemy.getName());
        enemy.action(player ,pnj );
    }

}
