package cases;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;
import mobs.Enemy;

/**
 * Classe EmptyCase qui permet de créer un Objet EmptyCase qui hérite de la classe abstraite Case
 *
 * @see Case
 */

public class EmptyCase extends Case {

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public EmptyCase() {
        super("       This is a Empty case !");
    }

    /**
     * Fonction action qui permet de renvoyer un System.out.println avec le texte souhaité
     *
     * @param player prend en parametre player
     */

    @Override
    public void action(Character player) {
        System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println("       <<<<<< You enter an emptu Room ...... So dark Here ! You must walk in the dust >>>>>>> ");
        System.out.println("                       <<<<<< You found Experience points HERE >>>>>>> ");
        System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println("");
        System.out.println("                                      _____________________________________________\n" +
                "                                     |.'',                                     ,''.|\n" +
                "                                     |.'.'',                                 ,''.'.|\n" +
                "                                     |.'.'.'',                             ,''.'.'.|\n" +
                "                                     |.'.'.'.'',                         ,''.'.'.'.|\n" +
                "                                     |.'.'.'.'.|                         |.'.'.'.'.|\n" +
                "                                     |.'.'.'.'.|===;                 ;===|.'.'.'.'.|\n" +
                "                                     |.'.'.'.'.|:::|',             ,'|:::|.'.'.'.'.|\n" +
                "                                     |.'.'.'.'.|---|'.|, _______ ,|.'|---|.'.'.'.'.|\n" +
                "                                     |.'.'.'.'.|:::|'.|'|???????|'|.'|:::|.'.'.'.'.|\n" +
                "                                     |,',',',',|---|',|'|???????|'|,'|---|,',',',',|\n" +
                "                                     |.'.'.'.'.|:::|'.|'|???????|'|.'|:::|.'.'.'.'.|\n" +
                "                                     |.'.'.'.'.|---|','   /%%%\\   ','|---|.'.'.'.'.|\n" +
                "                                     |.'.'.'.'.|===:'    /%%%%%\\    ':===|.'.'.'.'.|\n" +
                "                                     |.'.'.'.'.|%%%%%%%%%%%%%%%%%%%%%%%%%|.'.'.'.'.|\n" +
                "                                     |.'.'.'.','       /%%%%%%%%%\\       ','.'.'.'.|\n" +
                "                                     |.'.'.','        /%%%%%%%%%%%\\        ','.'.'.|\n" +
                "                                     |.'.','         /%%%%%%%%%%%%%\\         ','.'.|\n" +
                "                                     |.','          /%%%%%%%%%%%%%%%\\          ','.|\n" +
                "                                     |;____________/%%%%%%%%%%%%%%%%%\\____________;|");
        System.out.println("");

        player.setExperience(player.getExperience() + 10);
        if (player.getExperience() >= 100){
            player.setExperience(player.getExperience() - 100);
            player.setLevel(player.getLevel() + 1);
            System.out.println("o====[]============> YOU ARE NOW LEVEL " + player.getLevel() + "<============[]====o");
        }
    }


    //------------------------------------ END ---------------------------------------
}
