import java.util.ArrayList;

// This might become useless / no longer needed.
public class ChessNULLPieceModel extends ChessABSPieceModel {

    public ChessNULLPieceModel(ChessSquareModel square) {

    }

    @Override
    public ArrayList<ChessSquareModel> getListMoves() {
        return null;
    }

    @Override
    public boolean checkIfMoveLegal(ChessSquareModel destSquare) {
        return false;
    }
}
