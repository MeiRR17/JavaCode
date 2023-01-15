package src.DaitelBookPracticing.ch7.tasks.section9;


public class N {
    public static void main(String[] args) {
        System.out.println( "\t0\t1\t2\n" );
        int t[][] = new int[ 2 ][ 3 ];
        for ( int e = 0; e < t.length; e++ )
        {
            System.out.print( e );
            for ( int r = 0; r < t[ e ].length; r++ )
                System.out.printf( "\t%d", t[ e ][ r ] );
            System.out.println();
        }
    }
}
