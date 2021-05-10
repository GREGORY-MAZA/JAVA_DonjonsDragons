package cases;

import menu.Character;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import java.util.ArrayList;

public abstract class Case {
    private String description;

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public Case(){}
    public Case (String description){
        this.description = description;
    }

    //------------------------------------ GETTERS & SETTERS  ------------------------------------------

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    public abstract void action(Character player);


    //------------------------------------ END ---------------------------------------
}
