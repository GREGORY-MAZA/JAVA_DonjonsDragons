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
        while ((!LeChoix.equals("Warrior")) && (!LeChoix.equals( "Wizard"))) {
            System.out.println("Please Choose Warrior or Wizard");
            LeChoix=ChoixPerso.nextLine();
        }
        Tools.waitSec(2);
        System.out.println("______________________________________________");
        System.out.println("    Very nice choice Mister " + LeChoix + " !         |" );
        System.out.println("______________________________________________|");
        System.out.println("");

        Tools.waitSec(2);
        System.out.println("Choose your name " + LeChoix);
        Scanner ChoixName = new Scanner(System.in);
        String LeChoixDuName=ChoixName.nextLine();
        Tools.waitSec(2);
        System.out.println("Really ? " + LeChoixDuName + " ....... let me see");
        Tools.waitSec(3);
        System.out.println("Tu vas à l'école et tu habites en Auvergne Rhône Alpes " + LeChoixDuName + " .....");









    }
}
