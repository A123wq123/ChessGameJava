import java.util.ArrayList;
import java.util.Objects;

public class King extends ChessABSPieceModel {

    public King(ChessBoardModel board, String colorOfPiece) {
        this.board = board;
        this.color = colorOfPiece;
    }

    @Override
    public ArrayList<ChessSquareModel> getListMoves(ChessSquareModel currentPos) {

        ArrayList<ChessSquareModel> listOfMoves = new ArrayList<>();
        int[] coordinates = currentPos.getCoordinates();

        for (int rowMove : new int[] {-1, 0, 1}) {
            for (int columnMove : new int[] {-1, 0, 1}) {
                ChessSquareModel destSquare = this.board.getSquareModel(coordinates[0] + rowMove, coordinates[1] +
                        columnMove);
                if (checkIfMoveLegal(currentPos, destSquare)) {
                    listOfMoves.add(destSquare);
                }
            }
        }

        return listOfMoves;
    }

    @Override
    public boolean checkIfMoveLegal(ChessSquareModel currentPos, ChessSquareModel destSquare) {
        // Check if the king is in check.
        if (Objects.equals(this.color, destSquare.getPiece().color)) {
            return false;
        }

        return true;
    }
}
