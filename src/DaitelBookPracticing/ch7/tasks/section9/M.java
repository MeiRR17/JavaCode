package src.DaitelBookPracticing.ch7.tasks.section9;

public class M {
    public static void main(String[] args) {
        int t[][] = new int[ 2 ][ 3 ];
        for ( int j = 0; j < t.length; j++ )
            for ( int k = 0; k < t[ j ].length; k++ )
                t[ j ][ k ] = 0;
        int total = t[0][2] + t[1][2];
        System.out.println(total);
    }
}
