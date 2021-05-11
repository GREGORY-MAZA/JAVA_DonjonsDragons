package loots;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;
import menu.Wizard;

public class Lightning extends Item {

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public Lightning() {
        super("Little Lightning", 2, 0, 0);
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
