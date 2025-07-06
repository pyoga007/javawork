package com;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementsInAnArray {

    public static void main(String[] args){
        int[] arr={2,1,2,3,2,32};
        Map<Integer,Integer> freqMap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(freqMap.containsKey(arr[i])){
                freqMap.put(arr[i],freqMap.get(arr[i])+1);
            }
            else
                freqMap.put(arr[i],1);
        }
        System.out.println("Frequency of ELements in an array :"+freqMap);
    }
}
