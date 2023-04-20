package src.DaitelBookPracticing.ch7.tasks.section9;

import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t[][] = new int[ 2 ][ 3 ];
        for ( int j = 0; j < t.length; j++ )
            for ( int k = 0; k < t[ j ].length; k++ )
                t[ j ][ k ] = in.nextInt();

    }
}
