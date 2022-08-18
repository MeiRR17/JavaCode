public class CheckWhoIsTheWinnerTask {
    public static void main(String[] args) {
        //write the situation using char matrix case.
        char [][] mainMatrix = {
                {'X', 'O', 'X'},
                {'X', 'X', 'O'},
                {'O', 'X', 'O'}
        };
        //saved the method in main booleans and then print them.
        boolean bInputPlayerX = xOrO(mainMatrix, 'X');
        boolean bInputPlayerO = xOrO(mainMatrix, 'O');
        if(bInputPlayerX){
            //printed X player condition of winning.
            System.out.println("X player has won the game.");
        }else if(bInputPlayerO){
            //printed O player condition of winning.
            System.out.println("O player has won the game.");
        }else{
            //printed the draw in else
            System.out.println("It is a draw, no one won the game.");
        }
    }
    //returned the condition to get the win or a draw.
    public static boolean xOrO(char[][] matrix, char ignoredPlayer){
        //case number 1
        if(matrix[0][0]=='X'&&matrix[0][1]=='X'&&matrix[0][2]=='X'){
            return true;
        }else
            //case number 2
            if(matrix[1][0]=='X'&&matrix[1][1]=='X'&&matrix[1][2]=='X') {
                return true;
            }else
                //case number 3
                if(matrix[2][0]=='X'&&matrix[2][1]=='X'&&matrix[2][2]=='X'){
                    return true;
                }else
                    //case number 4
                    if(matrix[0][0]=='X'&&matrix[1][0]=='X'&&matrix[2][0]=='X'){
                        return true;
                    }else
                        //case number 5
                        if(matrix[0][1]=='X'&&matrix[1][1]=='X'&&matrix[2][1]=='X'){
                            return true;
                        }else
                            //case number 6
                            if(matrix[0][2]=='X'&&matrix[1][2]=='X'&&matrix[2][2]=='X'){
                                return true;
                            }else
                                //case number 7
                                if(matrix[2][0]=='X'&&matrix[1][1]=='X'&&matrix[0][2]=='X'){
                                    return true;
                                }else
                                    //case number 8
                                    return matrix[0][0] == 'X' && matrix[1][1] == 'X' && matrix[2][2] == 'X';
    }
}