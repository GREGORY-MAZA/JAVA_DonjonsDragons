package menu;

import java.util.Scanner;

public class MenuGame {
    public static void MenuChoixPerso() {

        String Wawa = "Warrior";
        String Wiwi = "Wizard";

        System.out.println("           *******************************************************");
        System.out.println("            * * * * * * *  Choose " + Wawa + " or " +Wiwi + " * * * * * * *");
        System.out.println("           *******************************************************");

        Scanner ChoixPerso = new Scanner(System.in); // Demander une Entré clavier
        String LeChoix=ChoixPerso.nextLine(); // Récupère la chaine de caractere

        while ((!LeChoix.equalsIgnoreCase("Warrior")) && (!LeChoix.equalsIgnoreCase( "Wizard")) && (!LeChoix.equalsIgnoreCase("Stop"))) {

            System.out.println("Please Choose Warrior or Wizard");
            LeChoix=ChoixPerso.nextLine();

        }
        if (LeChoix.equalsIgnoreCase("Stop")){
            Tools.StopGame();
        }

        Tools.waitSec(1);

        System.out.println("______________________________________________");
        System.out.println("    Very nice choice Mister " + LeChoix + " !         |" );
        System.out.println("______________________________________________|");
        System.out.println("");

        Tools.waitSec(1);

        System.out.println("Choose your name " + LeChoix);
        Scanner ChoixName = new Scanner(System.in);
        String LeChoixDuName=ChoixName.nextLine();


        if (LeChoixDuName.equalsIgnoreCase("Stop")){
            Tools.StopGame();
        }

        Tools.waitSec(1);


        System.out.println("Really ? " + LeChoixDuName + " ....... let me see");

        Tools.waitSec(2);

        System.out.println("let me show you your character information ! " + LeChoixDuName + " .....");
        System.out.println("=========================================================================================");
        System.out.println("");
        System.out.println("  *************   *************   **************   *************   **       **   **************  ");
        System.out.println("   **              **         **   **    **    **   **         **   **       **   **                    ");
        System.out.println("    **              **         **   **    **    **   **         **   **       **   **               ");
        System.out.println("     **              **         **   **    **    **   ***********     **       **   **************                      ");
        System.out.println("      **              *************   **    **    **   **              **       **               **      ");
        System.out.println("       **              **         **   **    **    **   **              **       **               **         ");
        System.out.println("        *************   **         **   **    **    **   **              ***********   **************                     ");
        System.out.println("");
        System.out.println("=========================================================================================");

        if (LeChoix.equalsIgnoreCase("Warrior")){
            Warrior HeroWarrior = new Warrior(LeChoixDuName,5,5,"sword", "shield");
            System.out.println("___________________________________________________________________________________");
            System.out.println("");
            System.out.println(HeroWarrior.toString());
            System.out.println("");
            System.out.println("___________________________________________________________________________________");
        }

        if (LeChoix.equalsIgnoreCase("Wizard")){
            Wizard HeroWizard = new Wizard(LeChoixDuName,5,5,"fire", "armor");
            System.out.println("___________________________________________________________________________________");
            System.out.println("");
            System.out.println(HeroWizard.toString());
            System.out.println("");
            System.out.println("___________________________________________________________________________________");
        }
    }
}
