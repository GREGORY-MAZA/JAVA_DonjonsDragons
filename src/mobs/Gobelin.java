package mobs;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;

/** Classe Gobelin qui permet de créer un Objet Gobelin qui hérite de la classe abstraite Enemy
 * @see Enemy
 */

public class Gobelin extends Enemy {


//------------------------------------ CONSTRUCTORS ---------------------------------------

    /**
     * Constructeur de l'Objet Gobelin qui hérite de la classe abstraite Enemy
     */

    public Gobelin() { super("Gobelin",10,1); }


//------------------------------------ GETTERS & SETTERS  ------------------------------------------




//------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    @Override
    public void action(Character player , Enemy pnj){
        while (pnj.getHealth() > 0 && player.getHealth() > 0) {
            System.out.println("You hit Gobelin ! ");
            pnj.setHealth(pnj.getHealth()- player.getAttack());
            player.setHealth(player.getHealth() - pnj.getAttack());
        }
        if (pnj.getHealth() < 0){
            System.out.println("Gobelin die");
        }
        if (player.getHealth() < 0){
            System.out.println(" you loose ");
        }
    }

    //------------------------------------ END  ------------------------------------------
}
