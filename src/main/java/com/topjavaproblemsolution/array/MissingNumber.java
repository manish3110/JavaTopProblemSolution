package com.topjavaproblemsolution.array;

/*
*  Find missing number in the array.
*/
public class MissingNumber {
    public static void main(String[] args) {
        int arr2[] = new int []{1, 2, 3, 4, 6};


        int n = arr2.length+1;
        int totalSum = n * (n+1)/2;

        int arraySum = 0;
        for(int num : arr2){
            arraySum += num;
        }

        int missingNumber = totalSum - arraySum;
        System.out.println("Missing Number is => "+missingNumber);
    }
}
