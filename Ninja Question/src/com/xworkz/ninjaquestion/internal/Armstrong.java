package com.xworkz.ninjaquestion.internal;

public class Armstrong {
    public String checkIsArmStrongOrNot(int num){
        int sum = 0;
        int real = num;
        while (num > 0){
            int last = num % 10;
            sum = sum + (last * last *last);
           num =  num/10;
        }
        if(sum == real ){
            return "Number is a ArmStrong Number";
        }
        return "Number is not a ArmStrong Number";
    }
}
