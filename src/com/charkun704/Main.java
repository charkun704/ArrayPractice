package com.charkun704;
import java.util.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = getInts(5);
        int[] sorted = sortArr(arr);
        printArr(sorted);
    }

    public static int[] getInts(int arrSize){
        int [] arrInts = new int[arrSize];
        System.out.println("Enter "+arrSize+" integers.\r");
        for(int i=0;i<arrInts.length;i++){ arrInts[i] = sc.nextInt(); }
        return arrInts;
    }

    public static int[] sortArr(int[] unsorted){
        int[] sorted = Arrays.copyOf(unsorted, unsorted.length);
        boolean bool = true;
        int temp = 0;

        while(bool){
            bool = false;

            for(int i=0; i<sorted.length-1;i++){
                if(sorted[i]>sorted[i+1]){
                    temp = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = temp;
                    bool = true;
                }
            }
        }
        return sorted;
    }

    public static void printArr(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.println("Index "+i+" has "+arr[i]+"");
        }
    }
}
