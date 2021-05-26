package menu;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        //database.showAllHeroes();


        System.err.println("          -----------------------------------------------------------------------------------------");
        System.err.println("          -----------------------------------------------------------------------------------------");
        System.err.println("          ---------------| ************     ***********       **        **  |--------------------- ");
        System.err.println("          ---------------| ***        **     ***      **      **       **   |--------------------- ");
        System.err.println("          ---------------| **         **      **       **     **      **    |--------------------- ");
        System.err.println("          ---------------| **        **        **       **    ***    **     |--------------------- ");
        System.err.println("          ---------------| ***********         **        **   *********     |--------------------- ");
        System.err.println("          ---------------| **        **        **        **   **      **    |--------------------- ");
        System.err.println("          ---------------| **         **      ***       **    **       **   |--------------------- ");
        System.err.println("          ---------------| **          **    ***********      **        **  |--------------------- ");
        System.err.println("          -----------------------------------------------------------------------------------------");
        System.err.println("          -----------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("                                   Write 'Stop' to Leave the Game   ");
        System.out.println("");



        MenuGame LeMenu = new MenuGame();
        LeMenu.MenuChoixPerso();

    }
}
