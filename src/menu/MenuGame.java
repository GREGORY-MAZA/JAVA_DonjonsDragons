package menu;

import cases.Case;
import loots.Hand;
import loots.Item;
import mobs.Enemy;

import java.sql.Statement;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import menu.Database;

public class MenuGame {

    private BoardGame HeroBoardGame;
    private DiceGame HeroDiceGame;
    private Tools tools = new Tools();
    private Item HeroBuff;
    private Character HeroCharacter;
    private Character HeroCharacter2;
    private Database database;


    public MenuGame() {

        HeroDiceGame = null;
        HeroBoardGame = null;
        HeroBuff = null;
        HeroCharacter = null;
        database = new Database();
    }

    public void MenuChoixPerso() {

        String Wawa = "Warrior";
        String Wiwi = "Wizard";

        database.showAllHeroes();
        System.out.println("**********************************************************************************************************");
        System.out.println("          * * * * * * *  If you want to play a new adventure type " + Wawa + " or " + Wiwi + " * * * * * * *");
        System.out.println("**********************************************************************************************************");

        Scanner ChoixPerso = new Scanner(System.in); // Demander une Entré clavier
        String LeChoix = ChoixPerso.nextLine(); // Récupère la chaine de caractere

        while ((!LeChoix.equalsIgnoreCase("Warrior")) && (!LeChoix.equalsIgnoreCase("Wizard")) && (!LeChoix.equalsIgnoreCase("Stop"))) {

            System.out.println("Please Choose Warrior or Wizard");
            LeChoix = ChoixPerso.nextLine();

        }
        if (LeChoix.equalsIgnoreCase("Stop")) {
            Tools.StopGame();
        }


        Tools.waitSec(1);


        System.out.println("                              ______________________________________________");
        System.out.println("                             |                                              |");
        System.out.println("                             |                   " + LeChoix + " !       ");
        System.out.println("                             |                                              |");
        System.out.println("                              ______________________________________________");
        System.out.println("");

        Tools.waitSec(1);

        System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println("");
        System.out.println("            ******       ***   ************   ******   *******   ***************         ******************                                                                      ");
        System.out.println("           *** ***      ***   ***      ***   *** ***  **  ***   ***         ***         ***            ***                                   ");
        System.out.println("          ***  ***     ***   ***      ***   ***  *** **  ***   ***         ***                        ***                                  ");
        System.out.println("         ***   ***    ***   ***      ***   ***   *****  ***   ***         ***                ***********                                    ");
        System.out.println("        ***    ***   ***   ************   ***    ****  ***   ***************                ***                                     ");
        System.out.println("       ***     ***  ***   ***      ***   ***           ***  ***                            ***                                ");
        System.out.println("      ***      *** ***   ***      ***   ***           ***  ***                                                           ");
        System.out.println("     ***       ******   ***      ***   ***           ***  ***************                ***                                                    ");
        System.out.println("");
        System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        Scanner ChoixName = new Scanner(System.in);
        String LeChoixDuName = ChoixName.nextLine();


        if (LeChoixDuName.equalsIgnoreCase("Stop")) {
            Tools.StopGame();
        }


        Tools.waitSec(1);

        System.out.println("==============================================================================================");
        System.out.println(" ");
        System.out.println("  *************   *************   **************   *************   **       **   **************  ");
        System.out.println("   **              **         **   **    **    **   **         **   **       **   **                    ");
        System.out.println("    **              **         **   **    **    **   **         **   **       **   **               ");
        System.out.println("     **              **         **   **    **    **   ***********     **       **   **************                      ");
        System.out.println("      **              *************   **    **    **   **              **       **               **      ");
        System.out.println("       **              **         **   **    **    **   **              **       **               **         ");
        System.out.println("        *************   **         **   **    **    **   **              ***********   **************                     ");
        System.out.println("");
        System.out.println("=============================================================================================");

        Tools.waitSec(1);

        if (LeChoix.equalsIgnoreCase("Warrior")) {
            HeroCharacter = new Warrior(LeChoixDuName);
        }
        if (LeChoix.equalsIgnoreCase("Wizard")) {
            HeroCharacter = new Wizard(LeChoixDuName);
        }
        System.out.println("                                                       -----===== HERO =====-----");
        System.out.println(" ");
        System.out.println(HeroCharacter.toString());
        System.out.println("");
        System.out.println("                                                     -----===== RIGHT HAND =====-----");
        System.out.println(" ");
        System.out.println(HeroCharacter.getAttackHand().toString());
        System.out.println("");
        System.out.println("                                                     -----===== LEFT  HAND =====-----");
        System.out.println(" ");
        System.out.println(HeroCharacter.getDefenseHand().toString());
        System.out.println("");
        System.out.println("          _______________________________________________________________________________________________________________________");
        System.out.println("");
        System.out.println("");

        System.err.println("                               =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.err.println("                               =-=-=-=-=-=-=-=       Start a new game ?        =-=-=-=-=-=-=-=");
        System.err.println("                               =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.err.println(" ");
        System.err.println("                    ***     ***   ************   ************            ******       ***   ************                                                                         ");
        System.err.println("                    ***    ***   ************   ************            *** ***      ***   ************                                                       ");
        System.err.println("                    ***   ***   **             **                      ***  ***     ***   ***      ***                              ");
        System.err.println("                     *** ***   *******        ************            ***   ***    ***   ***      ***                                          ");
        System.err.println("                       ****   *******        ************            ***    ***   ***   ***      ***                                         ");
        System.err.println("                       ***   **                       **            ***     ***  ***   ***      ***                              ");
        System.err.println("                      ***   ************   ************            ***      *** ***   ************                                                        ");
        System.err.println("                     ***   ************   ************            ***       ******   ************                                                                   ");
        System.err.println(" ");


        Scanner StartNewGame = new Scanner(System.in);
        String RepStartNewGame = StartNewGame.nextLine();

        if (RepStartNewGame.equalsIgnoreCase("yes")) {
            database.saveHero(HeroCharacter);
            System.err.println("                               =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.err.println("                                                   ONCE UPON A TIME");
            System.err.println("                               =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.err.println("");
            System.err.println("                               .......A long time ago a " + LeChoix + " named " + LeChoixDuName + " did a quest .... ");
            System.err.println("                               ......The great epic quest of 'The Digital Campus student' ...");
            System.err.println("");
            System.err.println("                               =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("");
            System.out.println("");
            HeroDiceGame = new DiceGame(0);
            HeroBoardGame = new BoardGame();
            Collections.shuffle(HeroBoardGame.getLeNomDeLaListe(), new Random());

            while (HeroBoardGame.getIndex() < 64) {
                System.out.println(HeroBoardGame.toString());
                System.out.println("");
                System.out.println("                              =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("                                          Do you want roll the dice ?      yes / no");
                System.out.println("                              =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("                                                       _______            \n" +
                        "                                                     /\\       \\           \n" +
                        "                                                    /()\\   ()  \\          \n" +
                        "                                                   /    \\_______\\         \n" +
                        "                                                   \\    /()     /         \n" +
                        "                                                    \\()/   ()  /          \n" +
                        "                                                     \\/_____()/");
                System.out.println("");

                Scanner RepRerollDice = new Scanner(System.in);
                String ChoiceRerollDice = RepRerollDice.nextLine();
                if (ChoiceRerollDice.equalsIgnoreCase("yes")) {

                    int repDice = Tools.RollTheDice();
                    HeroBoardGame.setIndex(HeroBoardGame.getIndex() + repDice);

                    if (HeroBoardGame.getIndex() >= 64) {
                        ;
                        HeroBoardGame.setIndex(64);
                        System.out.println("          Congratulation ! You Win " + LeChoixDuName);
                        System.out.println("");
                        Tools.waitSec(2);
                        System.err.println("          ****************   **      **  ***********     *********  ***      **  ***********            ");
                        System.err.println("                 **          **      **  **              **         ****     **    **       **                ");
                        System.err.println("                 **          **      **  **              **         ** **    **     **       **               ");
                        System.err.println("                 **          **********  ********        ******     **  **   **      **       **                ");
                        System.err.println("                 **          **      **  **              **         **   **  **      **       **              ");
                        System.err.println("                 **          **      **  **              **         **    ** **     **       **               ");
                        System.err.println("                 **          **      **  **              **         **     ****    **       **                ");
                        System.err.println("                 **          **      **  ***********     *********  **      ***   *********                         ");

                    } else {


                        Case HeroCase = HeroBoardGame.getLeNomDeLaListe().get(HeroBoardGame.getIndex()); // case du hero ATM
                        HeroCase.action(HeroCharacter);
                        System.out.println(HeroCharacter.toString());
                        System.out.println("");
                        System.out.println(HeroCharacter.getAttackHand().toString());
                        System.out.println(HeroCharacter.getDefenseHand().toString());
                        System.out.println("");
                        //System.out.println(HeroBoardGame.getLeNomDeLaListe().get(HeroBoardGame.getIndex()).getDescription());
                        //HeroBoardGame.getLeNomDeLaListe().get(HeroBoardGame.getIndex()).action(HeroCharacter);
                    }

                }
                if (ChoiceRerollDice.equalsIgnoreCase("no")) {
                    Tools.StopGame();
                }
            }


            if (RepStartNewGame.equalsIgnoreCase("no")) {
                Tools.StopGame();
            }


        }
    }
}
