package com.xworkz.ninjaquestion.internal;

public class Palindrome {

    public String checkPalindrome(int num){
int realNumber = num;
        int revers = 0;
        while (num != 0){
            int last = num % 10;
            revers = revers * 10 + last;
            num = num/10;

        }
        if(realNumber == revers){
            return "Number is a Palindrome";
        }
        return "Number is not a Palindrome";
    }

}
