package menu;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

public class BoardGame {

    private int squarePlayer;
    private int squareEnemy;
    private int squareChest;
    private int squareClean;
    private int squareBoss;

    ////------------------------------------ CONSTRUCTORS ---------------------------------------

    public BoardGame(int squarePlayer) {
        this.squarePlayer = squarePlayer;
    }

    public BoardGame(int squarePlayer, int squareEnemy, int squareChest, int squareClean, int squareBoss) {
        this.squarePlayer = squarePlayer;
        this.squareEnemy = squareEnemy;
        this.squareChest = squareChest;
        this.squareClean = squareClean;
        this.squareBoss = squareBoss;
    }

    //------------------------------------ GETTERS & SETTERS  ------------------------------------------


    public int getSquarePlayer() { return squarePlayer; }
    public void setSquarePlayer() {
        this.squarePlayer = squarePlayer;
    }

    public int getSquareEnemy() { return squareEnemy; }
    public void setSquareEnemy() {
        this.squareEnemy = squareEnemy;
    }

    public int getSquareChest() { return squareChest; }
    public void setSquareChest() {
        this.squareChest = squareChest;
    }

    public int getSquareClean() { return squareClean; }
    public void setSquareClean() {
        this.squareClean = squareClean;
    }

    public int getSquareBoss() { return squareBoss; }
    public void setSquareBoss() {
        this.squareBoss = squareBoss;
    }


    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    @Override
    public String toString() {
        return "You are on the square number : "+ squarePlayer;
    }
}
