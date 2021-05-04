package menu;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

public class DiceGame {

    private int DiceGameFace;


    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public DiceGame(int DiceGameFace) {
        this.DiceGameFace = DiceGameFace;
    }

    //------------------------------------ GETTERS & SETTERS  ------------------------------------------

    public int getDiceGameFace() { return DiceGameFace; }
    public void setDiceGameFace(int diceGameFace) { DiceGameFace = diceGameFace; }

    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    public String toString() {
        return "You roll the dice  : "+ DiceGameFace;
    }


}
