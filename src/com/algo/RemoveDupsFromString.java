package com.algo;

import java.sql.Array;
import java.util.Arrays;

public class RemoveDupsFromString {

    public void removeDups(char in [], int n){

        int index = 0;

        for(int i=0; i<n;i++){
            int j;

            for( j=0;j<i;j++){

                System.out.println("int [i]:::"+in[i]+" int[j]:::"+in[j]);

                if(in[i]==in[j]){
                    break;
                }
            }

            if(j == i){
                in[index++]=in[i];
            }
            System.out.println("int [i]:::"+in[i]+" int[index]:::"+in[index]);

        }
        System.out.println("After Duplicate removal"+String.valueOf(Arrays.copyOf(in,index)));

    }

    public static void main(String [] args){
        String w = "abccccc";
        RemoveDupsFromString obj = new RemoveDupsFromString();
        obj.removeDups(w.toCharArray(),w.length());

    }

}
