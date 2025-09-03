package com.xworkz.ninjaquestion.internal;

public class ReverseDigits {
    public int checkRevers(int num){
        int revers = 0;
        while (num > 0 ){
            int last = num % 10;
            revers = revers * 10 + last;
            num = num/10;
        }
        return revers;
    }
}