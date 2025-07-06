package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramCheckUsingHashMap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String ");
        String word1=sc.next();
        System.out.println("Enter second String ");
        String word2=sc.next();
        boolean anagram=true;
        if(word2.length()!=word1.length()){
            System.out.println("Not Anagram");
            return;
        }
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<word2.length();i++){
            if(map1.containsKey(word1.charAt(i))){
                map1.put(word1.charAt(i),map1.get(word1.charAt(i))+1);
            }
            else map1.put(word1.charAt(i),1);
            if(map2.containsKey(word2.charAt(i))){
                map2.put(word2.charAt(i),map2.get(word2.charAt(i))+1);
            }
            else map2.put(word2.charAt(i),1);
        }
        for(Map.Entry<Character,Integer> anagramMap:map1.entrySet()){
            if(anagramMap.getValue()!=map2.get(anagramMap.getKey()))
                anagram=false;
            break;
        }
        if(anagram)
            System.out.println("Anagram");
        else System.out.println("Not Anagram");
    }
}
