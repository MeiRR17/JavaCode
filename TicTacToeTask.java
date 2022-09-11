import java.util.Scanner;

public class TicTacToeTask {
    public static void main(String[] args) {
        //write the situation using char matrix case.
        Scanner in = new Scanner(System.in);

        char[][] mainMatrix = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };


        String start;
        System.out.println("Welcome to TicTacToe game!");
        System.out.println("First decide which one will be first and he will be known as X player");
        System.out.println("and the second player will be known as O player.");
        System.out.println();
        System.out.println("Each player will have to form a continuous line of three of his set character.");
        System.out.println("By putting a number you will set your character at this position!");
        System.out.println();
        System.out.println("                                                          GOOD LUCK!");
        System.out.println();
        System.out.println("                TYPE START TO PLAY THE GAME");
        start = in.nextLine();
        int move;

        boolean turn = true;
        //turn true = 'X', turn false = 'O'


        while(true){
            if(start.equals("start")||start.equals("START")) {
                break;
            }else{
                System.out.println("PLEASE TYPE THE KEYWORD \"START\" FOR PLAYING THE GAME.");
                start = in.nextLine();
            }
        }



            while (true) {
                if (turn) {
                    System.out.println(" Current board:");
                    System.out.println();
                    printBoard(mainMatrix);
                    System.out.println("X player turn: ");
                    System.out.println("type an available number between 1 to 9");
                    move = in.nextInt();
                    if (!checkAvailablePosition(mainMatrix, move)) {
                        System.out.println("Please use an available position to put your character in.");
                        continue;
                    }

                    if (!numberPosition(mainMatrix, move, 'X')){
                        System.out.println("Invalid number.");
                        System.out.println("TRY AGAIN!");
                        continue;
                    }

                    if (xOrO(mainMatrix, 'X')) {
                        printBoard(mainMatrix);
                        System.out.println("X player has won the game.");
                        break;
                    } else if (checkDraw(mainMatrix)) {
                        System.out.println("It is a draw!");
                        break;
                    }

                    turn = false;
                } else {
                    System.out.println(" Current board: ");
                    System.out.println();
                    printBoard(mainMatrix);
                    System.out.println("O player turn: ");
                    System.out.println("type an available number between 1 to 9");
                    move = in.nextInt();
                    if (!checkAvailablePosition(mainMatrix, move)) {
                        System.out.println("Please use an available position to put your character in.");
                        continue;
                    }


                        if(!numberPosition(mainMatrix, move, 'O')){
                        System.out.println("Invalid number.");
                        System.out.println("TRY AGAIN!");
                        continue;
                    }

                    if (xOrO(mainMatrix, 'O')) {
                        printBoard(mainMatrix);
                        System.out.println("O player has won the game.");
                        break;
                    } else if (checkDraw(mainMatrix)) {
                        System.out.println("It is a draw!");
                        break;
                    }
                    turn = true;
                }
            }
    }
    //returned the condition to get the win or a draw.
    public static boolean xOrO(char[][] matrix, char player){
        //case number 1
        if(matrix[0][0]==player&&matrix[0][1]==player&&matrix[0][2]==player){
            return true;
        }else
            //case number 2
            if(matrix[1][0]==player&&matrix[1][1]==player&&matrix[1][2]==player) {
                return true;
            }else
                //case number 3
                if(matrix[2][0]==player&&matrix[2][1]==player&&matrix[2][2]==player){
                    return true;
                }else
                    //case number 4
                    if(matrix[0][0]==player&&matrix[1][0]==player&&matrix[2][0]==player){
                        return true;
                    }else
                        //case number 5
                        if(matrix[0][1]==player&&matrix[1][1]==player&&matrix[2][1]==player){
                            return true;
                        }else
                            //case number 6
                            if(matrix[0][2]==player&&matrix[1][2]==player&&matrix[2][2]==player){
                                return true;
                            }else
                                //case number 7
                                if(matrix[2][0]==player&&matrix[1][1]==player&&matrix[0][2]==player){
                                    return true;
                                }else
                                    //case number 8
                                    return matrix[0][0] == player && matrix[1][1] == player && matrix[2][2] == player;
    }
    public static void printBoard(char [][] matrix){
        System.out.println("     |---|---|---|");
        System.out.println("     | " + matrix[0][0] + " | " + matrix[0][1] + " | " + matrix[0][2] + " |");
        System.out.println("     |-----------|");
        System.out.println("     | " + matrix[1][0] + " | " + matrix[1][1] + " | " + matrix[1][2] + " |");
        System.out.println("     |-----------|");
        System.out.println("     | " + matrix[2][0] + " | " + matrix[2][1] + " | " + matrix[2][2] + " |");
        System.out.println("     |---|---|---|");
    }
    public static boolean checkDraw(char [][] matrix){
        int countMoves = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matrix[i][j]=='X'||matrix[i][j]=='O'){
                    countMoves++;
                }
            }
        }
        if(countMoves==9){
            return true;
        }else{
            return false;
        }
    }
    public static boolean checkAvailablePosition(char [][] matrix, int move){
        switch (move) {
            case 1: if(matrix[0][0]=='O'||matrix[0][0]=='X'){
                return false;
            }else{
                return true;
            }
            case 2: if(matrix[0][1]=='O'||matrix[0][1]=='X'){
                return false;
            }else{
                return true;
            }
            case 3: if(matrix[0][2]=='O'||matrix[0][2]=='X'){
                return false;
            }else{
                return true;
            }
            case 4: if(matrix[1][0]=='O'||matrix[1][0]=='X'){
                return false;
            }else{
                return true;
            }
            case 5: if(matrix[1][1]=='O'||matrix[1][1]=='X'){
                return false;
            }else{
                return true;
            }
            case 6: if(matrix[1][2]=='O'||matrix[1][2]=='X'){
                return false;
            }else{
                return true;
            }
            case 7: if(matrix[2][0]=='O'||matrix[2][0]=='X'){
                return false;
            }else{
                return true;
            }
            case 8: if(matrix[2][1]=='O'||matrix[2][1]=='X'){
                return false;
            }else{
                return true;
            }
            case 9: if(matrix[2][2]=='O'||matrix[2][2]=='X'){
                return false;
            }else{
                return true;
            }
            default: return true;
        }
    }
    public static boolean numberPosition (char[][] matrix, int move, char player){
        if(move>0&&move<=9){
            switch(move){
                case 1: matrix[0][0] = player; return true;

                case 2: matrix[0][1] = player; return true;

                case 3: matrix[0][2] = player; return true;

                case 4: matrix[1][0] = player; return true;

                case 5: matrix[1][1] = player; return true;

                case 6: matrix[1][2] = player; return true;

                case 7: matrix[2][0] = player; return true;

                case 8: matrix[2][1] = player; return true;

                case 9: matrix[2][2] = player; return true;

            }
        }else{
            return false;
        }
        return false;
    }
}
