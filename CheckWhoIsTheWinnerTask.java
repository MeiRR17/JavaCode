public class CheckWhoIsTheWinnerTask {
    public static void main(String[] args) {
        char [][] mainMatrix = {
                {'X', 'O', 'X'},
                {'X', 'X', 'O'},
                {'O', 'X', 'O'}
        };
        boolean bInput = xOrO(mainMatrix);
        if(bInput){
            System.out.println("X player has won the game.");
        }else if(!bInput){
            System.out.println("O player has won the game.");
        }else{
            System.out.println("It is a draw, no one won the game.");
        }
    }
    public static boolean xOrO (char [][] matrix){
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
                                    if(matrix[0][0]=='X'&&matrix[1][1]=='X'&&matrix[2][2]=='X'){
                                        return true;
                                    }

                                    return false;
    }
}
