package menu;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

public class ItemSkill {
    private String name;

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public ItemSkill() {

    }

    public ItemSkill(String name) {
        this.name = name;
    }

    public ItemSkill(String name, int damage) {
    }


    //------------------------------------ GETTERS & SETTERS  ------------------------------------------

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    @Override
    public String toString() {
        return
                "     toString de ItemSkill   ";
    }


    //------------------------------------ END ---------------------------------------
}
