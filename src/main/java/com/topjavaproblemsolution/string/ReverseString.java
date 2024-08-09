package com.topjavaproblemsolution.string;

public class ReverseString {
    public static void main(String[] args) {
        String userName = "Manish Patel";
        String reverse = "";

        //Using For Loop
        for(int i = userName.length()-1;i>=0;i--){
            reverse = reverse + userName.charAt(i);
        }
        System.out.println("Reverse String using Loop => "+reverse);


        //Using String Buffer
        StringBuffer sb = new StringBuffer(userName);
        System.out.println("Reverse String using String Buffer => "+sb.reverse());
    }
}
