package loots;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;
import menu.Wizard;

public class Fire extends Item {

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public Fire() { super("Fireblade !",5,0,0); }


    //------------------------------------ GETTERS & SETTERS  ------------------------------------------


    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    public void action(Character player){
        // add points attack
        if (player instanceof Wizard){
            int attack = (getAttackBonus() + player.getAttack());
            player.setAttack(attack);
        }

    }

    //-----------------------------------  END ----------------------------------
}
