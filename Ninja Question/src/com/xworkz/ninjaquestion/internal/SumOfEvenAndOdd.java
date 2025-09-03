package com.xworkz.ninjaquestion.internal;

public class SumOfEvenAndOdd {
    public void makeSum(int num){
        int even = 0;
        int odd = 0;

        while (num != 0){
            int last = num % 10;
            if(last % 10 == 0){
                even += last;
                num = num / 10;
            }else {
                odd += last;
                num = num / 10;
            }
        }

        System.out.println("Sum of Even no : " + even);

        System.out.println("Sum of Odd no : " + odd);
    }
}
