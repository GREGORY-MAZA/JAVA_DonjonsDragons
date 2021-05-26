package mobs;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import loots.Item;
import menu.Character;

/** Classe Dragon qui permet de créer un Objet Dragon qui hérite de la classe abstraite Enemy
 * @see Enemy
 */

public class Dragon extends Enemy {


//------------------------------------ CONSTRUCTORS ---------------------------------------

    /**
     * Constructeur de l'Objet Dragon qui hérite de la classe abstraite Enemy
     */

    public Dragon() { super("Dragon",15,5,50); }


//------------------------------------ GETTERS & SETTERS  ------------------------------------------




//------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    @Override
    public void action(Character player , Enemy pnj){
        while (pnj.getHealth() > 0 && player.getHealth() > 0) {
            System.out.println("You hit Dragon ! ");
            pnj.setHealth(pnj.getHealth()- player.getAttack());
            player.setHealth(player.getHealth() - pnj.getAttack());
        }
        if (pnj.getHealth() < 0){
            System.out.println("Dragon die");
        }
        if (player.getHealth() < 0){
            System.out.println(" you loose ");
        }
    }

    //------------------------------------ END  ------------------------------------------
}

