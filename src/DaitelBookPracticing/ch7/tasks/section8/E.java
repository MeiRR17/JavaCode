package src.DaitelBookPracticing.ch7.tasks.section8;

public class E {
    public static void main( String args[] ) {
         double w[] = new double[ 99 ];
         double small = w[ 0 ];
         double large = w[ 0 ];

         // e)
         for ( int i = 0; i < w.length; i++ )
             if ( w[ i ] < small )
             small = w[ i ];
         else if ( w[ i ] > large )
             large = w[ i ];

         System.out.printf( "%f %f\n", small, large );
         }
}
