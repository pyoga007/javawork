package dsa;

import java.util.Scanner;

public class Anagram {

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        String s2=s.next();
        if(s1.length()!=s2.length())
            throw new RuntimeException("Not an Anagram");
        char[] freq=new char[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int count:freq){
            if(count!=0)
                throw new RuntimeException("Not an Anagram");
        }
        System.out.println("Both the strings s1 "+s1+" and s2 "+s2+" are Anagrams");
    }

}
