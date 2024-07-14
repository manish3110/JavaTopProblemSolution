package com.topjavaproblemsolution.array;

public class FindMinAndMax {
    public static void main(String[] args) {
        int arr[] = new int[]{12,80,22,67,92,8};

        int smallest = arr[0];
        int largest = arr[0];

        for(int i=1; i<arr.length; i++){
            if (arr[i] < smallest){
                smallest = arr[i];
            } else if (arr[i] > largest ){
                largest = arr[i];
            }
        }

        System.out.println("Smallest => "+ smallest);
        System.out.println("Largest => "+ largest);
    }
}
