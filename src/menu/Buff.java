package menu;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

public class Buff extends ItemSkill {

    //private String color;

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public Buff(){super();}
    public Buff(String name) {
        super(name);
    }
    public Buff(String name , int Level) { super(name,Level);}
    public Buff(String name , int Level , String color) {super(name,Level,color);}

    ///////////////////////// Pour le passer directement avec Buff /////////////////////
/*
    public Buff(String name , int Level , String color) { super(name,Level);
    this.color = color;
    }
*/
    //------------------------------------ GETTERS & SETTERS  ------------------------------------------
    ///////////////////////// Pour le passer directement avec Buff /////////////////////

    /*public int getBuffProtect() {
        return BuffProtect;
    }

    public void setBuffProtect(int BuffProtect) {
        this.BuffProtect = buffDamage;
    }*/

    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    @Override
    public String toString() {
        return
                        "                               BUFF : " + getName() +
                        "                               PROTECT : " + getLevel() + " Points";
    }


    //------------------------------------ END ---------------------------------------
}
