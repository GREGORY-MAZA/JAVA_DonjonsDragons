package cases;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Buff;
import menu.Character;
import menu.Defense;
import menu.Spell;
import menu.Weapon;
import mobs.Enemy;

public class ChestCase extends Case {

    private Weapon weaponChest;
    private Spell spellChest;
    private Defense defenseChest;
    private Buff buffChest;


    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public ChestCase (Weapon weapon){ super ("This is a New Weapon ! " + weapon.getName());
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
    }

    @Override
    public void action(Character player) {

    }

//---------------------------END--------------------------------------
}
