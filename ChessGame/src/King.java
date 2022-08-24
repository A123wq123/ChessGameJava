import java.util.ArrayList;
import java.util.Objects;

public class King extends ChessABSPieceModel {

    public King(ChessBoardModel board, String colorOfPiece) {
        this.board = board;
        this.color = colorOfPiece;
    }

    public static boolean coordValid(Position position) {
        return ((position.getCoordX() < 8 ) && (position.getCoordY() >= 0));
    }

    @Override
    public ArrayList<ChessSquareModel> getListMoves(ChessSquareModel currentSquare) {

        ArrayList<ChessSquareModel> listOfMoves = new ArrayList<>();
        Position currentPosition = currentSquare.getPosition();

        for (int rowMove : new int[] {-1, 0, 1}) {
            for (int columnMove : new int[] {-1, 0, 1}) {
                ChessSquareModel destSquare = this.board.getSquareModel(currentPosition.sumPosition(rowMove, columnMove));
                if (checkIfMoveLegal(currentSquare, destSquare) && (coordValid(currentPosition)) &&
                        (coordValid(currentPosition))) {
                    listOfMoves.add(destSquare);
                }
            }
        }

        return listOfMoves;
    }

    @Override
    protected boolean checkIfMoveLegal(ChessSquareModel currentPos, ChessSquareModel destSquare) {
        // This method checks if the move is legal but doesn't look for if the king of the player is put in check.

        // Check #1, not eating a piece of the same color as us.
        return !Objects.equals(this.color, destSquare.getPiece().color);
    }
}
