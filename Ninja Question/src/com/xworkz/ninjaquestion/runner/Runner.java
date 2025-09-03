package com.xworkz.ninjaquestion.runner;

public class Runner {
    public static void main(String[] args) {
        int num = 153;
        int real = num;
        int sum = 0;
        while (num > 0){
            int last = num % 10;
            sum = sum + (last * last * last);
            num = num / 10;

        }
        if(num == real){
            System.out.println("is a armstrong  number");
        }

        System.out.println("is not a armstrong  number");
    }


}
