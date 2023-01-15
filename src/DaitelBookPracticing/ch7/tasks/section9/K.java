package src.DaitelBookPracticing.ch7.tasks.section9;

public class K {
    public static void main(String[] args) {
        int t[][] = new int[ 2 ][ 3 ];
        int smallest = t[ 0 ][ 0 ];
        for ( int j = 0; j < t.length; j++ )
            for ( int k = 0; k < t[ j ].length; k++ )
                if ( t[ j ][ k] < smallest )
                    smallest = t[ j ][ k ];
        System.out.println(smallest);
    }
}
