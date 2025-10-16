package com.xworkz.ninjaquestion.internal;

public class PerfectNumber {


    public String checkNumberIsPerfect(int num){

        int sum = 0;
        for(int i = 1 ; i <= num/2 ; i++){
            if(num % i == 0){
                sum+=i;
            }
        }

        if(sum == num && num != 0){
            return  "its a perfect number";
        }else {
            return  "its a not perfect number";
        }
    }
}
