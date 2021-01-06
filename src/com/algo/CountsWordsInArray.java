package com.algo;

import java.util.HashMap;
import java.util.Map;

public class CountsWordsInArray {

    public void countWords(String str [], int n){

        //Map to store key and count of the values
        HashMap<String,Integer> storeVal = new HashMap<>();

        for(int i=0; i<n; i++){
            if(storeVal.containsKey(str[i])){
                int get= storeVal.get(str[i]);
                storeVal.put(str[i],get+1);
                System.out.println("i::"+i+" get::"+get+" str[i] ::"+str[i]);
            }
            else {
                storeVal.put(str[i],1);
                System.out.println("i::"+i+" str[i] ::"+str[i]);
            }
        }

        Map.Entry<String,Integer> maxVal = null;

        for(Map.Entry<String,Integer> it:storeVal.entrySet()){
            System.out.println("Key::"+it.getKey()+" Val:::"+it.getValue());
            if(maxVal==null || it.getValue().compareTo(maxVal.getValue())>0){
                maxVal = it;

            }
        }
        System.out.println("Big Key::"+maxVal.getKey()+" Big Val:::"+maxVal.getValue());

    }

    public static void main(String[] args){
        CountsWordsInArray obj= new CountsWordsInArray();
        String strArr[] = {"test", "test", "india", "india", "usa","usa", "usa", "japan", "japan",
                             "japan", "japan"};
        int n = strArr.length;
        obj.countWords(strArr,n );
    }
}
