package src.Games.Chess;

class ChessPiece {
    int row, col;
    String name;

    public ChessPiece(int row, int col, String name) {
        this.row = row;
        this.col = col;
        this.name = name;
    }

    public boolean canMoveTo(int toRow, int toCol) {
        return true; // this method should be overridden by subclasses
    }
}
