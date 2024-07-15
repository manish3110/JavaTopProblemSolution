package com.topjavaproblemsolution.array;

public class FindSecondHighest {
    public static void main(String[] args) {
        int arr[] = new int[]{1,4,19,22,6,12,76,55,100};

        int highest;
        int secondHighest;

        if(arr[0]>arr[1]){
            highest=arr[0];
            secondHighest=arr[1];
        }
        else{
            highest=arr[1];
            secondHighest=arr[0];
        }

        for(int number : arr){
            if(number > highest){
                secondHighest = highest;
                highest = number;
            }
            else if(number < highest && number > secondHighest){
                secondHighest = number;
            }
        }
        //We can use simple for loop..with index of arr we can create this program.

        System.out.println("Second Highest => " + secondHighest);
    }
}
