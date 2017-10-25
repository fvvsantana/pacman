package model.characters;

import model.fruits.FruitModel;
import model.grid.CellModel;
import java.util.ArrayList;
import utils.Orientation;

public class PacManModel extends CellModel{
    int row;
    int col;
    Orientation orientation;
    int score;
    int lives;
    ArrayList<FruitModel> fruits;

    public PacManModel(int row, int col) {
        this.row = row;
        this.col = col;
        orientation = Orientation.RIGHT;
        score = 0;
        lives = 3;
        fruits = new ArrayList<>();
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void moveUp(){
        row--;
    }

    public void moveDown(){
        row++;
    }

    public void moveLeft(){
        col--;
    }

    public void moveRight(){
        col++;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

}