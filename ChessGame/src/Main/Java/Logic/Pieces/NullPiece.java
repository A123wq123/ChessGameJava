package Logic.Pieces;

import Logic.ChessSquareModel;
import Logic.Colour;

import java.util.ArrayList;

/**
 * This class acts as a null piece, so a piece that does nothing. This class is
 * usefully within the architecture of this project as all squares require pieces.
 * @Author Charles Degrandpr√©
 * @Last_Updated 2022-12-23
 */
public class NullPiece extends ChessABSPieceModel {
    /**
     * Constructor of a null piece. as the piece is meant to be
     * unable to do anything, it doesn't have parameters.
     */
    public NullPiece() {
        this.colour = Colour.NULL;
    }

    /**
     * Returns the list of moves a null piece is capable of doing, which in
     * this case is none.
     * @param currentPos the current position of the piece.
     * @return the list of moves the piece is capable of doing.
     */
    @Override
    public ArrayList<ChessSquareModel> getListMoves(ChessSquareModel currentPos) {
        return null;
    }
}
