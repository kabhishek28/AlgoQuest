package com.xworkz.ninjaquestion.internal;

public class SwapNoWithOutTempVariable {
    public void swap(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Swap No WithOut Temp Variable after " + a +"======="+b);

    }
}
