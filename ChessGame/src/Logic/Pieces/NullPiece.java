package Logic.Pieces;

import Logic.ChessABSPieceModel;
import Logic.ChessSquareModel;
import Logic.Colour;

import java.util.ArrayList;

public class NullPiece extends ChessABSPieceModel {

    public NullPiece() {
        // This class shouldn't really have parameters.
        this.colour = Colour.NULL;
    }

    @Override
    public ArrayList<ChessSquareModel> getListMoves(ChessSquareModel currentPos) {
        // depending on how the code responds to the value being NULL, we might need to simply return an empty ArrayList
        return null;
    }
}
