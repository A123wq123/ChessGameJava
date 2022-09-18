// The goal of this class is to be the model, the behind the scenes, of the board.

// ChessSquareModel has yet to be created.

import java.util.Objects;

public class ChessBoardModel {
    private final ChessSquareModel[][] squareList = new ChessSquareModel[numberOfRows][numberOfRows];
    public final static int numberOfRows = 8;
    private ChessSquareModel positionOfWhiteKing;
    private ChessSquareModel positionOfBlackKing;

    public ChessBoardModel() {
        for (int row = 0; row < numberOfRows; row++) {
            for (int column = 0; column < numberOfRows; column++) {
                squareList[row][column] = new ChessSquareModel(row, column);
            }
        }
    }

    public ChessSquareModel getSquareModel(Position position) {
        return squareList[position.getCoordX()][position.getCoordY()];
    }


    public void addPieceToSquare(Position position, ChessABSPieceModel piece) {
        // Once the piece class has been created, add it here in order to add a piece to a specific square.
        // Also dupe this method but have one take in a ChessSquareModel instead of coordinates.
        getSquareModel(position).addPiece(piece);
    }

    public void addPieceToSquare(ChessSquareModel square, ChessABSPieceModel piece) {
        square.addPiece(piece);
    }

    public void removePieceFromSquare(int row, int column) {
        // Once the piece class has been created, finish implementing this function.
        // Dupe this method to have one take a ChessSquareModel as opposed to coordinate.
    }

    public boolean isSquareUnderAttack(Colour colourOfAttacker) {
        // To check if the kind is under attack.
        return true;
    }

    public ChessSquareModel getPositionOfWhiteKing() {return this.positionOfWhiteKing;}
    public ChessSquareModel getPositionOfBlackKing() {return this.positionOfBlackKing;}

    public ChessSquareModel getPositionOfKing(Colour colourOfKing) {
        if (Objects.equals(colourOfKing, Colour.WHITE)) {
            return getPositionOfWhiteKing();
        }
        else {
            return getPositionOfBlackKing();
        }
    }

    /**
     * This method needs to change a square with another square by intaking both positions.
     * @return void
     */
    public void ChangeSquare(ChessSquareModel square, Position positionDestiantion){
        // 1) Find square associated with coords of Destination
        // 2) Change that square with the square we take in parameters.
        squareList[positionDestiantion.getCoordX()][positionDestiantion.getCoordY()] = square;

    }

    // Probably going to need a method to initialise the pieces of the board. Unless we have that be done by the
    // controller or some other class.

}
