package cases;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;
import mobs.Enemy;

public class EnemyCase extends Case {

    private Enemy enemyType;

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public EnemyCase (Enemy enemy){ super ("Ready to fight ? VERSUS " + enemy.getName());
        this.enemyType = enemy;
    }


    @Override
    public void action(Character player) {
        // greg/ /
    }

}
