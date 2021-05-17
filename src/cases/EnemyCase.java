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

    }

    @Override
    public void action(Character player) {
        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            System.out.println("           The " + enemy.getName() + " had " + enemy.getHealth() + " Health Points");
            System.out.println("           You hit " + enemy.getName() + "    " + player.getAttack() + " Dammage !");
            enemy.setHealth(enemy.getHealth() - player.getAttack());
            if (enemy.getHealth() < 0) {
                System.out.println(" The " + enemy.getName() + " is DEAD" );
            } else {
                System.out.println("     YOU DEAD !");
            }
        }
    }
}
