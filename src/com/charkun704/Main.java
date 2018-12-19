package com.charkun704;
import java.util.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    }

    public static int[] getInts(int arrSize){
        int [] arrInts = new int[arrSize];
        System.out.println("Enter "+arrSize+" integers.\r");
        for(int i=0;i<arrInts.length;i++){ arrInts[i] = sc.nextInt(); }
        return arrInts;
    }
}
