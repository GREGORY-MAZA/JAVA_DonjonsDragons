package loots;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import cases.ChestCase;
import menu.Character;
//import menu.ItemSkill;
import menu.Warrior;
//import menu.Weapon;
import loots.Item;
import menu.MenuGame;

public class Axe extends Item {

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public Axe() { super("Axe",3,0,0); }


    //------------------------------------ GETTERS & SETTERS  ------------------------------------------


    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    public void action(Character player) {
        // add points attack
        if (player instanceof Warrior) {
            /*int attack = (getAttackBonus() + player.getAttack());
            String itemName = getName();
            player.setAttack(attack);*/
            player.setAttackHand(this);




            /*System.out.println(" ====================    Beautiful ! new item for you : " + itemName + "    ====================");
            System.out.println("");
            System.out.println(" --------------------        Your STRENGTH is now : " +attack + "     --------------------");
            System.out.println("");*/
        }
    }
    //-----------------------------------  END ----------------------------------
}