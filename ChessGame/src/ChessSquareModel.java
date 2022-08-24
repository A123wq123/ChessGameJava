public class ChessSquareModel {

    private ChessABSPieceModel piece;
    private Position position;

    public ChessSquareModel(int row, int column) {
        this.position = new Position(row, column);
    }

    public Position getPosition() { return position; }

    public ChessABSPieceModel getPiece() { return piece; }

    public void addPiece(ChessABSPieceModel newPiece) {
        piece = newPiece;
    }

    public void removePiece() {
        // Implementation to be finalized when NULLPiece has been created.
    }
}
