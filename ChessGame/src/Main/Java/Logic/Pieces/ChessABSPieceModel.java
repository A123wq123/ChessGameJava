package Logic.Pieces;

import Logic.ChessBoardModel;
import Logic.ChessSquareModel;
import Logic.Colour;

import java.util.ArrayList;

/**
 * Abstract class from which all pieces inherit from. This class keeps track of
 * the board attribute and colour attribute. Can check if a move is legal as well
 * obtain al possible moves a piece can make.
 * @Author Charles Degrandpr√©
 * @Last_Updated 2022-12-23
 */
public abstract class ChessABSPieceModel {
    protected ChessBoardModel board;
    protected Colour colour;

    /**
     * Returns all the possibles moves the piece can make by receiving its square
     * as a parameter. This method can check if a move is legal (does not cross a piece
     * etc.) but cannot check if the king is in check after the move. As an example, this
     * would return all possible legal squares a knight can move to but not if that move
     * puts the players king in check.
     * @param currentPos the square identifying
     * @return an array of the possible squares the piece can get to.
     */
    abstract public ArrayList<ChessSquareModel> getListMoves(ChessSquareModel currentPos);

    /** TODO
     * Method that checks if a move is legal. but doesn't check if the move puts
     * the players king in check.
     * @param currentPos the position the move starts at.
     * @param destSquare the position the move ends at.
     * @return boolean indicating if the move is legal.
     */
    protected boolean checkIfMoveLegal(ChessSquareModel currentPos, ChessSquareModel destSquare) {
        return !(this.colour.equals(destSquare.getPiece().colour));
    }
}
