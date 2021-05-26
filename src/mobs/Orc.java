package mobs;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Warrior;
import mobs.Enemy;
import loots.Item;
import menu.Character;
/** Classe Orc qui permet de créer un Objet Orc qui hérite de la classe abstraite Enemy
 * @see Enemy
 */

public class Orc extends Enemy {


//------------------------------------ CONSTRUCTORS ---------------------------------------

    /**
     * Constructeur de l'Objet Orc qui hérite de la classe abstraite Enemy
     */

    public Orc() {
        super("Orc", 12, 2 , 30);
    }


//------------------------------------ GETTERS & SETTERS  ------------------------------------------


//------------------------------------ FUNCTION TOSTRING  ------------------------------------------
    @Override
    public void action(Character player ,Enemy pnj){
        while (pnj.getHealth() > 0 && player.getHealth() > 0) {
        System.out.println("You hit ORC ! ");
        pnj.setHealth(pnj.getHealth()- player.getAttack());
        player.setHealth(player.getHealth() - pnj.getAttack());
        }
        if (pnj.getHealth() < 0){
            System.out.println("Orc die");
        }
        if (player.getHealth() < 0){
            System.out.println(" you loose ");
        }
    }


    //------------------------------------ END  ------------------------------------------
}
