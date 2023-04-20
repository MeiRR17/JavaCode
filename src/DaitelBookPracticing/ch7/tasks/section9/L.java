package src.DaitelBookPracticing.ch7.tasks.section9;

public class L {
    public static void main(String[] args) {
        int t[][] = new int[ 2 ][ 3 ];
        for ( int j = 0; j < t.length; j++ )
            for ( int k = 0; k < t[ j ].length; k++ )
                t[ j ][ k ] = 0;
        System.out.printf("%d %d %d\n", t[ 0 ][ 0 ], t[ 0 ][ 1 ], t[ 0 ][ 2 ] );

    }
}
