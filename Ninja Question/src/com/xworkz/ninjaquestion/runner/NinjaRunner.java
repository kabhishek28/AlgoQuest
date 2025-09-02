package com.xworkz.ninjaquestion.runner;

import com.xworkz.ninjaquestion.internal.AddDigits;
import com.xworkz.ninjaquestion.internal.FindSumOfNumber;
import com.xworkz.ninjaquestion.internal.Palindrome;

public class NinjaRunner {
    public static void main(String[] args) {
        FindSumOfNumber findSumOfNumber = new FindSumOfNumber();
        System.out.println("Find the sum of the digits of a number. = "+findSumOfNumber.sumOfNumber(111));

        AddDigits addDigits = new AddDigits();
        System.out.println("Add Digits : "+addDigits.addDigits(2));

        Palindrome palindrome = new Palindrome();
        System.out.println("Checking palindrome : " + palindrome.checkPalindrome(124521));
    }
}
