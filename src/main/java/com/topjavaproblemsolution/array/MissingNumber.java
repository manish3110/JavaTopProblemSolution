package com.topjavaproblemsolution.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
*  Find missing number in the array.
*/
public class MissingNumber {
    public static void main(String[] args) {
        // If Only One number is Missing.
       /*
        int arr2[] = new int []{1, 2, 3, 4, 6};

        int n = arr2.length+1;
        int totalSum = n * (n+1)/2;

        int arraySum = 0;
        for(int num : arr2){
            arraySum += num;
        }

        int missingNumber = totalSum - arraySum;
        System.out.println("Missing Number is => "+missingNumber);


        */


//      If more than One number is Missing.

        int arr2[] = new int[] {1,2,5,8,10};
        List<Integer> missingNumber = new ArrayList<>(); // "<>" declare that type of list declare on LHS.

        int maxValue = arr2[0];
        for(int num:arr2){
            if(num > maxValue){
                maxValue = num;
            }
        }

        boolean[] present = new boolean[maxValue+1];

        for(int num : arr2){
                present[num]=true;
        }

        for(int i=1;i<=maxValue;i++){
            if(!present[i]){
                missingNumber.add(i);
            }
        }

        /*
        * Using a HashSet to track elements present in the array.
        * This allows efficient checking and storage of unique elements,
        * ensuring only missing numbers are added to the `missingNumber` list.

        Set<Integer> present = new HashSet<>();

        for (int num : arr2) {
            present.add(num);
        }

        for (int i = 1; i <= maxValue; i++) {
            if (!present.contains(i)) {
                missingNumber.add(i);
            }
        }
         */

        for(int num:missingNumber){
            System.out.println(num);
        }
    }
}
