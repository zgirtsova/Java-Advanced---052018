package model.cells.bloodCells;

import model.cells.Cell;

public abstract class BloodCell extends Cell {
    protected BloodCell(String id, int health, int positionRow, int positionCol) {
        super(id, health, positionRow, positionCol);
    }

    public void assimilate(Cell cell) {
        super.setHealth(super.getHealth() + cell.getHealth());
    }
}
