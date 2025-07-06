package com;

import java.util.HashMap;
import java.util.Map;

public class IteratingMap {
    public static void main(String[] args){
        Map<String,Integer> map=new HashMap<>();
        map.put("Yoga",28);
        map.put("Ilia",28);
        map.put("Tom Cruise",64);

        System.out.println(map);

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println("Key :"+entry.getKey()+ " Values :"+entry.getValue());
        }
    }
}
