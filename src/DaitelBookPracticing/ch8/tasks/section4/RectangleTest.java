package src.DaitelBookPracticing.ch8.tasks.section4;

public class RectangleTest {
        public int maximumWealth ( int[][] accounts){

            int sum = 0;
            int richest = Integer.MIN_VALUE;
            for (int i = 0; i < accounts.length; i++) {
                int total = 0;
                for (int j = 0; j < accounts[i].length; j++) {
                    sum += accounts[i][j];
                }
                richest = Math.max(richest, sum);
            }
            return richest;

        }


}
