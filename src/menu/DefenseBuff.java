package menu;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

public class DefenseBuff extends ItemSkill {

    private int protection;

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public DefenseBuff(String name) { super(name); }
    public DefenseBuff(int protection) { this.protection = protection; }

    //------------------------------------ GETTERS & SETTERS  ------------------------------------------

    public int getProtection() { return protection; }
    public void setProtection(int protection) { this.protection = protection; }

    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    @Override
    public String toString() {
        return
                "     ARMOR / BUFF : " + getName() +
                "     DEFENSE : " + protection + " Points";
    }


    //------------------------- END -------------------------------------
}
