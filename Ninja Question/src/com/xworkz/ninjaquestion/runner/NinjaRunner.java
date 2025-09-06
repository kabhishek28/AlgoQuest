package com.xworkz.ninjaquestion.runner;

import com.xworkz.ninjaquestion.internal.*;

public class NinjaRunner {
    public static void main(String[] args) {

        FindSumOfNumber findSumOfNumber = new FindSumOfNumber();
        System.out.println("Find the sum of the digits of a number. = "+findSumOfNumber.sumOfNumber(111));

        AddDigits addDigits = new AddDigits();

        System.out.println("Add Digits : "+addDigits.addDigits(2));

        Palindrome palindrome = new Palindrome();
        System.out.println("Checking Number palindrome : " + palindrome.checkPalindromeNum(12521));

        System.out.println("Checking String palindrome : " + palindrome.checkPalindromeString("anlna"));

        ReverseDigits reverseDigits = new ReverseDigits();
        System.out.println("Number "+69+ " reverse :"+reverseDigits.checkRevers(69));

        ReversString reversString = new ReversString();
        System.out.println("Revers string : " + reversString.revers("abhi"));

        Armstrong armstrong = new Armstrong();
        System.out.println( armstrong.checkIsArmStrongOrNot(153));

        SumOfEvenAndOdd sum = new SumOfEvenAndOdd();
        sum.makeSum(125);

        PatternMatchingString patternMatchingString = new PatternMatchingString();
        System.out.println("Pattern Matching : "+ patternMatchingString.matchString("Abhishek","shee"));
    }
}