package src;

import java.util.Arrays;
import java.util.Scanner;

public class somthing {
    public static void main(String[] args) {
        int [] nums = {1,1,1,1,1};
        System.out.println(Arrays.toString(runniingSum(nums)));
    }

        static int[] runniingSum(int[] nums) {
            for(int i = 1;i<nums.length;i++){
                nums[i]+=nums[i-1];
            }
            return nums;
        }
    }

