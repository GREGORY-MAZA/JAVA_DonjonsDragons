package loots;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;
import menu.Warrior;
import menu.Wizard;

public class Shield extends Item {

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public Shield() {
        super("Shield  of Rage", 0, 0, 3);
    }


    //------------------------------------ GETTERS & SETTERS  ------------------------------------------


    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    public void action(Character player) {
        // add points protect

        if (player instanceof Warrior) {
            player.setDefenseHand(this);
        }

    }

    //-----------------------------------  END ----------------------------------
}
