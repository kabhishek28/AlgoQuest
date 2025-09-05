package com.xworkz.ninjaquestion.internal;

public class PatternMatchingString {
    public boolean matchString(String text,String pattern){
//        return text.contains(pattern);

        int count = 0;
        for(int i = 0 ; i <= text.length() - pattern.length();i++){
            if(text.charAt(i) == pattern.charAt(0)){
                for(int j = i ,  k = 0 ; j < i + pattern.length() ; j++,k++) {
                    if (text.charAt(j) == pattern.charAt(k)) {
                        count++;
                    }
                }
            }
        }
        if(pattern.length() == count){
            return true;
        }
        return false;
    }

}
