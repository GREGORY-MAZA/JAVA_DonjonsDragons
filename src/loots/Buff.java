package loots;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;
import menu.Wizard;

public class Buff extends Item {

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public Buff() {
        super("Buff of Spirit", 0, 0, 3);
    }


    //------------------------------------ GETTERS & SETTERS  ------------------------------------------


    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    public void action(Character player) {
        // add points protect
        if (player instanceof Wizard) {
            player.setDefenseHand(this);
        }

    }

    //-----------------------------------  END ----------------------------------
}
