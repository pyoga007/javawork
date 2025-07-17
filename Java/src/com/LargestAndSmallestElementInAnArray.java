package com;

import java.util.Scanner;

public class LargestAndSmallestElementInAnArray {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements in the array ");
            arr[i]=s.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i: arr){
            if(min>i)
                min=i;
            if(max<i)
                max=i;
        }
        System.out.println("Largest Number in an array "+max);
        System.out.println("Smallest Number in an array "+min);
    }
}
