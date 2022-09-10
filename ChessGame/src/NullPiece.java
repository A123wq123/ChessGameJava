import java.util.ArrayList;

public class NullPiece extends ChessABSPieceModel {

    public NullPiece() {
        // This class shouldn't really have parameters.
        this.colour = Colour.NULL;
    }

    @Override
    public ArrayList<ChessSquareModel> getListMoves(ChessSquareModel currentPos) {
        return null;
    }
}
