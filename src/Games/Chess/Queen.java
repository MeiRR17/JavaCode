package src.Games.Chess;

class Queen extends ChessPiece {
    public Queen(int row, int col) {
        super(row, col, "Queen");
    }

    @Override
    public boolean canMoveTo(int toRow, int toCol) {
        return (toRow == row || toCol == col) ||
                (Math.abs(toRow - row) == Math.abs(toCol - col));
    }
}
