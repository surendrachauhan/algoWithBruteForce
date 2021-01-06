package com.algo;

public class MaxStringCharFind {

   // String str = "test";

    static char getMaxOccuringChar(String str)
    {
        // Create array to keep the count of individual
        // characters and initialize the array as 0
        int count[] = new int[256];

        // Construct character count array from the input
        // string.
        int len = str.length();
        System.out.println("len "+len);
        for (int i=0; i<len; i++) {
            count[str.charAt(i)]++;
            System.out.println("val:::"+str.charAt(i)+" count:: "+count[str.charAt(i)]);
        }

        int max = 0;  // Initialize max count
        char result = ' ';   // Initialize result

        for(int j=0;j<str.length();j++){
            System.out.println("Value of count :::"+count[str.charAt(j)]);
        }

        for(int j=0;j<str.length();j++){
            System.out.println("Value of count222 :::"+count[str.charAt(j)]);
        }

        // Traversing through the string and maintaining
        // the count of each character
//        for (int i = 0; i < str.length(); i++) {
//            if (max < count[str.charAt(i)]) {
//                max = count[str.charAt(i)];
//                System.out.println("max "+max);
//                result = str.charAt(i);
//                System.out.println("result "+result);
//            }
//        }

        return result;
    }
    public static void main(String[] args)
    {
        String str = "testrrrrrr";
        System.out.println("Max occurring character is " +
                getMaxOccuringChar(str));
    }
}
