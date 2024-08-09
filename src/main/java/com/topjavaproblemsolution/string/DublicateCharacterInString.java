package com.topjavaproblemsolution.string;

import java.util.HashMap;
import java.util.Map;

public class DublicateCharacterInString {
    public static void main(String[] args) {
        String str = "Hi,How are you?";

        Map<Character,Integer> charCountMap = new HashMap<>();
        char[] charArray = str.toLowerCase().toCharArray();

        for(char c:charArray){
            charCountMap.put(c,charCountMap.getOrDefault(c,0)+1);
        }

        System.out.println("Repeated character in the String");
        for(Map.Entry<Character,Integer> entry : charCountMap.entrySet()){
            if(entry.getValue() >= 2){
                System.out.println(entry.getKey() +" : "+entry.getValue());
            }
        }
    }
}
