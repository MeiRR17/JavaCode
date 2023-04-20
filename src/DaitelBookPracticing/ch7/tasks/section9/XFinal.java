package src.DaitelBookPracticing.ch7.tasks.section9;

import java.util.Scanner;

public class XFinal {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );

        // a)
        int t[][] = new int[ 2 ][ 3 ];

        // g)
        t[ 0 ][ 1 ] = 0;

        // h)
        t[ 0 ][ 0 ] = 0;
        t[ 0 ][ 1 ] = 0;
        t[ 0 ][ 2 ] = 0;
        t[ 1 ][ 0 ] = 0;
        t[ 1 ][ 1 ] = 0;
        t[ 1 ][ 2 ] = 0;

        // i)
        for ( int j = 0; j < t.length; j++ )
            for ( int k = 0; k < t[ j ].length; k++ )
                t[ j ][ k ] = 0;

        // j)
        for ( int j = 0; j < t.length; j++ )
            for ( int k = 0; k < t[ j ].length; k++ )
                t[ j ][ k ] = in.nextInt();

        // k)
        int small = t[ 0 ][ 0 ];

        for ( int j = 0; j < t.length; j++ )
            for ( int k = 0; k < t[ j ].length; k++ )
                if ( t[ j ][ k ] < small )
                    small = t[ j ][ k ];

        System.out.println( small );

        // l)
        System.out.printf(
                "%d %d %d\n", t[ 0 ][ 0 ], t[ 0 ][ 1 ], t[ 0 ][ 2 ] );

        // m
        int total = t[ 0 ][ 2 ] + t[ 1 ][ 2 ];

        // n
        System.out.println( "\t0\t1\t2\n" );
        for ( int e = 0; e < t.length; e++ )
        {
            System.out.print( e );
            for ( int r = 0; r < t[ e ].length; r++ )
                System.out.printf( "\t%d", t[ e ][ r ] );

            System.out.println();
        }
    }
}
