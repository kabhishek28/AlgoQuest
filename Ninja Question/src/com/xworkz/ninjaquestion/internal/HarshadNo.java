package com.xworkz.ninjaquestion.internal;

public class HarshadNo {

    public String checkHarshad(int num){
        int sum = 0;
        int real = num;
        while (num > 0){
            int last = num % 10;
            sum += sum;
            num = num / 10;
        }
        if(num % real == 0){
            return "number is a Harshad number";
        }
        return "number is not a Harshad number";



    }
}
