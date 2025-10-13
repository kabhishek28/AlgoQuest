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

        SwapNoWithOutTempVariable swapNoWithOutTempVariable = new SwapNoWithOutTempVariable();
        int a = 3 , b = 2;
        System.out.println("Swap No WithOut Temp Variable before" + a +"======="+b);
        swapNoWithOutTempVariable.swap(a,b);

        SwapNoWithOutTempVariableWithTemp swapNoWithOutTempVariableWithTemp = new SwapNoWithOutTempVariableWithTemp();
        int c = 3 , d = 2;
        System.out.println("Swap No WithOut Temp Variable before" + a +"======="+b);
        swapNoWithOutTempVariableWithTemp.swap(c,d);

        Pattren pattren = new Pattren();
        pattren.print();
        System.out.println("\n----------------------------");
        pattren.print1();
        System.out.println("\n----------------------------");
        pattren.print2();
        System.out.println("\n----------------------------");
        pattren.print3();
        System.out.println("\n----------------------------");
    }
}