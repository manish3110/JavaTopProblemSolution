package com.topjavaproblemsolution.string;

import java.util.Arrays;
import java.util.Scanner;

public class TwoStringAnagram {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter String 1 => ");
        String str1 = inputScanner.nextLine();
        System.out.print("Enter String 2 => ");
        String str2 = inputScanner.next();

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()==str2.length()){
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            if(Arrays.equals(str1CharArray,str2CharArray)){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }

        }
        else{
            System.out.println("Not Anagram");
        }

        inputScanner.close();
    }
}
