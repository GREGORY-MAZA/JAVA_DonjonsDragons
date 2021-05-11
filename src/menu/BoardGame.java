package menu;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import cases.Case;
import cases.ChestCase;
import cases.EmptyCase;
import cases.EnemyCase;
import loots.Axe;
import loots.Buff;
import loots.Fire;
import loots.Shield;
import mobs.Dragon;
import mobs.Enemy;
import mobs.Gobelin;
import mobs.Orc;

import java.util.ArrayList;
import java.util.List;

public class BoardGame {
    private List<Case> leNomDeLaListe = new ArrayList<Case>();
    private int index =0;


    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public BoardGame(){
        for (int i = 0 ; i < 4; i++){
            leNomDeLaListe.add(new ChestCase(new Axe()));
        }
        for (int i = 0 ; i < 10; i++){
            leNomDeLaListe.add(new ChestCase(new Axe()));
        }
        for (int i = 0 ; i < 10; i++){
            leNomDeLaListe.add(new ChestCase(new Axe()));
        }
        for (int i = 0 ; i <9; i++){
            leNomDeLaListe.add(new ChestCase(new Axe()));
        }
        for (int i = 0 ; i < 7; i++){
            leNomDeLaListe.add(new ChestCase(new Fire()));
        }
        for (int i = 0 ; i < 8; i++){
            leNomDeLaListe.add(new ChestCase(new Buff()));
        }
        for (int i = 0 ; i < 8; i++){
            leNomDeLaListe.add(new ChestCase(new Shield()));
        }
        for (int i = 0 ; i <8 ; i++){
            leNomDeLaListe.add(new EmptyCase());
        }
    }

    //------------------------------------ GETTERS & SETTERS  ------------------------------------------

    public List<Case> getLeNomDeLaListe() { return leNomDeLaListe; }

    public int getIndex() { return index; }

    public void setIndex(int index) {
        this.index = index;
    }

    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    @Override
    public String toString() {
        return "                         You are on the square number : "+ index;
    }




    /*
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
    public void setSquarePlayer(int squarePlayer) {
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
        return "                         You are on the square number : "+ squarePlayer;
    }

 */
    //------------------------------------------ END

}
