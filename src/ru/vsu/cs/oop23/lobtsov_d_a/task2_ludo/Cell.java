package ru.vsu.cs.oop23.lobtsov_d_a.task2_ludo;

public class Cell {

    private boolean isSecurity;

    private Cell nextCell;

    private Cell alternativeCell;

    private String line;

    public boolean isSecurity() {
        return isSecurity;
    }


    public Cell getNextCell(String color){
        if(alternativeCell == null){
            return nextCell;
        }
        if(color.equals(line)){
            return alternativeCell;
        }
        return nextCell;
    }

    public Cell getNextCell() {
        return nextCell;
    }
    //    public Cell(boolean isSecurity, Cell nextCell, Cell alternativeCell, String line) {
//        this.isSecurity = isSecurity;
//        this.nextCell = nextCell;
//        this.alternativeCell = alternativeCell;
//        this.line = line;
//    }

    public void setSecurity(boolean security) {
        isSecurity = security;
    }

    public void setNextCell(Cell nextCell) {
        this.nextCell = nextCell;
    }

    public void setAlternativeCell(Cell alternativeCell, String line) {
        this.alternativeCell = alternativeCell;
        this.line = line;
    }

}
