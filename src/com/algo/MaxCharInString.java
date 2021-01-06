package com.algo;

public class MaxCharInString {
    public void maxChar(String str){

        int  [] count = new int[256];

        int len = str.length();

        for(int i=0; i<len;i++){
            count[str.charAt(i)]++;
            System.out.println(count[str.charAt(i)]);
        }

        int max = 0;
        char res = ' ';

        for(int i=0;i<len;i++){
            if(max < count[str.charAt(i)]){
                max= count[str.charAt(i)];
                res = str.charAt(i);

            }
        }

        System.out.println("Maximum char :::"+res
        );

    }

    public static void main(String[] args){
        String t = "testtt";
        MaxCharInString m = new MaxCharInString();
        m.maxChar(t);
    }
}
