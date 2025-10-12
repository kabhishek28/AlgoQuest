package com.xworkz.ninjaquestion.internal;

public class Pattren {
    public void print(){
        for(int i = 0 ; i < 5 ; i++){
            System.out.println();
            for(int j = 0 ; j < 5 ; j++){
                System.out.print("*");
            }
        }
    }

    public void print1(){
        for(int i = 0 ; i < 5 ; i++){
            System.out.println();
            for(int j = 0 ; j<i ;j++){
                System.out.print("*");
            }
        }
    }

}
