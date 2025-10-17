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

    public void print2(){
        for(int i = 0 ; i < 5 ; i++){
            System.out.println();
            for(int j = 0 ; j<=5-i ;j++){
                System.out.print("*");
            }
        }
    }

    public void print3(){
        for(int i = 1 ; i <=5 ; i++){
            System.out.println();
            for(int j = 1 ; j<=i ;j++){
                System.out.print(j);
            }
        }
    }

    public void print4(){
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 5 ; i>=1  ; i--){
            for(int j = 0 ; j< i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
