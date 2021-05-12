package cases;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;
import mobs.Enemy;

/** Classe EnemyCase qui permet de créer un Objet EnemyCase qui hérite de la classe abstraite Case
 * @see Case
 */

public class EnemyCase extends Case {

    private Enemy enemyType;

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public EnemyCase (Enemy enemy){ super ("Ready to fight ? VERSUS " + enemy.getName());
        this.enemyType = enemy;
    }

    /**
     * Fonction action qui permet de renvoyer un System.out.println avec le texte souhaité
     * @param player
     * prend en parametre player
     */

    @Override
    public void action(Character player) {
        System.out.println("Je tombe sur un enemy : " + enemyType.getName());
    }

}
