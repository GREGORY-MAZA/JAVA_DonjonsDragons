package menu;

import javax.swing.*;

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

        System.out.println("          _______________________________________");
        System.out.println("           You can come back later My friend.....");
        System.out.println("          _______________________________________");
        System.exit(0);
    }




}
