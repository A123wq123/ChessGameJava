// This is an abstract class, the goal here is to provide a common ground for all the pieces.
// The idea here is that the piece knows everything about itself, but nothing about the state of the board.
// So the piece knows all the possible moves it can do, whether legal or not and knows how to determine if a move
// is legal. It does not know if a move is legal.

import java.util.ArrayList;

abstract class ChessABSPieceModel {
    protected ChessBoardModel board;
    protected String color; // We will keep this to 3 options, WHITE, BLACK and NULL
    abstract public ArrayList<ChessSquareModel> getListMoves(ChessSquareModel currentPos);
    abstract public boolean checkIfMoveLegal(ChessSquareModel currentPos, ChessSquareModel destSquare);
}
