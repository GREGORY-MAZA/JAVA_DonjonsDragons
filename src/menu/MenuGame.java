package menu;

import java.util.Scanner;

public class MenuGame {

    private BoardGame HeroBoardGame;
    private DiceGame HeroDiceGame;
    private Tools tools = new Tools();
    private Weapon HeroWeapon;
    private Spell HeroSpell;
    private Defense HeroDefense;
    private Buff HeroBuff;
    private Character HeroCharacter;
    private Character HeroCharacter2;
    private ItemSkill HeroItemSkill;


    public MenuGame() {

        HeroDiceGame = null;
        HeroBoardGame = null;
        HeroWeapon = null;
        HeroSpell = null;
        HeroDefense = null;
        HeroBuff = null;
        HeroCharacter = null;
        HeroItemSkill = null;
    }

    public void MenuChoixPerso() {

        String Wawa = "Warrior";
        String Wiwi = "Wizard";


        System.out.println("                     ************************************************************");
        System.out.println("          * * * * * * *  If you want play a new adventure write " + Wawa + " or " + Wiwi + " * * * * * * *");
        System.out.println("                     ************************************************************");

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

        System.err.println("          -----------------------------------------------------------------------------------------");
        System.out.println("                              ______________________________________________");
        System.out.println("                             |                                              |");
        System.out.println("                             |                   " + LeChoix + " !       ");
        System.out.println("                             |                                              |");
        System.out.println("                              ______________________________________________");
        System.out.println("");

        Tools.waitSec(1);

        System.err.println("          -----------------------------------------------------------------------------------------");
        System.out.println("                                       Choose your name " + LeChoix);
        Scanner ChoixName = new Scanner(System.in);
        String LeChoixDuName = ChoixName.nextLine();


        if (LeChoixDuName.equalsIgnoreCase("Stop")) {
            Tools.StopGame();
        }

        Tools.waitSec(1);

        System.out.println("          ==============================================================================================");
        System.out.println(" ");
        System.out.println("            *************   *************   **************   *************   **       **   **************  ");
        System.out.println("             **              **         **   **    **    **   **         **   **       **   **                    ");
        System.out.println("              **              **         **   **    **    **   **         **   **       **   **               ");
        System.out.println("               **              **         **   **    **    **   ***********     **       **   **************                      ");
        System.out.println("                **              *************   **    **    **   **              **       **               **      ");
        System.out.println("                 **              **         **   **    **    **   **              **       **               **         ");
        System.out.println("                  *************   **         **   **    **    **   **              ***********   **************                     ");
        System.out.println("");
        System.out.println("                   =============================================================================================");

        Tools.waitSec(1);

        if (LeChoix.equalsIgnoreCase("Warrior")) {
            HeroCharacter = new Warrior(LeChoixDuName);
            HeroWeapon = new Weapon("Hands", 0);
            HeroDefense = new Defense("Empty",0);
            System.out.println("          _______________________________________________________________________________________________________________________");
            System.out.println("");
            System.out.println(HeroCharacter.toString());
            System.out.println("");
            System.out.println(HeroWeapon.toString());
            System.out.println(HeroDefense.toString());
            System.out.println("");
            System.out.println("          _______________________________________________________________________________________________________________________");
            System.out.println("");
            System.out.println("");

        }

        if (LeChoix.equalsIgnoreCase("Wizard")) {
            HeroCharacter = new Wizard(LeChoixDuName);
            HeroSpell = new Spell("Hands",0);
            HeroBuff = new Buff("Empty",0);
            System.out.println("");
            System.out.println("          _______________________________________________________________________________________________________________________");
            System.out.println("");
            System.out.println(HeroCharacter.toString());
            System.out.println("");
            System.out.println(HeroSpell.toString());
            System.out.println(HeroBuff.toString());
            System.out.println("");
            System.out.println("          _______________________________________________________________________________________________________________________");
        }
        System.err.println("          -----------------------------------------------------------------------------------------");
        System.err.println("                                           Start a new game ?");
        System.err.println("          -----------------------------------------------------------------------------------------");
        System.err.println(" ");
        System.err.println(" ");
        System.err.println("                                             yes or no ? ");


        Scanner StartNewGame = new Scanner(System.in);
        String RepStartNewGame = StartNewGame.nextLine();

        if (RepStartNewGame.equalsIgnoreCase("yes")) {
            HeroBoardGame = new BoardGame(1);

            System.err.println("          -----------------------------------------------------------------------------------------");
            System.err.println("                                              ONCE UPON A TIME");
            System.err.println("          -----------------------------------------------------------------------------------------");
            System.err.println("");
            System.err.println("                         A long time ago a " + LeChoix + " named " + LeChoixDuName + " did a quest .... ");
            System.err.println("                               The great epic quest of 'The Digital Campus student' ...");
            System.err.println("");
            System.err.println("          -----------------------------------------------------------------------------------------");
            //System.out.println(HeroBoardGame.toString());
            System.out.println("");
            //System.out.println("It's time to roll the dice....    " + LeChoixDuName );
            System.out.println("");
            HeroDiceGame = new DiceGame(0);
            HeroBoardGame = new BoardGame(1);

            while (HeroBoardGame.getSquarePlayer() < 64) {
                System.out.println(HeroBoardGame);
                System.out.println("");
                System.out.println("                          Do you want roll the dice ?      yes / no");
                Scanner RepRerollDice = new Scanner(System.in);
                String ChoiceRerollDice = RepRerollDice.nextLine();
                if (ChoiceRerollDice.equalsIgnoreCase("yes")) {

                    int repDice = Tools.RollTheDice();
                    //Tools.waitSec(1);
                    HeroBoardGame.setSquarePlayer(HeroBoardGame.getSquarePlayer() + repDice);
                    //Tools.waitSec(1);

                }
                if (ChoiceRerollDice.equalsIgnoreCase("no")) {
                    Tools.StopGame();
                }
            }


            if (RepStartNewGame.equalsIgnoreCase("no")) {
                Tools.StopGame();
            }

            if (HeroBoardGame.getSquarePlayer() >= 64) ;
            HeroBoardGame.setSquarePlayer(64);
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

        }

    }
}
