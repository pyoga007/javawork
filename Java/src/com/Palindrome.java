package com;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Word");
        String word=sc.next();
        String rev=word;
        StringBuilder builder=new StringBuilder(word);
        if(builder.reverse().toString().equals(rev)){
            System.out.println("Palindrome");
        }
        else System.out.println("Not a Palindrome");
    }
}
