// This class has the goal to essentially contain coordinates and perform actions on them.

public class Position {
    private final int coordX;
    private final int coordY;

    public Position(int x, int y) {
        coordX = x;
        coordY = y;
    }

    public int getCoordX() { return coordX; } // Wondering if we should try to make these const.
    public int getCoordY() { return coordY; }

    public int sumCoordinates() { return coordX + coordY; }

    public Position sumPosition(Position position) {
        return new Position(this.coordX + position.getCoordX(), this.coordY + position.getCoordY());
    }

    public boolean isValid() {
        return (((this.coordX < ChessBoardModel.numberOfRows ) && (this.coordX >= 0))
                && ((this.coordY < ChessBoardModel.numberOfRows ) && (this.coordY >= 0)));
    }


    public Position sumPosition(int x, int y) {
        return new Position(this.coordX + x, this.coordY + y);
    }
}
