import java.util.ArrayList;

public class ChessNULLPieceModel extends ChessABSPieceModel {

    public ChessNULLPieceModel(ChessSquareModel square) {

    }

    @Override
    public ArrayList<ChessSquareModel> GetListMoves() {
        return null;
    }

    @Override
    public boolean CheckIfMoveLegal(ChessSquareModel destSquare) {
        return false;
    }
}
