package menu;

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
}
