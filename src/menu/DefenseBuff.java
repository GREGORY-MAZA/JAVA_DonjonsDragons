package menu;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

public class DefenseBuff {

    private String name;
    private int protection;

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public DefenseBuff(String name, int protection) {
        this.name = name;
        this.protection = protection;

    }

    //------------------------------------ GETTERS & SETTERS  ------------------------------------------

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getProtection() { return protection; }
    public void setProtection(int protection) { this.protection = protection; }

    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    @Override
    public String toString() {
        return
                "ARMOR / BUFF : " + name +
                "DEFENSE : " + protection + " Points";
    }


    //------------------------- END -------------------------------------
}
