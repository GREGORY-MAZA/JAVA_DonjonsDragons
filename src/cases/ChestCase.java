package cases;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import loots.Item;
import menu.Character;
import menu.Warrior;
import menu.Wizard;
import mobs.Enemy;


/**
 * Classe ChestCase qui permet de créer un Objet ChestCase qui hérite de la classe abstraite Case
 *
 * @see Case
 */

public class ChestCase extends Case {

    private Item item;

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public ChestCase(Item item) {
        super("                       = = = = = = = = = = =| NEW ITEM " + item.getName() + " |= = = = = = = = = = = = ");
        this.item = item;
    }

    /**
     * Fonction action qui permet de renvoyer un System.out.println avec le texte souhaité
     *
     * @param player prend en parametre player
     */
    @Override
    public void action(Character player) {
        System.out.println("");
        System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println("                                           <<<<| NEW ITEM " + item.getName() + ">>>>>");
        System.out.println("                             <<<<| BONUS ITEM EXPERIENCE " + item.getExperienceBonus() + " Experience Points");
        System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println("");
        player.setExperience(player.getExperience() + item.getExperienceBonus());
        if (player.getExperience() >= 100){
            player.setExperience(player.getExperience() - 100);
            player.setLevel(player.getLevel() + 1);
            System.out.println("o====[]============> YOU ARE NOW LEVEL " + player.getLevel() + "<============[]====o");
        }
        item.action(player);
        if (item.getName().equalsIgnoreCase("Shield  of Rage")) {
            System.out.println("                             |<><><>     |  |    <><><>|\n" +
                    "                             |<>         |  |        <>|\n" +
                    "                             |           |  |          |\n" +
                    "                             |  (______ <\\-/> ______)  |\n" +
                    "                             |  /_.-=-.\\| \" |/.-=-._\\  | \n" +
                    "                             |   /_    \\(o_o)/    _\\   |\n" +
                    "                             |    /_  /\\/ ^ \\/\\  _\\    |\n" +
                    "                             |      \\/ | / \\ | \\/      |\n" +
                    "                             |_______ /((( )))\\ _______|\n" +
                    "                             |      __\\ \\___/ /__      |\n" +
                    "                             |--- (((---'   '---))) ---|\n" +
                    "                             |           |  |          |\n" +
                    "                             |           |  |          |\n" +
                    "                             :           |  |          :     \n" +
                    "                              \\<>        |  |       <>/      \n" +
                    "                               \\<>       |  |      <>/       \n" +
                    "                                \\<>      |  |     <>/       \n" +
                    "                                 `\\<>    |  |   <>/'         \n" +
                    "                                   `\\<>  |  |  <>/'         \n" +
                    "                                     `\\<>|  |<>/'         \n" +
                    "                                       `-.  .-`           \n" +
                    "                                         '--'");
            System.out.println("");
            if (player instanceof Wizard) {
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("                                             <<<<<<<<<<<< Not for Wizard >>>>>>>>>>>> ");
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("");
            }
        }
        if (item.getName().equalsIgnoreCase("Axe")) {
            System.out.println("                                                                _.gd8888888bp._\n" +
                    "                                                              .g88888888888888888p.\n" +
                    "                                                            .d8888P\"\"       \"\"Y8888b.\n" +
                    "                                                            \"Y8P\"               \"Y8P'\n" +
                    "                                                               `.               ,'\n" +
                    "                                                                 \\     .-.     /\n" +
                    "                                                                  \\   (___)   /\n" +
                    "                       .------------------._______________________:__________j\n" +
                    "                      /                   |                      |           |`-.,_\n" +
                    "                      \\###################|######################|###########|,-'`\n" +
                    "                       `------------------'                       :    ___   l\n" +
                    "                                                                  /   (   )   \\\n" +
                    "                                                                 /     `-'     \\\n" +
                    "                                                               ,'               `.\n" +
                    "                                                            .d8b.               .d8b.\n" +
                    "                                                            \"Y8888p..       ,.d8888P\"\n" +
                    "                                                              \"Y88888888888888888P\"\n" +
                    "                                                                 \"\"YY8888888PP\"\"");
            System.out.println("");
            if (player instanceof Wizard) {
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("                                             <<<<<<<<<<<< Not for Wizard >>>>>>>>>>>> ");
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("");
            }
        }
        if (item.getName().equalsIgnoreCase("Sword")) {
            System.out.println("                                                /}\n" +
                    "                                               //\n" +
                    "                                              /{     />\n" +
                    "                               ,_____________///----/{____________________________________________________\n" +
                    "                             /|=============|/\\|-----/____________________________________________________\\\n" +
                    "                             \\|=============|\\/|-----\\____________________________________________________/\n" +
                    "                               '~~~~~~~~~~~~~\\\\\\----\\{\n" +
                    "                                              \\{     \\>\n" +
                    "                                               \\\\\n" +
                    "                                                \\}");
            System.out.println("");
            if (player instanceof Wizard) {
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("                                             <<<<<<<<<<<< Not for Wizard >>>>>>>>>>>> ");
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("");
            }
        }
        if (item.getName().equalsIgnoreCase("Hammer")) {
            System.out.println("                                     |\\\n" +
                    "                                     | \\        /|\n" +
                    "                                     |  \\____  / |\n" +
                    "                                    /|__/AMMA\\/  |\n" +
                    "                                  /AMMMMMMMMMMM\\_|\n" +
                    "                              ___/AMMMMMMMMMMMMMMA\n" +
                    "                              \\   |MVKMMM/ .\\MMMMM\\\n" +
                    "                               \\__/MMMMMM\\  /MMMMMM---\n" +
                    "                               |MMMMMMMMMMMMMMMMMM|  /\n" +
                    "                               |MMMM/. \\MM.--MMMMMM\\/\n" +
                    "                               /\\MMM\\  /MM\\  |MMMMMM   ___\n" +
                    "                              /  |MMMMMMMMM\\ |MMMMMM--/   \\-.\n" +
                    "                             /___/MMMMMMMMMM\\|M.--M/___/_|   \\\n" +
                    "                                  \\VMM/\\MMMMMMM\\  |      /\\ \\/\n" +
                    "                                   \\V/  \\MMMMMMM\\ |     /_  /\n" +
                    "                                     |  /MMMV'   \\|    |/ _/\n" +
                    "                                     | /              _/  /\n" +
                    "                                     |/              /| \\'\n" +
                    "                                                    /_  /\n" +
                    "                                                    /  /");
            System.out.println("");
            if (player instanceof Wizard) {
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("                                             <<<<<<<<<<<< Not for Wizard >>>>>>>>>>>> ");
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("");
            }
        }
        if (item.getName().equalsIgnoreCase("Little Potion of health")) {
            System.out.println("                                  ******       ******\n" +
                    "                                **********   **********\n" +
                    "                              ************* *************\n" +
                    "                             *****************************\n" +
                    "                             *****************************\n" +
                    "                             *****************************\n" +
                    "                              ***************************\n" +
                    "                                ***********************\n" +
                    "                                  *******************\n" +
                    "                                    ***************\n" +
                    "                                      ***********\n" +
                    "                                        *******\n" +
                    "                                          ***\n" +
                    "                                           *");
            System.out.println("");
        }
        if (item.getName().equalsIgnoreCase("Mega Potion Heal ! ")) {
            System.out.println("                                     @@@@@@           @@@@@@\n" +
                    "                                   @@@@@@@@@@       @@@@@@@@@@\n" +
                    "                                 @@@@@@@@@@@@@@   @@@@@@@@@@@@@@\n" +
                    "                               @@@@@@@@@@@@@@@@@ @@@@@@@@@@@@@@@@@\n" +
                    "                              @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                    "                             @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                    "                             @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                    "                             @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                    "                              @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                    "                               @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                    "                                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                    "                                 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                    "                                   @@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                    "                                     @@@@@@@@@@@@@@@@@@@@@@@\n" +
                    "                                       @@@@@@@@@@@@@@@@@@@\n" +
                    "                                         @@@@@@@@@@@@@@@\n" +
                    "                                           @@@@@@@@@@@\n" +
                    "                                             @@@@@@@\n" +
                    "                                               @@@\n" +
                    "                                                @");
        }
        if (item.getName().equalsIgnoreCase("Buff of Spirit")) {
            System.out.println("                               _ -  / -  _\n" +
                    "                             -      /       -\n" +
                    "                           -        /         -\n" +
                    "                         -          /           -\n" +
                    "                        _           /            _\n" +
                    "                        _           /             _\n" +
                    "                      ( / / / / / / 0/ / / / / / / )\n" +
                    "                      0 _           /            _ 0\n" +
                    "                      #  _          /           _  #\n" +
                    "                      #   _         /          _   #\n" +
                    "                      #     _       /        _     #\n" +
                    "                      0        -  _ / _   -        0\n" +
                    "                     /I\\            0             /I\\\n" +
                    "                    //I\\\\           #            //I\\\\\n" +
                    "                    //I\\\\           #            //I\\\\\n" +
                    "                    //I\\\\           0            //I\\\\\n" +
                    "                     /I\\           /I\\            /I\\\n" +
                    "                      v           //I\\\\            v\n" +
                    "                                  //I\\\\\n" +
                    "                                  //I\\\\\n" +
                    "                                   /I\\");
            System.out.println("");
            if (player instanceof Warrior) {
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("                                             <<<<<<<<<<<< Not for Warrior >>>>>>>>>>>> ");
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("");
            }
        }
        if (item.getName().equalsIgnoreCase("Ice Blaster")) {
            System.out.println("                                               ()\n" +
                    "                                               /\\\n" +
                    "                                              //\\\\\n" +
                    "                                             <<  >>\n" +
                    "                                         ()   \\\\//   ()\n" +
                    "                               ()._____   /\\   \\\\   /\\   _____.()\n" +
                    "                                  \\.--.\\ //\\\\ //\\\\ //\\\\ /.--./\n" +
                    "                                   \\\\__\\\\/__\\//__\\//__\\\\/__//\n" +
                    "                                    '--/\\\\--//\\--//\\--/\\\\--'\n" +
                    "                                       \\\\\\\\///\\\\//\\\\\\////\n" +
                    "                                   ()-= >>\\\\< <\\\\> >\\\\<< =-()\n" +
                    "                                       ////\\\\\\//\\\\///\\\\\\\\\n" +
                    "                                    .--\\\\/--\\//--\\//--\\//--.\n" +
                    "                                   //\"\"/\\\\\"\"//\\\"\"//\\\"\"//\\\"\"\\\\\n" +
                    "                                  /'--'/ \\\\// \\\\// \\\\// \\'--'\\\n" +
                    "                                ()`\"\"\"`   \\/   //   \\/   `\"\"\"\"`()\n" +
                    "                                         ()   //\\\\   ()\n" +
                    "                                             <<  >>\n" +
                    "                                              \\\\//\n" +
                    "                                               \\/\n" +
                    "                                               ()");
            System.out.println("");
            if (player instanceof Warrior) {
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("                                             <<<<<<<<<<<< Not for Warrior >>>>>>>>>>>> ");
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("");
            }
        }
        if (item.getName().equalsIgnoreCase("Little Lightning")) {
            System.out.println("                                            zeeeeee-\n" +
                    "                                           z$$$$$$\"\n" +
                    "                                          d$$$$$$\"\n" +
                    "                                         d$$$$$P\n" +
                    "                                        d$$$$$P\n" +
                    "                                       $$$$$$\"\n" +
                    "                                     .$$$$$$\"\n" +
                    "                                    .$$$$$$\"\n" +
                    "                                   4$$$$$$$$$$$$$\"\n" +
                    "                                  z$$$$$$$$$$$$$\"\n" +
                    "                                  \"\"\"\"\"\"\"3$$$$$\"\n" +
                    "                                        z$$$$P\n" +
                    "                                       d$$$$\"\n" +
                    "                                     .$$$$$\"\n" +
                    "                                    z$$$$$\"\n" +
                    "                                   z$$$$P\n" +
                    "                                  d$$$$$$$$$$\"\n" +
                    "                                 *******$$$\"\n" +
                    "                                      .$$$\"\n" +
                    "                                     .$$\"\n" +
                    "                                    4$P\"\n" +
                    "                                   z$\"\n" +
                    "                                  zP\n" +
                    "                                 z\"\n" +
                    "                                /          '\n" +
                    "                               ^");
            System.out.println("");
            if (player instanceof Warrior) {
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("                                             <<<<<<<<<<<< Not for Warrior >>>>>>>>>>>> ");
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("");
            }

        }
            if (item.getName().equalsIgnoreCase("Fireblade !")) {
                System.out.println("                                                     (                           )\n" +
                        "                                               ) )( (                           ( ) )( (\n" +
                        "                                            ( ( ( )  ) )                     ( (   (  ) )(\n" +
                        "                                           ) )     ,,\\\\\\                     ///,,       ) (\n" +
                        "                                        (  ((    (\\\\\\\\//                     \\\\////)      )\n" +
                        "                                         ) )    (-(__//                       \\\\__)-)     (\n" +
                        "                                        (((   ((-(__||                         ||__)-))    ) )\n" +
                        "                                       ) )   ((-(-(_||           ```\\__        ||_)-)-))   ((\n" +
                        "                                       ((   ((-(-(/(/\\\\        ''; 9.- `      //\\)\\)-)-))    )\n" +
                        "                                        )   (-(-(/(/(/\\\\      '';;;;-\\~      //\\)\\)\\)-)-)   (   )\n" +
                        "                                     (  (   ((-(-(/(/(/\\======,:;:;:;:,======/\\)\\)\\)-)-))   )\n" +
                        "                                         )  '(((-(/(/(/(//////:%%%%%%%:\\\\\\\\\\\\)\\)\\)\\)-)))`  ( (\n" +
                        "                                        ((   '((-(/(/(/('uuuu:WWWWWWWWW:uuuu`)\\)\\)\\)-))`    )\n" +
                        "                                          ))  '((-(/(/(/('|||:wwwwwwwww:|||')\\)\\)\\)-))`    ((\n" +
                        "                                       (   ((   '((((/(/('uuu:WWWWWWWWW:uuu`)\\)\\))))`     ))\n" +
                        "                                             ))   '':::UUUUUU:wwwwwwwww:UUUUUU:::``     ((   )\n" +
                        "                                               ((      '''''''\\uuuuuuuu/``````         ))\n" +
                        "                                                ))            `JJJJJJJJJ`           ((\n" +
                        "                                                  ((            LLLLLLLLLLL         ))\n" +
                        "                                                    ))         ///|||||||\\\\\\       ((\n" +
                        "                                                      ))      (/(/(/(^)\\)\\)\\)       ((\n" +
                        "                                                       ((                           ))\n" +
                        "                                                         ((                       ((\n" +
                        "                                                           ( )( ))( ( ( ) )( ) (()");
                System.out.println("");
                if (player instanceof Warrior) {
                    System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                    System.out.println("                                             <<<<<<<<<<<< Not for Warrior >>>>>>>>>>>> ");
                    System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                    System.out.println("");
                }
            }

    }


//---------------------------END--------------------------------------
}
