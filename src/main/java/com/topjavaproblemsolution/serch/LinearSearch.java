package com.topjavaproblemsolution.serch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr[] = new int[]{1,2,32,5,8,64,10,22,44,98};
        System.out.println("Enter Element you want to search  :  ");
        int searchElement = scanner.nextInt();

        boolean found = false;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==searchElement){
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchElement + " Found successfully");
        }
        else {
            System.out.println(searchElement + " Not Found !!!");
        }
        scanner.close();
    }
}
