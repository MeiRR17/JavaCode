package src.Games.Chess;

import java.util.Scanner;

class Chess {
    static final int BOARD_SIZE = 8;
    ChessPiece[][] board = new ChessPiece[BOARD_SIZE][BOARD_SIZE];
    Scanner sc = new Scanner(System.in);

    public void play() {
        board[0][0] = new King(0, 0);
        board[0][1] = new Queen(0, 1);

        while (true) {
            System.out.println("Current board:");
            printBoard();

            System.out.print("Enter the row and column to move from: ");
            int fromRow = sc.nextInt();
            int fromCol = sc.nextInt();

            System.out.print("Enter the row and column to move to: ");
            int toRow = sc.nextInt();
            int toCol = sc.nextInt();

            movePiece(fromRow, fromCol, toRow, toCol);
        }
    }

    public void movePiece(int fromRow, int fromCol, int toRow, int toCol) {
        ChessPiece piece = board[fromRow][fromCol];
        if (piece == null) {
            System.out.println("There is no piece at position " + fromRow + ", " + fromCol);
        } else if (piece.canMoveTo(toRow, toCol)) {
            board[toRow][toCol] = piece;
            board[fromRow][fromCol] = null;
            piece.row = toRow;
            piece.col = toCol;
            System.out.println(piece.name + " moved from " + fromRow + ", " + fromCol + " to " + toRow + ", " + toCol);
        } else {
            System.out.println(piece.name + " cannot move to " + toRow + ", " + toCol);
        }
    }

    public void printBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print("|");
            for (int j = 0; j < BOARD_SIZE; j++) {
                ChessPiece piece = board[i][j];
                if (piece == null) {
                    System.out.print("  |");
                } else {
                    System.out.print(" " + piece.name.charAt(0) + " |");
                }
            }
            System.out.println();
            System.out.println("-----------------");
        }
    }
}

