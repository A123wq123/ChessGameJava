package Logic;

import Logic.Pieces.ChessABSPieceModel;
import Utility.Position;
import java.util.Objects;

/**
 * Class representing a chess board on the logic side of this project. This class is in charge of
 * managing the board and every square that is placed within it. This class contains an array of
 * arrays representing the board, the width of teh board and the position of both kings to optimise
 * processing time. This class is in charge of checking for board wide events such as if a king
 * is under attack, removing a piece or adding a piece.
 * @Author Charles Degrandpré
 * @Last_Updated 2022-12-23
 */
public class ChessBoardModel {
    private final ChessSquareModel[][] squareList = new ChessSquareModel[numberOfRows][numberOfRows];
    public final static int numberOfRows = 8;
    private ChessSquareModel positionOfWhiteKing;
    private ChessSquareModel positionOfBlackKing;

    /** TODO
     * Constructor of a ChessBoardModel, this initiates every square and also every
     * piece present in the chess board.
     */
    public ChessBoardModel() {
        for (int row = 0; row < numberOfRows; row++) {
            for (int column = 0; column < numberOfRows; column++) {
                squareList[row][column] = new ChessSquareModel(column, row);
            }
        }
    }

    /**
     * Returns the given square associated with a position element.
     * @param position the position representing the coordinates of the square.
     * @return the square model element associated with the coordinates.
     */
    public ChessSquareModel getSquareModel(Position position) {
        return squareList[position.getCoordY()][position.getCoordX()];
    }

    /**
     * Adds a piece to a square associated with a given set of coordinates.
     * @param position the position element representing the coordinates of the square
     *                 we want to add the piece to.
     * @param piece the piece we want to add.
     */
    public void addPieceToSquare(Position position, ChessABSPieceModel piece) {
        getSquareModel(position).addPiece(piece);
    }

    /**
     * @deprecated this method is subject to being removed.
     * Adds a piece to a given square in parameter.
     * @param square the square we want to add the piece to.
     * @param piece the piece we want to add.
     */
    public void addPieceToSquare(ChessSquareModel square, ChessABSPieceModel piece) {
        square.addPiece(piece);
    }

    /** TODO
     * Removes a square from a given set of coordinates.
     * @param position the position of thw square we want to remove the piece from.
     */
    public void removePieceFromSquare(Position position) {

    }

    /** TODO
     * Checks if a king is under attack, that being either in check or check mate.
     * @param colourOfAttacker colour of the pieces attacking the king.
     * @return boolean identifying if the king of the opposite colour of
     * colourOfAttacker.
     */
    public boolean isKingUnderAttack(Colour colourOfAttacker) {
        // To check if the kind is under attack.
        return true;
    }

    /**
     * @return returns the square of the white king.
     */
    private ChessSquareModel getPositionOfWhiteKing() {return this.positionOfWhiteKing;}

    /**
     * @return returns the square of the black king.
     */
    private ChessSquareModel getPositionOfBlackKing() {return this.positionOfBlackKing;}

    /**
     * A function to return the colour of a king depending on a given parameter.
     * @param colourOfKing the colour of the king we want to locate.
     * @return the square on which the king is located.
     */
    public ChessSquareModel getPositionOfKing(Colour colourOfKing) {
        if (Objects.equals(colourOfKing, Colour.WHITE)) {
            return getPositionOfWhiteKing();
        }
        else {
            return getPositionOfBlackKing();
        }
    }

    public void ChangeSquare(ChessSquareModel tempSquare, Position destination) {
    }

    public boolean isSquareUnderAttack(Colour oposingPlayer) {
        return false;
    }
}
