package com;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInArray {
    public static void main(String[] args){
        int[] arr={1,4,3,2,11,5,6,32};
        Map<Integer,Integer> eleCount=new HashMap<>();
        boolean duplicate=false;
        for(int i=0;i<arr.length;i++){
            if(eleCount.containsKey(arr[i])){
                duplicate=true;
                break;
            }
            else
                eleCount.put(arr[i],1);
        }
        if(duplicate)
            System.out.println("Array Contains Duplicate!");
        else System.out.println("Array does not Contains Duplicate!");
    }
}
