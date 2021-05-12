package cases;

import menu.Character;
import java.util.ArrayList;
//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

/** Class Case est la classe Parent abstraite de EnemyCase ,EmptyCase et ChestCase.
 * Elle contient l'attribut :
 * description (String)
 */

public abstract class Case {
    private String description;

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public Case(){}

    /**
     *
     * @param description = La description de la case (String)
     */
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
