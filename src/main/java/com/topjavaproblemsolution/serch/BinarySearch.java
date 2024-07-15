package com.topjavaproblemsolution.serch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[]{1,4,8,12,19,35,40,52,57,60,62};

        System.out.println("Enter element you want to search => ");
        int searchElement = scanner.nextInt();

        int low = 0;
        int high = arr.length-1;
        int result = -1;

        while (low <= high){
            int mid = (low+high)/2;
            if(arr[mid]==searchElement){
                result = mid;
                break;
            }
            if(arr[mid] > searchElement){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        /*
        if(result== -1){
            System.out.println(searchElement + "Not Found !!!");
        }
        else {
            System.out.println(searchElement + " Found at position : "+result );
        }
         */

        String output = (result == -1) ? String.format("%d Not Found",searchElement): String.format("%d found at %d position",searchElement,result);
        System.out.println(output);
        scanner.close();
    }
}
