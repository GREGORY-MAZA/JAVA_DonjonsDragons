package cases;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import loots.Axe;
import loots.Item;
import menu.*;
import menu.Character;
import mobs.Enemy;
import menu.BoardGame;

/** Classe ChestCase qui permet de créer un Objet ChestCase qui hérite de la classe abstraite Case
 * @see Case
 */

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
        super ("                       = = = = = = = = = = =| NEW ITEM " + item.getName() + " |= = = = = = = = = = = = ");
        this.item =item;
    }

    /**
     * Fonction action qui permet de renvoyer un System.out.println avec le texte souhaité
     * @param player
     * prend en parametre player
     */
    @Override
    public void action(Character player) {
        System.out.println("     ---------<<<<| NEW ITEM " + item.getName() + ">>>>>---------");
        item.action(player);
    }

//---------------------------END--------------------------------------
}
