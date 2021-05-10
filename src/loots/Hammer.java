package loots;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;
import menu.Warrior;
import menu.Wizard;

public class Hammer extends Item {

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public Hammer() { super("Hammer",5,0,0); }


    //------------------------------------ GETTERS & SETTERS  ------------------------------------------


    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    public void action(Character player){
        // add points attack
        if (player instanceof Warrior){
            int attack = (getAttackBonus() + player.getAttack());
            player.setAttack(attack);
        }

    }

    //-----------------------------------  END ----------------------------------
}
