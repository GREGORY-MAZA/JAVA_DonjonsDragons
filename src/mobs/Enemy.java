package mobs;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import menu.Character;

/** Class Enemy est la classe Parent abstraite de Dragon ,Gobelin et Orc.
 * Elle contient les attributs :
 * nom (String)  ,points de vie (int) ,points d'attaque (int)
 */

public abstract class Enemy {

    private String name;
    private int health;
    private int attack;


    //------------------------------------ CONSTRUCTORS ---------------------------------------

    /**
     *
     * @param name = Nom de l'ennemi (String)
     * @param health = points de vie de l'ennemi (int)
     * @param attack = point d'attaque de l'ennemi (int)
     */
    public Enemy(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;

    }


    //------------------------------------ GETTERS & SETTERS  ------------------------------------------

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() { return attack; }
    public void setAttack(int attack) {
        this.attack = attack;
    }

    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    public String toString() {
        return

                "     ENEMY : " + name +
                        "     HEALTH POINT : " + health +
                        "     STRENGTH : " + attack;
    }
    public abstract void action(Character player, Enemy pnj);
}
