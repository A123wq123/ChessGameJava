public class ChessSquareModel {

    private ChessABSPieceModel piece;
    private int[] coordinates;

    public ChessSquareModel(int row, int column) {
        this.coordinates = new int[] {row, column};
    }

    public int[] getCoordinates() { return coordinates; }

    public ChessABSPieceModel getPiece() { return piece; }

    public void addPiece(ChessABSPieceModel newPiece) {
        piece = newPiece;
    }

    public void removePiece() {
        // Implementation to be finalized when NULLPiece has been created.
    }
}
