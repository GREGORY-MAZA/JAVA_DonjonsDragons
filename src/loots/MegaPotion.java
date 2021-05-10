package loots;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;
import menu.Wizard;

public class MegaPotion extends Item {

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public MegaPotion() { super("Mega Potion Heal ! ",0,5,0); }


    //------------------------------------ GETTERS & SETTERS  ------------------------------------------


    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    public void action(Character player){
        // add points Health

        int health = (getHealthBonus() + player.getHealth());
            player.setHealth(health);
    }

    //-----------------------------------  END ----------------------------------
}
