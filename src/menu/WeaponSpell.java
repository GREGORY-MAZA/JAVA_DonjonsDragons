package menu;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

public class WeaponSpell {

    private String name;
    private int dammage;

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public WeaponSpell(String name,int dammage) {
        this.name = name;
        this.dammage = dammage;

    }

    //------------------------------------ GETTERS & SETTERS  ------------------------------------------


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void setDammage(int dammage) { this.dammage = dammage; }
    public int getDammage() { return dammage; }

    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    @Override
    public String toString() {
        return
                "WEAPON / SPELL : " + name +
                "DAMAGE : " + dammage + " Points";
    }


    //------------------------- END -------------------------------------
}
