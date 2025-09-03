package com.xworkz.ninjaquestion.runner;

public class Runner1 {
    public static void main(String[] args) {

        int num = 121;
        int real = num;
        int sum = 0;
        while (num > 0){
            int last = num % 10;
            sum += last;
            num = num/10;
        }
        if(real % sum == 0){
            System.out.println("is a harshad");
        }
        System.out.println("is not a harshad");
    }
}