package com.topjavaproblemsolution.string;

public class CheckStringRotation {
    public static void main(String[] args) {
        String firstString = "1234";
        String secondString = "3412";


        String checkString = firstString + firstString;

        if(firstString.length() == secondString.length()) {
            if (checkString.contains(secondString)) {
                System.out.println("SecondString is a Rotation of firstString");
            } else {
                System.out.println("SecondString is NOT a Rotation of firstString");
            }
        }
        else{
            System.out.println("SecondString is NOT a Rotation of firstString");
        }
    }
}
