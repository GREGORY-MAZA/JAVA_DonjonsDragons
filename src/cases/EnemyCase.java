package cases;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import loots.Hand;
import loots.Shield;
import menu.Tools;
import mobs.Enemy;
import menu.Character;
import loots.Item;

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
        System.out.println("");
        System.out.println("ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println("       o====[]============>                You enter on a Enemy Room...  " + enemy.getName()+ " want to kill you .....                <============[]====o");
        System.out.println("ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        if (enemy.getName().equalsIgnoreCase("Dragon")){
            System.out.println("                                              ___====-_  _-====___\n" +
                    "                                        _--^^^#####//      \\\\#####^^^--_\n" +
                    "                                     _-^##########// (    ) \\\\##########^-_\n" +
                    "                                    -############//  |\\^^/|  \\\\############-\n" +
                    "                                  _/############//   (@::@)   \\\\############\\_\n" +
                    "                                 /#############((     \\\\//     ))#############\\\n" +
                    "                                -###############\\\\    (oo)    //###############-\n" +
                    "                               -#################\\\\  / VV \\  //#################-\n" +
                    "                              -###################\\\\/      \\//###################-\n" +
                    "                             _#/|##########/\\######(   /\\   )######/\\##########|\\#_\n" +
                    "                             |/ |#/\\#/\\#/\\/  \\#/\\##\\  |  |  /##/\\#/  \\/\\#/\\#/\\#| \\|\n" +
                    "                             `  |/  V  V  `   V  \\#\\| |  | |/#/  V   '  V  V  \\|  '\n" +
                    "                                `   `  `      `   / | |  | | \\   '      '  '   '\n" +
                    "                                                 (  | |  | |  )\n" +
                    "                                                __\\ | |  | | /__\n" +
                    "                                               (vvv(VVV)(VVV)vvv)");
            System.out.println("");
        }
        if (enemy.getName().equalsIgnoreCase("Orc")){
            System.out.println("                                     _____\n" +
                    "                                 .-,;='';_),-.\n" +
                    "                                  \\_\\(),()/_/\n" +
                    "                                    (,___,)\n" +
                    "                                   ,-/`~`\\-,___\n" +
                    "                                  / /).:.('--._)\n" +
                    "                                 {_[ (_,_)\n" +
                    "                                     | Y |\n" +
                    "                                    /  |  \\\n" +
                    "                                    \"\"\" \"\"\"");
            System.out.println("");
        }
        if (enemy.getName().equalsIgnoreCase("Gobelin")){
            System.out.println("                                                         ,-.\n" +
                    "                                    ___,---.__          /'|`\\          __,---,___\n" +
                    "                                 ,-'    \\`    `-.____,-'  |  `-.____,-'    //    `-.\n" +
                    "                               ,'        |           ~'\\     /`~           |        `.\n" +
                    "                              /      ___//              `. ,'          ,  , \\___      \\\n" +
                    "                             |    ,-'   `-.__   _         |        ,    __,-'   `-.    |\n" +
                    "                             |   /          /\\_  `   .    |    ,      _/\\          \\   |\n" +
                    "                             \\  |           \\ \\`-.___ \\   |   / ___,-'/ /           |  /\n" +
                    "                              \\  \\           | `._   `\\\\  |  //'   _,' |           /  /\n" +
                    "                               `-.\\         /'  _ `---'' , . ``---' _  `\\         /,-'\n" +
                    "                                  ``       /     \\    ,='/ \\`=.    /     \\       ''\n" +
                    "                                          |__   /|\\_,--.,-.--,--._/|\\   __|\n" +
                    "                                          /  `./  \\\\`\\ |  |  | /,//' \\,'  \\\n" +
                    "                                         /   /     ||--+--|--+-/-|     \\   \\\n" +
                    "                                        |   |     /'\\_\\_\\ | /_/_/`\\     |   |\n" +
                    "                                         \\   \\__, \\_     `~'     _/ .__/   /\n" +
                    "                                          `-._,-'   `-._______,-'   `-._,-'");
        }

        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            System.out.println("");
            System.out.println("o==[]>>>>>>>                 | The " + enemy.getName() + " had " + enemy.getHealth() + " Health Points");
            System.out.println("o====[]============>         | You hit " + enemy.getName() + "    " + player.getAttack() + " Dammage !");
            enemy.setHealth(enemy.getHealth() - player.getAttack());
            System.out.println("");
            if (enemy.getHealth() <= 0) {
                System.out.println("");
                System.out.println("                  The " + enemy.getName() + " is DEAD" );
                System.out.println("");
                System.out.println("                               / \\\n" +
                        "                               | |\n" +
                        "                               |.|\n" +
                        "                               |.|\n" +
                        "                               |:|      __\n" +
                        "                             ,_|:|_,   /  )\n" +
                        "                               (Oo    / _I_\n" +
                        "                                +\\ \\  || __|\n" +
                        "                                   \\ \\||___|\n" +
                        "                                     \\ /.:.\\-\\\n" +
                        "                                      |.:. /-----\\\n" +
                        "                                      |___|::oOo::|\n" +
                        "                                      /   |:<_T_>:|\n" +
                        "                                     |_____\\ ::: /\n" +
                        "                                      | |  \\ \\:/\n" +
                        "                                      | |   | |\n" +
                        "                                      \\ /   | \\___\n" +
                        "                                      / |   \\_____\\\n" +
                        "                                      `-'");
            } else if (enemy.getHealth() > 0){
                System.out.println( "o====[]============>         | You Have " + player.getHealth() + " Health Points");
                System.out.println( "o==[]>>>>>>>                 | "+ enemy.getName() + " Hit you ! " + enemy.getAttack() + " dammage !");
                System.out.println("o====[]============>         | You Have " + player.getProtect() + " Points of protect");
                player.setProtect(player.getProtect()- enemy.getAttack());
                    if (player.getProtect() < 0) {
                        player.setProtect(0);
                    }
                enemy.setAttack(enemy.getAttack() - player.getProtect());
                player.setHealth(player.getHealth() - enemy.getAttack());
                if (player.getProtect() <= 0){
                    player.setProtect(player.getDefaultProtect());
                    player.setDefenseHand(new Hand());
                    System.out.println("");
                    System.out.println("       >>>>>>>>> There no Armor Around here....<<<<<<<<<<<<");
                    System.out.println("");

                }

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
