package com.bullhead.rank.probsol.two;

import java.util.Scanner;

public class Solution {

    static void plusMinus(int[] arr) {
        int positive=0;
        int negative=0;
        int zero=0;
        for(int i : arr){
            if(i>0){
                positive++;
            }else if(i<0){
                negative++;
            }else{
                zero++;
            }
        }
        float arraySize=arr.length;
        System.out.format("%.6f%n",positive/arraySize);
        System.out.format("%.6f%n",negative/arraySize);
        System.out.format("%.6f%n",zero/arraySize);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
