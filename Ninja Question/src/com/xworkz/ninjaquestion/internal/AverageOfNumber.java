package com.xworkz.ninjaquestion.internal;

import java.util.Arrays;

public class AverageOfNumber {
    public void findAverage(int[] nums){
        int sum = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
        }

        sum = sum/nums.length;
        System.out.println("Average of " + Arrays.toString(nums) + ":"+sum );
    }
}
