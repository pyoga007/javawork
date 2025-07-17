package com;

import java.util.Scanner;

public class SumAndAverageOfElementsInAnArray {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements in the array ");
            arr[i]=s.nextInt();
        }
        int sum=0;
        double avg=0.0;
        for(int i:arr){
            sum+=i;
        }
        avg=(double)sum/(arr.length);

        System.out.println("The average and sum of array is "+avg+" && "+sum);
    }
}
