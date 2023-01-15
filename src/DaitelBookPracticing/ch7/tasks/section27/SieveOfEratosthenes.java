package src.DaitelBookPracticing.ch7.tasks.section27;

import java.util.Arrays;

public class SieveOfEratosthenes{
    private static final int SAMPLE_SIZE = 1000;
    private static boolean[] arrPrimes= new boolean[SAMPLE_SIZE];

    public static void main(String[] args){
        Arrays.fill(arrPrimes, true);
        arrPrimes[0] = false;
        arrPrimes[1] = false;

        for(int i=0; i<arrPrimes.length; i++){
            // check if arrPrimes is true
            if(arrPrimes[i]){
                // mark false any j multiples of i
                for(int j=i;i*j<arrPrimes.length; j++){
                    arrPrimes[i * j] = false;
                }
            }
        }

        for(int i=0; i<arrPrimes.length; i++){
            if(isPrime(i))
                System.out.println(i);
        }
    }
    // check if index is prime (still true)
    public static boolean isPrime(int x){
        return arrPrimes[x];
    }
}
