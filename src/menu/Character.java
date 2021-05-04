package menu;

    //-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

public class Character {

    private String name;
    private int health;
    private int attack;



    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public Character(String name, int health, int attack) {

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

                "     NICKNAME : " + name +
                        "     HEALTH POINT : " + health +
                        "     STRENGTH : " + attack;
    }

}
