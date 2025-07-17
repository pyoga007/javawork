package com;

import java.util.Scanner;

public class AscendingArray {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=s.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        System.out.println("Enter the elements in the array ");
        arr[i]=s.nextInt();
    }
    int min=0;
    for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
               min=arr[j];
               arr[j]=arr[i];
               arr[i]=min;
            }
        }
    }
    for(int i:arr){
        System.out.println(" "+i);
    }
}
}
