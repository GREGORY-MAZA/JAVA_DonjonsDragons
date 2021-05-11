package loots;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;
import menu.Warrior;
import menu.Wizard;

public class Ice extends Item {

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public Ice() {
        super("Ice Blaster", 3, 0, 0);
    }


    //------------------------------------ GETTERS & SETTERS  ------------------------------------------


    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    public void action(Character player) {
        // add points attack
        if (player instanceof Wizard) {
            player.setAttackHand(this);
        }

    }

    //-----------------------------------  END ----------------------------------
}
