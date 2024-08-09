package com.topjavaproblemsolution.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatCharacterInString {
    public static void main(String[] args) {
        String str = "Manish manis";

        Map<Character,Integer> charCountMap = new LinkedHashMap<>();
        char[] strArray = str.toLowerCase().toCharArray();

        for(char c: strArray){
            charCountMap.put(c,charCountMap.getOrDefault(c,0)+1);
        }

        char firstNonRepeatedChar = '\0';
        for(char c:strArray){
            if(charCountMap.get(c) == 1){
                firstNonRepeatedChar = c;
                break;
            }
        }

        if(firstNonRepeatedChar!= '\0'){
            System.out.println("First non repeated character in String ==> "+firstNonRepeatedChar);
        }
        else {
            System.out.println("Not non repeated character found");
        }
    }
}
