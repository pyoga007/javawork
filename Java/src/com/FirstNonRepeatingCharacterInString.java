package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacterInString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();
        Map<Character,Integer> charCount=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(charCount.containsKey(str.charAt(i))){
                charCount.put(str.charAt(i),charCount.get(str.charAt(i))+1);
            }
            else
                charCount.put(str.charAt(i),1);
        }
        for(int i=0;i<str.length();i++){
            if(charCount.get(str.charAt(i))==1){
                System.out.println("First Non Repeating Character is "+str.charAt(i));
                break;
            }
        }

    }
}
