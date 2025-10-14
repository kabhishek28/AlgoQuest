package com.xworkz.ninjaquestion.internal;

public class LeapYear {
    public void checkLeapYear(int year){
        if((year % 400 == 0 )|| (year % 4 == 0 && year % 100 != 0 )){
            System.out.println(year +": year is a Leap Year");
        }else{
            System.out.println(year + ": year is not Leap Year");
        }
    }
}
