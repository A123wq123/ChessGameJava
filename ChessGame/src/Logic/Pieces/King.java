package Logic.Pieces;

import Logic.ChessBoardModel;
import Logic.ChessSquareModel;
import Logic.Colour;
import Utility.Position;

import java.util.ArrayList;

public class King extends ChessABSPieceModel {

    public King(ChessBoardModel board, Colour colourOfPiece) {
        this.board = board;
        this.colour = colourOfPiece;
    }

    @Override
    public ArrayList<ChessSquareModel> getListMoves(ChessSquareModel currentSquare) {

        ArrayList<ChessSquareModel> listOfMoves = new ArrayList<>();
        Position currentPosition = currentSquare.getPosition();

        for (int rowMove : new int[] {-1, 0, 1}) {
            for (int columnMove : new int[] {-1, 0, 1}) {
                Position destPosition = currentPosition.sumPosition(rowMove, columnMove);
                ChessSquareModel destSquare = this.board.getSquareModel(destPosition);
                if (checkIfMoveLegal(currentSquare, destSquare) && (destPosition.isValid())) {
                    listOfMoves.add(destSquare);
                }
            }
        }

        return listOfMoves;
    }
}
