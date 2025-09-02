package com.xworkz.ninjaquestion.internal;

public class AddDigits {

        public int addDigits(int num) {
            int sum = 0;
            while(num!=0){
                int last = num % 10;
                sum += last;
                num = num/10;
            }

            int count = 0;
            while(sum != 0){
                sum = sum / 10;
                count++ ;
            }
            return count;

        }

}
