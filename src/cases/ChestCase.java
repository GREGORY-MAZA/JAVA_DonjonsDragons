package cases;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import loots.Item;
import menu.*;
import menu.Character;
import mobs.Enemy;

public class ChestCase extends Case {

    //private Weapon weaponChest;
    //private Spell spellChest;
    //private Defense defenseChest;
    //private Buff buffChest;

    private Item item;


    //------------------------------------ CONSTRUCTORS ---------------------------------------

    /*public ChestCase (Weapon weapon){ super ("This is a New Weapon ! " + weapon.getName());
        this.weaponChest = weapon;
    }

    public ChestCase (Spell spell){ super ("This is a New Spell ! " + spell.getName());
        this.spellChest = spell;
    }

    public ChestCase (Defense defense){ super ("This is a New Defense ! " + defense.getName());
        this.defenseChest = defense;
    }

    public ChestCase (Buff buff){ super ("This is a New Buff ! " + buff.getName());
        this.buffChest = buff;
    }*/

    public ChestCase (Item item){
        super ("This a ITEM ! " + item.getName());
        this.item =item;
    }


    @Override
    public void action(Character player) {
        System.out.println("super un coffre " + item.getName());
        //item.action(player);

    }

//---------------------------END--------------------------------------
}
