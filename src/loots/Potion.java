package loots;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;

public class Potion extends Item {

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public Potion() { super("Little Potion of health",0,2,0); }


    //------------------------------------ GETTERS & SETTERS  ------------------------------------------


    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    public void action(Character player){
        // add points Health

        int health = (getHealthBonus() + player.getHealth());
        player.setHealth(health);
    }

    //-----------------------------------  END ----------------------------------
}
