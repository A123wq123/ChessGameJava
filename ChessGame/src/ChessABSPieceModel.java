// This is an abstract class, the goal here is to provide a common ground for all the pieces.
// The idea here is that the piece knows everything about itself, but nothing about the state of the board.
// So the piece knows all the possible moves it can do, whether legal or not and knows how to determine if a move
// is legal. It does not know if a move is legal.

import java.util.ArrayList;

abstract class ChessABSPieceModel {
    protected ChessBoardModel board;
    protected String color; // There might be interest in making this a boolean.
    abstract public ArrayList<ChessSquareModel> getListMoves(ChessSquareModel currentPos);

    protected boolean checkIfMoveLegal(ChessSquareModel currentPos, ChessSquareModel destSquare) {
        // This method checks if the move is legal but doesn't look for if the king of the player is put in check.

        // Check #1, not eating a piece of the same color as us.
        return !(this.color.equals(destSquare.getPiece().color));
    }
    // The above method should not be used outside the Piece itself. This is simply created to be used by getListMoves
    // and is therefore not adapted for outside use.
}
