package com.xworkz.ninjaquestion.internal;

public class FindSumOfNumber {
    public int sumOfNumber(int no) {
        int sum = 0;
        while (no != 0) {
            int last = no % 10;
            sum += last;
            no = no / 10;
        }
        return sum;
    }
}