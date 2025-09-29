package com.xworkz.ninjaquestion.runner;

import com.xworkz.ninjaquestion.internal.FindSumOfNumber;

public class NinjaRunner {
    public static void main(String[] args) {
        FindSumOfNumber findSumOfNumber = new FindSumOfNumber();
        System.out.println("Find the sum of the digits of a number. = "+findSumOfNumber.sumOfNumber(111));
    }
}
