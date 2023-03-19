package src.Games.Chess;

class King extends ChessPiece {
    public King(int row, int col) {
        super(row, col, "King");
    }

    @Override
    public boolean canMoveTo(int toRow, int toCol) {
        return (Math.abs(toRow - row) <= 1) && (Math.abs(toCol - col) <= 1);
    }
}
