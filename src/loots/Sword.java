package loots;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;
import menu.Warrior;

public class Sword extends Item {

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public Sword() { super("Sword",2,0,0); }


    //------------------------------------ GETTERS & SETTERS  ------------------------------------------


    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    public void action(Character player) {
        // add points attack
        if (player instanceof Warrior) {
            int attack = (getAttackBonus() + player.getAttack());
            player.setAttack(attack);
        }

    }

    //-----------------------------------  END ----------------------------------
}
