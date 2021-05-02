package menu;
import menu.MenuGame;
import java.util.Scanner;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        System.err.println("-----------------------------------------------------------------------------------------");
        System.err.println("-----------------------------------------------------------------------------------------");
        System.err.println("---------------| ************     ***********       **        **  |--------------------- ");
        System.err.println("---------------| ***        **     ***      **      **       **   |--------------------- ");
        System.err.println("---------------| **         **      **       **     **      **    |--------------------- ");
        System.err.println("---------------| **        **        **       **    ***    **     |--------------------- ");
        System.err.println("---------------| ***********         **        **   *********     |--------------------- ");
        System.err.println("---------------| **        **        **        **   **      **    |--------------------- ");
        System.err.println("---------------| **         **      ***       **    **       **   |--------------------- ");
        System.err.println("---------------| **          **    ***********      **        **  |--------------------- ");
        System.err.println("-----------------------------------------------------------------------------------------");
        System.err.println("-----------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("                          Write 'Stop' to Leave the Game   ");
        System.out.println("");

        MenuGame LeMenu = new MenuGame();
        LeMenu.MenuChoixPerso();

    }
}
