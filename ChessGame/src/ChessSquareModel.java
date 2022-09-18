public class ChessSquareModel {

    private ChessABSPieceModel piece;
    private Position position;

    public ChessSquareModel(int row, int column) {
        this.position = new Position(row, column);
        piece = new NullPiece();
    }

    public Position getPosition() { return position; }

    public ChessABSPieceModel getPiece() { return piece; }

    public void addPiece(ChessABSPieceModel newPiece) {
        piece = newPiece;
    }

    public void RemovePiece() {
        piece = new NullPiece();
        // Implementation to be finalized when NULLPiece has been created.
    }

    // The following method should only ever be used by the controller when it moves pieces on the board.
    public void ChangePosition(Position newPosition) {
        position = newPosition;
    }

}
