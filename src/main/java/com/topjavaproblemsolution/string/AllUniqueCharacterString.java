package com.topjavaproblemsolution.string;

import java.util.HashSet;
import java.util.Set;

public class AllUniqueCharacterString {
    public static void main(String[] args) {
        String str1 = "Manish";

//         My own logic with loops
        char[] str1CharArray = str1.toLowerCase().toCharArray();
        boolean flag = true;

        for (int n = 0; n < str1CharArray.length; n++) {
            for (int m = n + 1; m < str1CharArray.length; m++) {
                if (str1CharArray[n] == str1CharArray[m]) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("Unique");
        } else {
            System.out.println("Not Unique");
        }


        //With using IndexOf and LastIndex
        boolean flag2 = true;
        str1 = str1.toLowerCase();
        for(int index = 0 ;index<str1.length();index ++){
            char c = str1.charAt(index);

            if(str1.indexOf(c)!=str1.lastIndexOf(c)){
                flag2=false;
                break;
            }
        }
        if (flag2) {
            System.out.println("Unique");
        } else {
            System.out.println("Not Unique");
        }

        

        //If multiple String we need to Check
        String[] strArray = {"Manish", "Avinash", "Payal"};

        for (String str2 : strArray) {
            str2 = str2.toLowerCase();
            Set<Character> charSets = new HashSet<>();

            boolean isUnique = true;

            for (char c : str2.toCharArray()) {
                if (!charSets.add(c)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println(str2 + " => has all unique characters");
            } else {
                System.out.println(str2 + " => does not have all unique characters");
            }
        }
    }
}
