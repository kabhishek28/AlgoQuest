package com.xworkz.ninjaquestion.internal;

public class SwapNoWithOutTempVariableWithTemp {
    public void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Swap No WithOut Temp Variable after " + a +"======="+b);

    }
}
