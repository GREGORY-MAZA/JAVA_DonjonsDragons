package cases;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Tools;
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






    @Override
    public void action(Character player) {
        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            System.out.println("");
            System.out.println("o==[]>>>>>>>         | The " + enemy.getName() + " had " + enemy.getHealth() + " Health Points");
            System.out.println("o====[]============> | You hit " + enemy.getName() + "    " + player.getAttack() + " Dammage !");
            enemy.setHealth(enemy.getHealth() - player.getAttack());
            System.out.println("");
            if (enemy.getHealth() <= 0) {
                System.out.println("          **************************************                                                                      ");
                System.out.println("         ****************************************                                   ");
                System.out.println("        ****                                  ****                                   ");
                System.out.println("                  The " + enemy.getName() + " is DEAD" );
                System.out.println("        ****                                   ****                                   ");
                System.out.println("         ****************************************                                   ");
                System.out.println("           *************************************                                                                     ");
                System.out.println("");
                System.out.println("***                          ***   **************   *******          ***      ");
                System.out.println(" ***                        ***        ***         ***  ***         ***   ");
                System.out.println("  ***       *******       ***         ***         ***    ***       ***      ");
                System.out.println("   ***     ***   ***     ***         ***         ***      ***     ***         ");
                System.out.println("    ***   ***     ***   ***         ***         ***        ***   ***             ");
                System.out.println("     *******       *******    **************   ***          *******                       ");
                System.out.println("");
            } else if (enemy.getHealth() > 0){
                System.out.println( "o====[]============> | You Have " + player.getHealth() + " Health Points");
                System.out.println( "o==[]>>>>>>>         | "+ enemy.getName() + " Hit you ! " + enemy.getAttack() + " dammage !");
                player.setHealth(player.getHealth() - enemy.getAttack());

                if ( player.getHealth() <= 0 ){
                    System.out.println("");
                    System.out.println("");
                    System.out.println("          -------------------------------------------------------------------------------------------------------------------");
                    System.out.println("          -----------------| ********      ***********     ******     ********     |-----------------------------------------");
                    System.out.println("          -----------------| ***    ***    ***           ***    ***   ***    ***   |-----------------------------------------");
                    System.out.println("          -----------------| ***     ***   ***          ***      ***  ***     ***  |-----------------------------------------");
                    System.out.println("          -----------------| ***      ***  *******      ***      ***  ***      *** |-----------------------------------------");
                    System.out.println("          -----------------| ***      ***  ***          ***      ***  ***      *** |-----------------------------------------");
                    System.out.println("          -----------------| ***     ***   ***          ************  ***     ***  |-----------------------------------------");
                    System.out.println("          -----------------| ***    ***    ***          ***      ***  ***    ***   |-----------------------------------------");
                    System.out.println("          -----------------| ********      ***********  ***      ***  ********     |-----------------------------------------");
                    Tools.StopGame();
                }
            }
        }
    }
}
