package com.topjavaproblemsolution.array;

import java.util.HashMap;
import java.util.Map;

public class FindNumberOccurringOddTimes {
    public static void main(String[] args) {

        int arr[] = new int[] {1,2,3,4,5,1,2,3,4,5,6,7,8,6,8,4,2};

        Map<Integer,Integer> countNumber = new HashMap<>();

        for(int number : arr){
            countNumber.put(number,countNumber.getOrDefault(number,0)+1);
        }

        System.out.println("Number odd times => ");
        for (Map.Entry<Integer,Integer>entry : countNumber.entrySet()){
            if(entry.getValue()%2 != 0){
                System.out.println(entry.getKey());
            }
        }
    }
}
