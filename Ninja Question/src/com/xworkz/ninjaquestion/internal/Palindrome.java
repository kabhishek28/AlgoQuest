package com.xworkz.ninjaquestion.internal;

public class Palindrome {

//    public String checkPalindrome(int num){
//        int realNumber = num;
//        int revers = 0;
//        while (num != 0){
//            int last = num % 10;
//            revers = revers * 10 + last;
//            num = num/10;
//
//        }
//        if(realNumber == revers){
//            return "Number is a Palindrome";
//        }
//        return "Number is not a Palindrome";
//    }
    public String checkPalindromeNum(int num){
        int realNum = num;
        int revers = 0;

        while (num > 0){
            int last = num % 10;
            revers = revers * 10 + last;
            num = num/10;
        }
        if(realNum == revers){
            return "is a Palindrome";
        }
        return "is not a Palindrome ";
    }

    public String checkPalindromeString(String s){
        String realString = s;
        String revers = "";
        for(int i = 0 ; i < s.length() ; i++){
             revers = s.charAt(i) + revers;
        }
        if(realString.equals(revers)){
            return "is a Palindrome";
        }
        return "is not a Palindrome ";

    }

}
