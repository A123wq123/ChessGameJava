// The goal of this class is to be the model, the behind the scenes, of the board.

// ChessSquareModel has yet to be created.

import java.util.ArrayList;

public class ChessBoardModel {
    private final ArrayList<ChessSquareModel> squareList = new ArrayList<>();
    private final static int numberOfRows = 8;

    public ChessBoardModel() {
        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                squareList.add(new ChessSquareModel());
            }
        }
    }

    public ChessSquareModel getSquareModel(int row, int column) {
        return squareList.get(row * numberOfRows + column);
    }


    public void AddPieceToSquare(int row, int column, ChessABSPieceModel piece) {
        // Once the piece class has been created, add it here in order to add a piece to a specific square.
        // Also dupe this method but have one take in a ChessSquareModel instead of coordinates.
        getSquareModel(row, column).AddPiece(piece);
    }

    public void AddPieceToSquare(ChessSquareModel square, ChessABSPieceModel piece) {
        square.AddPiece(piece);
    }

    public void RemovePieceFromSquare(int row, int column) {
        // Once the piece class has been created, finish implementing this function.
        // Dupe this method to have one take a ChessSquareModel as opposed to coordinate.
    }

}
