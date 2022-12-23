package Utility;// This class has the goal to essentially contain coordinates and perform actions on them.

import Logic.ChessBoardModel;


/**
 * A class that contains two coordinates to work with inside a 2 dimension matrix.
 * Provides a verity of functions to execute on it's two coordinates such as obtaining the sum
 * of two coordinates and verifying if a coordinate does not fall outside the chess board.
 * @Author Charles Degrandpré
 * @Last_Updated 2022-12-23
 */
public class Position {
    private final int coordX;
    private final int coordY;

    /**
     * Contractor of a coordinate element. It's x and y values are the same as if
     * you would place this coordinate on a cartesian plan.
     * @param x the x coordinate of the position.
     * @param y the y coordinate of the position.
     */
    public Position(int x, int y) {
        coordX = x;
        coordY = y;
    }

    /**
     * @return position in x of coordinate.
     */
    public int getCoordX() { return coordX; }

    /**
     * @return position in y of coordinate.
     */
    public int getCoordY() { return coordY; }

    /**
     * Returns the sum of both it's coordinates, meaning it returns it's x
     * coordinate + y coordinate.
     * @return the sum of its coordinates.
     */
    public int sumCoordinates() { return coordX + coordY; }

    /**
     * Sums a position with another Position element and returns a new
     * position element representing the result.
     * @param position the position to sum with.
     * @return sum of positions as a new Position element.
     */
    public Position sumPosition(Position position) {
        return new Position(this.coordX + position.getCoordX(), this.coordY + position.getCoordY());
    }

    /**
     * Function that verifies that the Position instance does not fall outside
     * the limits of the chess board.
     * @return boolean indicating if the coordinate is valid.
     */
    public boolean isValid() {
        return (((this.coordX < ChessBoardModel.numberOfRows ) && (this.coordX >= 0))
                && ((this.coordY < ChessBoardModel.numberOfRows ) && (this.coordY >= 0)));
    }

    /**
     * Sums the instance of Position with two given coordinates in parameter.
     * @param x integer representing the x value to sum with.
     * @param y integer value representing the y value to sum with.
     * @return new position element representing the sum of coordinates.
     */
    public Position sumPosition(int x, int y) {
        return new Position(this.coordX + x, this.coordY + y);
    }
}
