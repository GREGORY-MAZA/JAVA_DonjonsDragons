package menu;

import javax.swing.*;
import menu.MenuGame;

public class Tools {


    // Call a loading event for "x" secondes
    public static void waitSec(int second) {
        try
        {
            System.out.println();

            for (int i = 0; i < second; i++) {;
                Thread.sleep(1000);

            }
            System.out.println();
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

    }

    public static void StopGame() {

        System.out.println("          _________________________________________________________________________________________");
        System.out.println(" ");
        System.out.println("                                  You can come back later My friend.....");
        System.out.println(" ");
        System.out.println("          _________________________________________________________________________________________");
        System.exit(0);
    }

    public static int RollTheDice() {
       int DiceGameFace = (int) (Math.random()*6 + 1);
        System.err.println("=======================================================================================================");
        System.err.println("                             You roll the dice ! : " + DiceGameFace);
        System.err.println("=======================================================================================================");
        return DiceGameFace;
    }



}
